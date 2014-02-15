package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q079WordSearchBacktrackingImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q079WordSearchTest {
    private Q079WordSearch solution = new Q079WordSearchBacktrackingImpl();

    @Test
    public void small01() {
        char[] a = {'a'};
        char[][] input = new char[1][1];
        input[0] = a;

        assertTrue(solution.exist(input, "a"));
    }

    @Test
    public void small02() {
        char[] aa = {'a', 'a'};
        char[][] input = new char[1][2];
        input[0] = aa;

        assertFalse(solution.exist(input, "aaa"));
    }

    @Test
    public void small03() {
        char[] aa = {'a', 'b'};
        char[][] input = new char[1][2];
        input[0] = aa;

        assertTrue(solution.exist(input, "ba"));
    }

    @Test
    public void small04() {
        char[] row0 = {'a', 'b'};
        char[] row1 = {'c', 'd'};
        char[][] input = new char[2][2];
        input[0] = row0;
        input[1] = row1;

        assertFalse(solution.exist(input, "abcd"));
    }

    @Test
    public void small05() {
        char[] row0 = {'A', 'B', 'C', 'E'};
        char[] row1 = {'S', 'F', 'C', 'S'};
        char[] row2 = {'A', 'D', 'E', 'E'};
        char[][] input = new char[3][4];
        input[0] = row0;
        input[1] = row1;
        input[2] = row2;

        assertTrue(solution.exist(input, "ABCCED"));
    }
}
