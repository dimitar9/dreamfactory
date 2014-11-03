package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RegularExpressionMatching;

/**
 *
 */
public class RegularExpressionMatchingRecursionImpl implements RegularExpressionMatching {
    @Override
    public boolean isMatch(String s, String p) {
        final int sLen = s.length();
        final int pLen = p.length();
        char sc = sLen > 0 ? s.charAt(0) : '\0';
        char pc = pLen > 0 ? p.charAt(0) : '\0';
        char pc2 = pLen > 1 ? p.charAt(1) : '\0';


        if ((sLen == 0 && pLen == 0) || (pLen == 2 && pc2 == '*')) {
            // If both strings are empty
            // or p has '_*'
            return true;
        } else if (pLen == 0) {
            // if p is empty but s is not
            return false;
        } else if (sLen == 0) {
            // if s is empty but p is not
            if (pc2 == '*') {
                return isMatch("", p.substring(2));
            } else {
                return false;
            }
        } else {
            // neither string is empty
            if (sc == pc || pc == '.') {
                if (pc2 == '*') {
                    return isMatch(s.substring(1), p) // match more
                            || isMatch(s.substring(1), p.substring(2)) // match once
                            || isMatch(s, p.substring(2)); // match zero
                } else {
                    // advance one char for both
                    return isMatch(s.substring(1), p.substring(1));
                }
            } else {
                if (pc2 == '*') {
                    // skip the '_*' part
                    return isMatch(s, p.substring(2));
                }
            }
            return false;
        }
    }
}
