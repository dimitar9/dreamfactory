package org.giddap.dreamfactory.cc150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Q0102ReverseStringTest {
    private Q0102ReverseString solution = new Q0102ReverseString();

    @Test
    public void small01() {
        String input = "world cup";
        assertEquals(new StringBuilder(input).reverse().toString(), solution.reverse(input));
    }

    @Test
    public void small02() {
        String input = "aaa bbb cdcdc";
        assertEquals(new StringBuilder(input).reverse().toString(), solution.reverse(input));
    }
}
