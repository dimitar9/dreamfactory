package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RegularExpressionMatchingBacktrackingImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RegularExpressionMatchingDPImpl;
import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchingTest {
    private RegularExpressionMatching solution = new RegularExpressionMatchingBacktrackingImpl();
    private RegularExpressionMatching solution3 = new RegularExpressionMatchingDPImpl();

    @Test
    public void small01() {
        Assert.assertTrue(solution.isMatch("aa", "a*"));
    }

    @Test
    public void small02() {
        Assert.assertFalse(solution.isMatch("aa", "a"));
    }

    @Test
    public void small03() {
        Assert.assertTrue(solution.isMatch("aa", "aa"));
    }

    @Test
    public void small04() {
        Assert.assertFalse(solution.isMatch("aaa", "aa"));
    }

    @Test
    public void small05() {
        Assert.assertTrue(solution.isMatch("aa", ".*"));
    }

    @Test
    public void small06() {
        Assert.assertTrue(solution.isMatch("ab", ".*"));
    }

    @Test
    public void small07() {
        Assert.assertTrue(solution.isMatch("aab", "c*a*b"));
    }

    @Test
    public void small08() {
        Assert.assertFalse(solution.isMatch("a", ".*..a*"));
    }

    @Test
    public void small09() {
        Assert.assertTrue(solution.isMatch("aaa", "a*a"));
    }

    @Test
    public void small10() {
        Assert.assertFalse(solution.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    }
}
