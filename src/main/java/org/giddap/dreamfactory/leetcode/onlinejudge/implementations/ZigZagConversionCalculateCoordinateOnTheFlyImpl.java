package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ZigZagConversion;

/**
 * 弼馬溫注解：
 * Calculate the coordinate on the fly, row by row.
 */
public class ZigZagConversionCalculateCoordinateOnTheFlyImpl implements ZigZagConversion {
    @Override
    public String convert(String s, int nRows) {
        if (nRows < 2) {
            return s;
        }
        final int n = s.length();
        final int blockSize = 2 * (nRows - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nRows; i++) {
            int delta = (blockSize - 2 * i == 0 ? blockSize : blockSize - 2 * i);
            int j = i;
            while (j < n) {
                sb.append(s.charAt(j));
                j += delta;
                delta = (blockSize == delta ? blockSize : blockSize - delta);
            }
        }
        return sb.toString();
    }
}
