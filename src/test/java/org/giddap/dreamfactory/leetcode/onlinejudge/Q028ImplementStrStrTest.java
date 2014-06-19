package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q028ImplementStrStrImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 *
 */
public class Q028ImplementStrStrTest {
    private Q028ImplementStrStr solution = new Q028ImplementStrStrImpl();

    @Test
    public void small01() {
        final String haystack = "inahaystackneedleina";
        final String needle = "needle";

        assertEquals("needleina", solution.strStr(haystack, needle));
    }

    @Test
    public void small02() {
        final String haystack = "aaa";
        final String needle = "aaa";

        assertEquals("aaa", solution.strStr(haystack, needle));
    }

    @Test
    public void small03() {
        final String haystack = "mississippi";
        final String needle = "a";

        assertNull(solution.strStr(haystack, needle));
    }
}
