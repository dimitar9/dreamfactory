package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.DecodeWays;

/**
 * DP solution.
 * Time: O(n); Space: O(1)
 * Algorithm:
 * Iterate through the string. Keep track of dw[i - 2], dw[i - 1]
 * at each i:
 * dw[i] =
 * case 1 - if s[i] == '0',
 * case 1.1 - dw[i - 2], if (s[i - 1] == '1' or '2')
 * case 1.2 - 0, otherwise
 * case 2 - if s[i] != '0', dw[i - 1] + (dw[i - 2], if s[i - 1]s[i] is
 * valid or '0', otherwise)
 */
public class DecodeWaysBottomUpDPImpl implements DecodeWays {
    @Override
    public int numDecodings(String s) {
        int pp = 0;
        int p = 1;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - '0';
            int pVal = i > 0 ? s.charAt(i - 1) - '0' : -10;
            if (val == 0) {
                n = (i > 0 && (pVal == 1 || pVal == 2)) ? pp : 0;
            } else {
                n = p + ((pVal == 0) ? 0 :
                        ((pVal * 10 + val <= 26 && pVal * 10 + val > 0) ?
                        pp : 0));
            }
            pp = p;
            p = n;
        }
        return n;
    }
}
