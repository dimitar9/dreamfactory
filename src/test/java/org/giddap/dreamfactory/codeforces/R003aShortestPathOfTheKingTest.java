package org.giddap.dreamfactory.codeforces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 ** Sample test(s)
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
 */
public class R003aShortestPathOfTheKingTest {
    private R003aShortestPathOfTheKing solution =
            new R003aShortestPathOfTheKing();

    @Test
    public void small01() {
        String start = "a8";
        String end = "h1";

        String[] expected = {
                "7",
                "RD",
                "RD",
                "RD",
                "RD",
                "RD",
                "RD",
                "RD"
        };

        String[] actual = solution.solve(start, end);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
