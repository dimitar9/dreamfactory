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
}
