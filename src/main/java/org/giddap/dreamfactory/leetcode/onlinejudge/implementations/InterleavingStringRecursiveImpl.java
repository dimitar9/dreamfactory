package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.InterleavingString;

/**
 * Backtracking solution.
 * Algorithm:
 * if (s1[i] == s3[k])
 *      move both pointers (s1 and s3) ahead by one;
 * if (s2[j] == s3[k])
 *      move both pointers (s2 and s3) ahead by one;
 */
public class InterleavingStringRecursiveImpl implements InterleavingString {
    @Override
    public boolean isInterleave(String s1, String s2, String s3) {
        final int l1 = s1.length();
        final int l2 = s2.length();
        final int l3 = s3.length();

        if (l1 + l2 != l3) {
            return false;
        }

        if (l1 == 0 && l2 == 0 && l3 == 0) {
            return true;
        }

        boolean ret = false;
        if (l1 != 0 && s1.charAt(0) == s3.charAt(0)) {
            ret |= isInterleave(s1.substring(1), s2, s3.substring(1));
        }

        if (ret) {
            return ret;
        }

        if (l2 != 0 && s2.charAt(0) == s3.charAt(0)) {
            ret |= isInterleave(s1, s2.substring(1), s3.substring(1));
        }
        return ret;
    }
}
