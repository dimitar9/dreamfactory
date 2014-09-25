package org.giddap.dreamfactory.codeforces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class P002bTheLeastRoundWayTest {

    private P002bTheLeastRoundWay solution = new P002bTheLeastRoundWay();

    @Test
    public void small01() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[] expected = {
                "0",
                "DDRR"
        };

        String[] actual = solution.solve(input);

        assertEquals(expected.length, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void small02() {
        int[][] input = {
                {4, 5, 5},
                {4, 5, 5},
                {7, 5, 9}
        };

        String[] expected = {
                "1",
                "DDRR"
        };

        String[] actual = solution.solve(input);

        assertEquals(expected.length, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void small03() {
        int[][] input = {
                {10,8,6,5,9,8,2,5,3,2},
                {3,1,8,6,8,10,5,5,7,8},
                {5,9,7,7,4,9,7,2,5,2},
                {5,9,9,5,4,2,6,6,8,1},
                {10,6,9,9,10,5,6,3,5,9},
                {6,7,10,3,1,4,3,6,7,6},
                {10,10,4,7,4,4,8,6,7,4},
                {10,5,8,2,2,7,4,4,1,4},
                {8,4,6,10,10,6,1,3,3,1},
                {9,9,7,2,9,5,1,8,6,3}
        };

        String[] expected = {
                "1",
                "DRDDDRRDDDRRDRDRRR"
        };

        String[] actual = solution.solve(input);

        assertEquals(expected.length, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void small04() {
        int[][] input = {
                {10,8,6,5,9,8,2,5,3,2},
                {3,1,8,6,8,10,5,5,7,8},
                {5,9,7,7,4,9,7,2,5,2},
                {5,9,9,5,4,2,6,6,8,1},
                {10,6,9,9,10,5,6,3,5,9},
                {6,7,10,3,1,4,3,6,7,6},
                {10,10,4,7,4,4,8,6,7,4},
                {10,5,8,2,2,7,4,4,1,4},
                {8,4,6,10,10,6,1,3,3,1},
                {9,9,7,2,9,5,1,8,6,3}
        };

        String[] expected = {
                "1",
                "DRDDDRRDDDRRDRDRRR"
        };

        String[] actual = solution.solve(input);

        assertEquals(expected.length, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }
}
