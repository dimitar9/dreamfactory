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
 * <li>Thought Process: DFS with Backtracking
 * </li>
 * </ul>
 */
public class WildcardMatchingRecursiveImpl implements WildcardMatching {
    @Override
    public boolean isMatch(String s, String p) {
        final int sLen = s.length();
        final int pLen = p.length();
        if (sLen == 0 && pLen == 0) {
            return true;
        }
        if (pLen == 0) {
            return sLen == 0;
        } else {
            if (p.charAt(0) != '*') {
                if (sLen > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?')) {
                    return isMatch(s.substring(1), p.substring(1));
                } else {
                    return false;
                }
            } else { // p starts with '*'
                int i = 0;
                while (i < pLen && p.charAt(i) == '*') {
                    i++;
                }
                if (i == pLen) { // p ends with all '*'
                    return true;
                }
                int j = 0;
                while (j < sLen) {
                    if (isMatch(s.substring(j), p.substring(i))) {
                        return true;
                    }
                    j++;
                }
            }
            return false;
        }
    }
}
