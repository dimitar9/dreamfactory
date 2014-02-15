package org.giddap.dreamfactory.cc150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q0105StringCompressionTest {
    private Q0105StringCompression solution = new Q0105StringCompression();

    @Test
    public void small01() {
        String word = "aabcccccaaa";
        String expected = "a2b1c5a3";
        assertEquals(expected, solution.compressString(word));
    }

    @Test
    public void small02() {
        String word = "abcde";
        String expected = "abcde";
        assertEquals(expected, solution.compressString(word));
    }

    @Test
    public void small03() {
        String word = "aaabbccaaadd";
        String expected = "a3b2c2a3d2";
        assertEquals(expected, solution.compressString(word));
    }
}
