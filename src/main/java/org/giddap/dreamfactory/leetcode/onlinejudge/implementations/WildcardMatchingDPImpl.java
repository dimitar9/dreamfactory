package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WildcardMatching;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>m (p.length) * n (s.legnth) table</li>
 * <li>row by row to fill the array (n).</li>
 * <li>calculate the first 'true'.</li>
 * <li>From right to left to avoid having to use 2 arrays.</li>
 * </ul>
 */
public class WildcardMatchingDPImpl implements WildcardMatching {
    @Override
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int sLen = s.length();
        boolean[] matched = new boolean[sLen + 1];
        matched[0] = true;

        for (int i = 0; i < p.length(); i++) {
            char pCh = p.charAt(i);
            // Skip repeated '*'
            if (i > 0 && pCh == '*' && p.charAt(i - 1) == '*') {
                continue;
            }
            // Find out the first 'matched' from previous row
            int j = 0;
            while (j < matched.length && !matched[j]) {
                j++;
            }
            if (j == matched.length) { // no 'matched' from previous row
                return false;
            }
            if (pCh == '*') {
                for (; j < matched.length; j++) {
                    matched[j] = true;
                }
            } else {
                for (int k = s.length(); k >= 0; --k) {
                    if (k <= j) {
                        matched[k] = false;
                    } else {
                        matched[k] = matched[k - 1]
                                && (pCh == s.charAt(k - 1) || pCh == '?');
                    }
                }
            }
        }
        return matched[sLen];
    }
}
