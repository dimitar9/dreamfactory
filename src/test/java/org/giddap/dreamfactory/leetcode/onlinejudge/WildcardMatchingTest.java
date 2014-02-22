package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WildcardMatchingGreedyImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Some examples:
 * isMatch("aa","a") ? false
 * isMatch("aa","aa") ? true
 * isMatch("aaa","aa") ? false
 * isMatch("aa", "*") ? true
 * isMatch("aa", "a*") ? true
 * isMatch("ab", "?*") ? true
 * isMatch("aab", "c*a*b") ? false
 */
public class WildcardMatchingTest {
    //    private WildcardMatching solution = new WildcardMatchingDPImpl();
    private WildcardMatching solution = new WildcardMatchingGreedyImpl();
//    private WildcardMatching solution = new WildcardMatchingRecursiveImpl();

    @Test
    public void small01() {
        assertFalse(solution.isMatch("aa", "a"));
    }

    @Test
    public void small02() {
        assertTrue(solution.isMatch("aa", "aa"));
    }

    @Test
    public void small03() {
        assertFalse(solution.isMatch("aaa", "aa"));
    }

    @Test
    public void small04() {
        assertTrue(solution.isMatch("aaa", "*"));
    }

    @Test
    public void small05() {
        assertTrue(solution.isMatch("aaa", "a*"));
    }

    @Test
    public void small06() {
        assertTrue(solution.isMatch("aaa", "?a*"));
    }

    @Test
    public void small07() {
        assertFalse(solution.isMatch("aab", "c*a*b"));
    }

    @Test
    public void small08() {
        assertTrue(solution.isMatch("", ""));
    }

    @Test
    public void small09() {
        assertTrue(solution.isMatch("", "*"));
    }

    @Test
    public void small10() {
        assertTrue(solution.isMatch("a", "a*"));
    }

    @Test
    public void small11() {
        assertTrue(solution.isMatch("hi", "*?"));
    }

    @Test
    public void small12() {
        assertTrue(solution.isMatch("c", "*?*"));
    }

    @Test
    public void small13() {
        assertFalse(solution.isMatch("abaaaa", "?a*?*a"));
    }

    @Test
    public void small14() {
        assertTrue(solution.isMatch("abadabadabadeabecd", "*ab?c*d"));
    }

    @Test
    public void small15() {
        assertTrue(solution.isMatch("abcdef", "*a?c*f"));
    }

    @Test
    public void small16() {
        assertFalse(solution.isMatch("a", "*aa"));
    }

    @Test
    public void small17() {
        assertFalse(solution.isMatch("babbbbaabababaabbababaababaabbaabababbaaababbababaaaaaabbabaaaabababbabbababbbaaaababbbabbbbbbbbbbaabbb",
                "b**bb**a**bba*b**a*bbb**aba***babbb*aa****aabb*bbb***a"));
    }
}
