package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreakII;

import java.util.*;

/**
 *
 */
public class WordBreakIIDpImpl implements WordBreakII {
    @Override
    public List<String> wordBreak(String s, Set<String> dict) {
        List<String> ret = new ArrayList<String>();
        final int len = s.length();
        if (len == 0) {
            return ret;
        }

        boolean[][] memo = new boolean[len + 1][len + 1];
        memo[0][0] = true;

        // initialize the first row
        for (int c = 1; c <= len; c++) {
            memo[0][c] = true;
        }

        // fill out memo
        for (int r = 1; r <= len; r++) {
            for (int i = (r == 1 ? 0 : 1); i <= r - 1; i++) {
                if (memo[i][r - 1]) {
                    for (int c = r; c <= len; c++) {
                        if (dict.contains(s.substring(r - 1, c))) {
                            memo[r][c] = true;
                        }
                    }
                    break;
                }
            }
        }

        // construct word breaks
        Map<Point, List<String>> allWrodBreaks = new HashMap<>();
        Deque<Point> stack = new ArrayDeque<>();
        for (int r = 1; r <= len; r++) {
            if (memo[r][len]) {
                stack.offerFirst(new Point(r, len));
            }
        }

        while (!stack.isEmpty()) {
            Point curr = stack.pollFirst();
            Point prev = new Point(curr.getRow() + 1, curr.getCol() + 1);

            String word = s.substring(curr.getRow() - 1, curr.getCol());
            if (allWrodBreaks.containsKey(prev)) {
                List<String> tmp = new ArrayList<>();
                for (String one : allWrodBreaks.get(prev)) {
                    tmp.add(word + " " + one);
                }
                allWrodBreaks.put(curr, tmp);
            } else {
                List<String> breaks = new ArrayList<>();
                breaks.add(word);
                allWrodBreaks.put(curr, breaks);
            }

            for (int i = 1; i < curr.getRow(); i++) {
                if (memo[i][curr.getRow() - 1]) {
                    stack.offerFirst(new Point(i, curr.getRow() - 1));
                }
            }
        }
        return allWrodBreaks.get(new Point(0, len));
    }

    private class Point {
        private final int row;
        private final int col;

        private Point(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (col != point.col) return false;
            if (row != point.row) return false;

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
