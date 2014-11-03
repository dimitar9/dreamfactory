package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RegularExpressionMatchingBacktrackingImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RegularExpressionMatchingDPImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RegularExpressionMatchingRecursionImpl;
import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchingTest {
    RegularExpressionMatching rem = new RegularExpressionMatchingBacktrackingImpl();
    RegularExpressionMatching rem2 = new RegularExpressionMatchingDPImpl();
    RegularExpressionMatching rem1 = new RegularExpressionMatchingRecursionImpl();

    @Test
    public void small01() {
        Assert.assertTrue(rem.isMatch("aa", "a*"));
    }

    @Test
    public void small02() {
        Assert.assertFalse(rem.isMatch("aa", "a"));
    }

    @Test
    public void small03() {
        Assert.assertTrue(rem.isMatch("aa", "aa"));
    }

    @Test
    public void small04() {
        Assert.assertFalse(rem.isMatch("aaa", "aa"));
    }

    @Test
    public void small05() {
        Assert.assertTrue(rem.isMatch("aa", ".*"));
    }

    @Test
    public void small06() {
        Assert.assertTrue(rem.isMatch("ab", ".*"));
    }

    @Test
    public void small07() {
        Assert.assertTrue(rem.isMatch("aab", "c*a*b"));
    }

    @Test
    public void small08() {
        Assert.assertFalse(rem.isMatch("a", ".*..a*"));
    }

    @Test
    public void small09() {
        Assert.assertTrue(rem.isMatch("aaa", "a*a"));
    }

    @Test
    public void small10() {
        Assert.assertFalse(rem.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    }
}
