package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ZigZagConversion;

/**
 * http://oj.leetcode.com/problems/zigzag-conversion/
 */
public class ZigZagConversionIterativeImpl implements ZigZagConversion {
    @Override
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if (nRows == 1) {
            return s;
        }
        final int blockSize = 2 * nRows - 2;
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < nRows; i++) {
            int j = i;
            while (j < s.length()) {
                ret.append(s.charAt(j));
                j += blockSize;
                if (i != 0 && i != nRows - 1 && j - i - i < s.length()) {
                    ret.append(s.charAt(j - i - i));
                }
            }
        }
        return ret.toString();
    }
}
