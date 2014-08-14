package org.giddap.dreamfactory.codeforces;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class P001cAncientBerlandCircusTest {

    private P001cAncientBerlandCircus problem = new P001cAncientBerlandCircus();

    @Test
    public void small01() {
        Double expected = Double.parseDouble("1.00000000");

        assertTrue(Math.abs(expected - problem.solve(
                new Point(Double.parseDouble("0.000000"), Double.parseDouble("0.000000")),
                new Point(Double.parseDouble("1.000000"), Double.parseDouble("1.000000")),
                new Point(Double.parseDouble("0.000000"), Double.parseDouble("1.000000"))
        )) <= 0.0000001);
    }
}
