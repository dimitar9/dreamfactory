package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q044WildcardMatching;

public class Q044WildcardMatchingRecursiveImpl implements Q044WildcardMatching {
    @Override
    public boolean isMatch(String s, String p) {
        final int sLen = s.length();
        final int pLen = p.length();

        if (sLen == 0 && pLen == 0) {
            return true;
        }

        if (pLen == 0 && sLen > 0) {
            return false;
        }

        int i = 0;
        if (p.charAt(i) == '*') {//return true;
            while (i < pLen && p.charAt(i) == '*') {
                i++;
            }
            if (i == pLen) {
                return true;
            }
            int j = 0;
            while (j < sLen && !isMatch(s.substring(j), p.substring(i))) {
                j++;
            }
            return j != sLen;
        } else if (sLen > 0 && pLen > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?')) {
            return isMatch(s.substring(1), p.substring(1));
        } else {
            return false;
        }
    }
}
