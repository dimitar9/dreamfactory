package org.giddap.dreamfactory.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * http://codeforces.com/problemset/problem/2/B
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
    String[] solve(int[][] grid) {
        final int maxRow = grid.length - 1;
        final int maxCol = grid[0].length - 1;
        String[] output = new String[2];
        output[0] = Long.MAX_VALUE + "";
        output[1] = "";
        solve(grid, maxRow, maxCol, 0, 0, 1, "", output);
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
        long i = 0;
        while (num > 0 && num % 10 == 0) {
            num /= 10;
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
                    numbers[i] = Integer.parseInt(stringNumber.trim());
                    j++;
                }
                grid[i] = numbers;
                i++;
            }

            out.println(solve(grid));
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
