package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.SurroundedRegionsDfsImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SurroundedRegionsTest {
    private SurroundedRegions solution = new SurroundedRegionsDfsImpl();

    @Test
    public void small01() {
        solution.solve(new char[][]{});
    }

    @Test
    public void small02() {
        //["OXXOX","XOOXO","XOXOX","OXOOO","XXOXO"]
        char[][] input = new char[5][5];

        char[] line0 = new char[]{'O', 'X', 'X', 'O', 'X'};
        char[] line1 = new char[]{'X', 'O', 'O', 'X', 'O'};
        char[] line2 = new char[]{'X', 'O', 'X', 'O', 'X'};
        char[] line3 = new char[]{'O', 'X', 'O', 'O', 'O'};
        char[] line4 = new char[]{'X', 'X', 'O', 'X', 'O'};

        input[0] = line0;
        input[1] = line1;
        input[2] = line2;
        input[3] = line3;
        input[4] = line4;

        //["OXXOX","XXXXO","XXXOX","OXOOO","XXOXO"]
        char[][] expected = new char[5][5];

        char[] eline0 = new char[]{'O', 'X', 'X', 'O', 'X'};
        char[] eline1 = new char[]{'X', 'X', 'X', 'X', 'O'};
        char[] eline2 = new char[]{'X', 'X', 'X', 'O', 'X'};
        char[] eline3 = new char[]{'O', 'X', 'O', 'O', 'O'};
        char[] eline4 = new char[]{'X', 'X', 'O', 'X', 'O'};

        expected[0] = eline0;
        expected[1] = eline1;
        expected[2] = eline2;
        expected[3] = eline3;
        expected[4] = eline4;

        solution.solve(input);

        for (int y = 0; y < input.length; y++) {
            for (int x = 0; x < input[0].length; x++) {
                assertEquals(expected[y][x], input[y][x]);
            }
        }
    }

    @Test
    public void small03() {
        //["XXXXX","XOOOX","XXOOX","XXXOX","XOXXX"]
        char[][] input = new char[5][5];

        char[] line0 = new char[]{'X', 'X', 'X', 'X', 'X'};
        char[] line1 = new char[]{'X', 'O', 'O', 'O', 'X'};
        char[] line2 = new char[]{'X', 'X', 'O', 'O', 'X'};
        char[] line3 = new char[]{'X', 'X', 'X', 'O', 'X'};
        char[] line4 = new char[]{'X', 'O', 'X', 'X', 'X'};

        input[0] = line0;
        input[1] = line1;
        input[2] = line2;
        input[3] = line3;
        input[4] = line4;

        //["XXXXX","XXXXX","XXXXX","XXXXX","XOXXX"]
        char[][] expected = new char[5][5];

        char[] eline0 = new char[]{'X', 'X', 'X', 'X', 'X'};
        char[] eline1 = new char[]{'X', 'X', 'X', 'X', 'X'};
        char[] eline2 = new char[]{'X', 'X', 'X', 'X', 'X'};
        char[] eline3 = new char[]{'X', 'X', 'X', 'X', 'X'};
        char[] eline4 = new char[]{'X', 'O', 'X', 'X', 'X'};

        expected[0] = eline0;
        expected[1] = eline1;
        expected[2] = eline2;
        expected[3] = eline3;
        expected[4] = eline4;

        solution.solve(input);

        for (int y = 0; y < input.length; y++) {
            for (int x = 0; x < input[0].length; x++) {
                assertEquals(expected[y][x], input[y][x]);
            }
        }
    }
}
