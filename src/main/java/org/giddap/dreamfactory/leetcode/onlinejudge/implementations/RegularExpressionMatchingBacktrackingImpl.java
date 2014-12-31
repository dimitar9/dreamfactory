package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RegularExpressionMatching;

/**
 * 弼馬溫注解：
 * Use backtracking approach to search the solution exhaustively.
 * <p/>
 * If the next char in p is not '*', return false if (1) s is empty or (2) p[0] is not '.'
 * or (3) s[0] does not match p[0];
 * Otherwise, extend the branch with isMatch(s[1], p[1]);
 * <p/>
 * If the next char in p is '*':
 * (1) Try skip to p[2] with s first: isMatch(s, p[2]);
 * (2) If the above does not work, for each matching s[i] and p[0],
 * extend the branch on step further with isMatch(s[i + 1], p[2])
 */
public class RegularExpressionMatchingBacktrackingImpl implements RegularExpressionMatching {
    @Override
    public boolean isMatch(String s, String p) {
        final int m = s.length();
        final int n = p.length();
        if (n == 0) {
            return m == 0;
        } else {
            char pc = p.charAt(0);
            char pc2 = n > 1 ? p.charAt(1) : '\0';
            if (pc2 != '*') { // need to match individual char
                if (m > 0 && (s.charAt(0) == pc || pc == '.')) {
                    return isMatch(s.substring(1), p.substring(1));
                }
            } else {
                if (isMatch(s, p.substring(2))) {
                    return true;
                } else {
                    int i = 0;
                    while (i < m && (s.charAt(i) == pc || pc == '.')) {
                        if (isMatch(s.substring(i + 1), p.substring(2))) {
                            return true;
                        }
                        i++;
                    }
                }
            }
            return false;
        }
    }
}
