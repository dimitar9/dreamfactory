package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q097InterleavingString;

/**
 * Passed Judge Small but failed with TLE on Judge Large
 */
public class Q097InterleavingStringRecursiveImpl implements Q097InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        final int s1Len = s1.length();
        final int s2Len = s2.length();
        final int s3Len = s3.length();

        if (s3Len == 0) {
            if (s1Len != 0 || s2Len != 0) {
                return false;
            }
            return true;
        }

        char c = s3.charAt(0);

        boolean ret = false;
        if (s1Len > 0 && c == s1.charAt(0)) {
            ret = isInterleave(s1.substring(1), s2, s3.substring(1));
        }
        if (ret) {
            return ret;
        }

        if (s2Len > 0 && c == s2.charAt(0)) {
            ret = isInterleave(s1, s2.substring(1), s3.substring(1));
        }
        return ret;
    }
}
