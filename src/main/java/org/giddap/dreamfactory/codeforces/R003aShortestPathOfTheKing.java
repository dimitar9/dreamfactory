package org.giddap.dreamfactory.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * http://codeforces.com/problemset/problem/3/A
 * <p/>
 * The king is left alone on the chessboard. In spite of this loneliness, he
 * doesn't lose heart, because he has business of national importance. For
 * example, he has to pay an official visit to square t. As the king is not in
 * habit of wasting his time, he wants to get from his current position s to
 * square t in the least number of moves. Help him to do this.
 * <p/>
 * In one move the king can get to the square that has a common side or a common
 * vertex with the square the king is currently in (generally there are 8
 * different squares he can move to).
 * <p/>
 * Input The first line contains the chessboard coordinates of square s, the
 * second line — of square t.
 * <p/>
 * Chessboard coordinates consist of two characters, the first one is a lowercase
 * Latin letter (from a to h) (columns), the second one is a digit from 1 to 8
 * (rows).
 * <p/>
 * Output In the first line print n — minimum number of the king's moves. Then in
 * n lines print the moves themselves. Each move is described with one of the 8:
 * L, R, U, D, LU, LD, RU or RD.
 * <p/>
 * L, R, U, D stand respectively for moves left, right, up and down (according to
 * the picture), and 2-letter combinations stand for diagonal moves. If the
 * answer is not unique, print any of them.
 * <p/>
 * <pre>
 * Sample test(s)
 * input
 * a8
 * h1
 *
 * output
 * 7
 * RD
 * RD
 * RD
 * RD
 * RD
 * RD
 * RD
 * </pre>
 */
public class R003aShortestPathOfTheKing implements Runnable {

    private final static int[][] MOVES = {
            {1, 0}, // UP
            {-1, 0}, // DOWN
            {0, 1}, // RIGHT
            {0, -1}, // LEFT
            {1, 1}, // RU
            {1, -1}, // LU
            {-1, 1}, // RD
            {-1, -1} // LD
    };
    private final static String[] MOVE_NAMES = {"U", "D", "R", "L", "RU", "LU", "RD", "LD"};
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public static void main(String[] args) {
        new Thread(new R003aShortestPathOfTheKing()).run();
    }

    String[] solve(String start, String end) {

        if (start.equals(end)) {
            return new String[]{"0"};
        }

        Cell startCell = new Cell(Integer.parseInt(start.charAt(1) + "") - 1,
                start.charAt(0) - 'a', null, "");
        Cell endCell = new Cell(Integer.parseInt(end.charAt(1) + "") - 1,
                end.charAt(0) - 'a', null, "");

        Queue<Cell> currLevel = new LinkedList<>();
        currLevel.offer(startCell);

        Queue<Cell> nextLevel = new LinkedList<>();

        Set<Cell> visitedCells = new HashSet<>();

        int numOfLevels = 1;

        boolean found = false;

        while (!currLevel.isEmpty()) {
            Cell currentCell = currLevel.poll();

            int i = 0;
            for (int[] move : MOVES) {
                if ((0 <= currentCell.row + move[0] && currentCell.row + move[0] <= 7)
                        && (0 <= currentCell.col + move[1] && currentCell.col + move[1] <= 7)) {
                    Cell newCell = new Cell(currentCell.row + move[0],
                            currentCell.col + move[1], currentCell, MOVE_NAMES[i]);

                    if (newCell.equals(endCell)) {
                        endCell.parent = currentCell;
                        endCell.priveousMove = MOVE_NAMES[i];
                        found = true;
                        break;
                    }

                    if (!visitedCells.contains(newCell)) {
                        nextLevel.offer(newCell);
                        visitedCells.add(newCell);
                    }
                }
                i++;
            }

            if (found) {
                break;
            }

            if (currLevel.isEmpty()) {
                currLevel = nextLevel;
                nextLevel = new LinkedList<>();
                numOfLevels++;
            }

        }

        List<String> answer = new LinkedList<>();
        answer.add(numOfLevels + "");

        Cell thisCell = endCell;
        while (thisCell.parent != null) {
            answer.add(1, thisCell.priveousMove);
            thisCell = thisCell.parent;
        }

        String[] result = new String[answer.size()];
        int i = 0;
        for (String w : answer) {
            result[i++] = w;
        }

        return result;
    }

    @Override
    public void run() {
        PrintWriter out = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            String[] solution = solve(nextToken(), nextToken());
            for (String sol : solution) {
                out.println(sol);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            reader = null;
            out.close();
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    private static class Cell {
        final int row;
        final int col;
        Cell parent;
        String priveousMove;

        private Cell(int row, int col, Cell parent, String priveousMove) {
            this.row = row;
            this.col = col;
            this.parent = parent;
            this.priveousMove = priveousMove;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Cell cell = (Cell) o;

            if (col != cell.col) return false;
            if (row != cell.row) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = row;
            result = 31 * result + col;
            return result;
        }
    }
}
