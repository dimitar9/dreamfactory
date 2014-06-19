package org.giddap.dreamfactory.clrs3ed;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem0204FindInversionsTest {
    private Problem0204FindInversions solution = new Problem0204FindInversions();

    @Test
    public void small01() {
        assertEquals(5, solution.countInversions(new int[]{2, 3, 8, 6, 1}));
    }

    @Test
    public void small02() {
        assertEquals(6, solution.countInversions(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void small03() {
        assertEquals(1, solution.countInversions(new int[]{2, 1}));
    }

    @Test
    public void small04() {
        assertEquals(3, solution.countInversions(new int[]{3, 2, 1}));
    }
}
