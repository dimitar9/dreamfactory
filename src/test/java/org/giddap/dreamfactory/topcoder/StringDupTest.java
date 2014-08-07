package org.giddap.dreamfactory.topcoder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringDupTest {

    private StringDup solution = new StringDup();

    @Test
    public void small01() {
        assertEquals('c', solution.getMax("aaiicccnn"));
    }

    @Test
    public void small02() {
        assertEquals('a', solution.getMax("aabbccdd"));
    }

    @Test
    public void small03() {
        assertEquals('2', solution.getMax("ab2sbf2dj2skl"));
    }
}
