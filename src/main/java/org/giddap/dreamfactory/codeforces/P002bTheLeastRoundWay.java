package org.giddap.dreamfactory.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * http://codeforces.com/problemset/problem/2/B
 *
 * http://codeforces.com/problemset/status/2/problem/B
 * http://codeforces.com/blog/entry/109
 * http://www.darrensun.com/codeforces-round-2/
 * http://helloacm.com/coding-exercise-c-codeforces-b-the-least-round-way-dynamic-programming/
 *
 * <p/>
 * There is a square matrix n × n, consisting of non-negative integer numbers.
 * You should find such a way on it that
 * <p/>
 * * starts in the upper left cell of the matrix;
 * * each following cell is to the right or down from the current cell;
 * * the way ends in the bottom right cell.
 * <p/>
 * Moreover, if we multiply together all the numbers along the way, the result
 * should be the least "round". In other words, it should end in the least
 * possible number of zeros.
 * <p/>
 * Input
 * <p/>
 * The first line contains an integer number n (2 ≤ n ≤ 1000), n is the size
 * of the matrix. Then follow n lines containing the matrix elements
 * (non-negative integer numbers not exceeding 109).
 * <p/>
 * Output
 * <p/>
 * In the first line print the least number of trailing zeros. In the second
 * line print the correspondent way itself.
 * <p/>
 * <pre>
 * Sample test(s)
 * input
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * output
 * 0
 * DDRR
 * </pre>
 */
public class P002bTheLeastRoundWay implements Runnable {

    public static void main(String[] args) {
        new Thread(new P002bTheLeastRoundWay()).run();
    }

    String[] solve(int[][] grid) {
        final int maxRow = grid.length - 1;
        final int maxCol = grid[0].length - 1;

        long[][] countsTwo = new long[maxRow + 1][maxCol + 1];
        long[][] countsFive = new long[maxRow + 1][maxCol + 1];

        boolean hasZero = false;

        for (int i = 0; i <= maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                final int value = grid[i][j];
                if (value == 0) {
                    hasZero = true;
                }
                countsTwo[i][j] = countNumberOfFactorOfTwo(value);
                countsFive[i][j] = countNumberOfFactorOfFive(value);
            }
        }

        StringBuilder path = new StringBuilder();

        int minNumberOfTrailingZeros = Integer.MAX_VALUE;

        // Top line
        for (int i = 1; i <= maxCol; i++) {
            countsTwo[0][i] += countsTwo[0][i - 1];
            countsFive[0][i] += countsFive[0][i - 1];
        }

        // Left-most row
        // Top line
        for (int i = 1; i <= maxRow; i++) {
            countsTwo[i][0] += countsTwo[i - 1][0];
            countsFive[i][0] += countsFive[i - 1][0];
        }

        // Remaining cells
        for (int i = 1; i <= maxRow; i++) {
            for (int j = 1; j < maxCol; j++) {
                countsTwo[i][j] += Math.min(countsTwo[i - 1][j], countsTwo[i][j - 1]);
                countsFive[i][j] += Math.min(countsFive[i - 1][j], countsFive[i][j - 1]);
            }
        }


        // Construct the output
        String[] output = new String[2];
        output[0] = Long.MAX_VALUE + "";
        output[1] = "";
        return output;
    }

    private void solve(int[][] grid,
                       final int maxRow,
                       final int maxCol,
                       final int currRow,
                       final int currCol,
                       final long currMulti,
                       String currSteps,
                       String[] output) {
        if (maxRow == currRow && maxCol == currCol) {
            long finalMulti = grid[maxRow][maxCol] * currMulti;
            long numberOfTrailingZeros = countTrailingZeros(finalMulti);
            if (numberOfTrailingZeros < Long.parseLong(output[0])) {
                output[0] = numberOfTrailingZeros + "";
                output[1] = currSteps;
            }
            return;
        } else {
            final long tmp = currMulti * grid[currRow][currCol];
            if (countTrailingZeros(tmp) >= Long.parseLong(output[0])) {
                return;
            }
            if (currRow + 1 <= maxRow) {
                solve(grid,
                        maxRow,
                        maxCol,
                        currRow + 1,
                        currCol,
                        currMulti * grid[currRow][currCol],
                        currSteps + "D",
                        output);
            }

            if (currCol + 1 <= maxCol) {
                solve(grid,
                        maxRow,
                        maxCol,
                        currRow,
                        currCol + 1,
                        currMulti * grid[currRow][currCol],
                        currSteps + "R",
                        output);
            }
        }
    }

    private long countTrailingZeros(long num) {
        return findNumberOfFactor(num, 10);
    }

    private long countNumberOfFactorOfFive(long num) {
        return findNumberOfFactor(num, 5);
    }

    private long countNumberOfFactorOfTwo(long num) {
        return findNumberOfFactor(num, 2);
    }

    private long findNumberOfFactor(long num, final long base) {
        long i = 0;
        while (num > 0 && num % base == 0) {
            num /= base;
            i++;
        }
        return i;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        PrintWriter out = null;
        int[][] grid = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            final int numberOfLines = Integer.parseInt(br.readLine().trim());
            grid = new int[numberOfLines][];

            int i = 0;
            String line = null;
            while ((line = br.readLine()) != null && i < numberOfLines) {
                String[] stringNumbers = (line.trim()).split(" ");
                int[] numbers = new int[stringNumbers.length];
                int j = 0;
                for (String stringNumber : stringNumbers) {
                    numbers[j++] = Integer.parseInt(stringNumber.trim());
                }
                grid[i++] = numbers;
            }

            String[] solution = solve(grid);
            for (String sol : solution) {
                out.println(sol);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            br = null;
            out.close();
        }
    }
}
