package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RegularExpressionMatchingDPImpl;
import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchingTest {
    //    RegularExpressionMatching rem = new RegularExpressionMatchingBacktrackingImpl();
    RegularExpressionMatching rem = new RegularExpressionMatchingDPImpl();

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
}
