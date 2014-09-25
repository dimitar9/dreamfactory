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
public class R004aShortestPathOfTheKingTest {
    private R004aShortestPathOfTheKing solution =
            new R004aShortestPathOfTheKing();

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

        String[] actual = solution.calculateKingsMoves(start, end);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
