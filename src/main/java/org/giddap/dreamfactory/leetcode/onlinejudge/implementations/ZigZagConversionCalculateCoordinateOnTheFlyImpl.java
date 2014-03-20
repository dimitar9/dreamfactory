package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ZigZagConversion;

/**
 * 弼馬溫注解：
 * Calculate the coordinate on the fly, row by row.
 */
public class ZigZagConversionCalculateCoordinateOnTheFlyImpl implements ZigZagConversion {
    @Override
    public String convert(String s, int nRows) {
        if (nRows == 1) {
            return s;
        }
        StringBuilder ret = new StringBuilder();
        final int unit = nRows + nRows - 2;
        for (int i = 0; i < nRows; i++) {
            int curr = i;
            while (curr < s.length()) {
                ret.append(s.charAt(curr));
                curr += unit;
                if (i > 0 && i < nRows - 1 && (curr - i - i) < s.length()) {
                    ret.append(s.charAt(curr - i - i));
                }
            }
        }
        return ret.toString();
    }
}
