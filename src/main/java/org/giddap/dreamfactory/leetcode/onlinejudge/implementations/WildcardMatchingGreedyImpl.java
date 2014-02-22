package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WildcardMatching;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time complexity: O(n^2)</li>
 * <li>Space complexity: O(1)</li>
 * <li>Two main cases:
 * <ul>
 * <li>p[j] != '*': s[i] == p[j] || p[j] == '?'</li>
 * <li>p[j] == '*': try match p[j + 1] against s[i] (from i to len)</li>
 * </ul>
 * </li>
 * <li>Thought Process: Greedy
 * </li>
 * </ul>
 */
public class WildcardMatchingGreedyImpl implements WildcardMatching {
    @Override
    public boolean isMatch(String s, String p) {
        final int sLen = s.length();
        final int pLen = p.length();
        int i = 0;
        int j = 0;
        int lastStar = -1;
        int lastMatched = 0;

        while (i < sLen) {
            while (j < pLen && p.charAt(j) == '*') {
                j++;
                lastStar = j - 1;
                lastMatched = i;

                if (j == pLen) { // p ends with all '*'
                    return true;
                }
            }

            if (j < pLen && (s.charAt(i) == p.charAt(j) || p.charAt(j) ==
                    '?')) {
                i++;
                j++;
            } else {
                if (lastStar == -1) {
                    return false;
                }
                j = lastStar + 1;
                lastMatched++;
                i = lastMatched;
            }
        }

        while (j < pLen && p.charAt(j) == '*') {
            j++;
        }
        return j == pLen;

//        final int sLen = s.length();
//        final int pLen = p.length();
//
//        // index to the word
//        int i = 0;
//
//        // index to the pattern
//        int j = 0;
//
//        // index to the last star
//        int lastStar = -1;
//
//        // last star-matched character in s
//        int sp = 0;
//
//        while (i < sLen) {
//            //one * and multiple *, same effect
//            while (j < pLen && p.charAt(j) == '*') {
//                lastStar = j;  //* match 0 character
//                j++;
//                sp = i;
//            }
//
//            if (j == pLen || (p.charAt(j) != s.charAt(i) && p.charAt(j) != '?')) {
//                if (lastStar < 0) {
//                    return false;
//                } else {
//                    j = lastStar + 1;
//                    sp++;
//                    i = sp;     // use * to match 1 character
//                }
//            } else {
//                i++;
//                j++;
//            }
//        }
//
//        while (j < pLen && p.charAt(j) == '*') {
//            j++;
//        }
//        return j == pLen;
    }
}
