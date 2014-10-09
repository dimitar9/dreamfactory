package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.InterleavingString;

/**
 * Passed Judge Small but failed with TLE on Judge Large
 */
public class InterleavingStringRecursiveImpl implements InterleavingString {

    int[][] memo;

    public boolean isInterleave(String s1, String s2, String s3) {
        memo = new int[s1.length() + 1][s2.length() + 1];
        return calculate(s1, s2, s3);
    }

    public boolean calculate(String s1, String s2, String s3) {
        final int l1 = s1.length();
        final int l2 = s2.length();
        final int l3 = s3.length();

        if (memo[l1][l2] == 1) {
            return true;
        } else if (memo[l1][l2] == 2) {
            return false;
        }

        if (l1 + l2 != l3) {
            return false;
        }

        if (l3 == 0) {
            return true;
        }

        boolean ret = false;

        if (l1 > 0 && s1.charAt(0) == s3.charAt(0)) {
            ret = ret || calculate(s1.substring(1), s2, s3.substring(1));
        }

        if (ret) {
            return ret;
        }

        if (l2 > 0 && s2.charAt(0) == s3.charAt(0)) {
            ret = ret || calculate(s1, s2.substring(1), s3.substring(1));
        }

        memo[l1][l2] = ret ? 1 : 2;

        return ret;
    }
}
