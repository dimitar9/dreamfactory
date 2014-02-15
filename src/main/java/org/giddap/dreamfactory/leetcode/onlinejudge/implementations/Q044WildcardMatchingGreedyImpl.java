package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q044WildcardMatching;

/**
 *
 */
public class Q044WildcardMatchingGreedyImpl implements Q044WildcardMatching {
    @Override
    public boolean isMatch(String s, String p) {

        final int sLen = s.length();
        final int pLen = p.length();

        // index to the word
        int i = 0;

        // index to the pattern
        int j = 0;

        // index to the last star
        int lastStar = -1;

        // last star-matched character in s
        int sp = 0;

        while (i < sLen) {
            //one * and multiple *, same effect
            while (j < pLen && p.charAt(j) == '*') {
                lastStar = j;  //* match 0 character
                j++;
                sp = i;
            }

            if (j == pLen || (p.charAt(j) != s.charAt(i) && p.charAt(j) != '?')) {
                if (lastStar < 0) {
                    return false;
                } else {
                    j = lastStar + 1;
                    sp++;
                    i = sp;     // use * to match 1 character
                }
            } else {
                i++;
                j++;
            }
        }

        while (j < pLen && p.charAt(j) == '*') {
            j++;
        }
        return j == pLen;
    }
}
