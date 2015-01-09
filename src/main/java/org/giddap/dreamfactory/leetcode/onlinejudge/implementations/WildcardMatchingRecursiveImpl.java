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
        final int m = s.length();
        final int n = p.length();
        if (n == 0) {
            return m == 0;
        } else {
            char cs = m > 0 ? s.charAt(0) : '\0';
            char cp = p.charAt(0);
            if (cp != '*') {
                if (cs == '\0' || (cs != cp && cp != '?')) {
                    return false;
                }
                return isMatch(s.substring(1), p.substring(1));
            } else {
                int j = 0;
                while(j < n && p.charAt(j) == '*') {
                    j++;
                }
                if (j == n) {
                    return true;
                }

                if (isMatch(s, p.substring(j))) {
                    return true;
                } else {
                    for (int i = 0; i < s.length(); i++) {
                        if (isMatch(s.substring(i + 1), p.substring(j))) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
    }
}
