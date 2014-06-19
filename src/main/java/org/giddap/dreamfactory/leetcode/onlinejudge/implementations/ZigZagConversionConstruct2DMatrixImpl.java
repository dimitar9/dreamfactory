package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ZigZagConversion;

/**
 * 弼馬溫注解：
 * Build up the 2D matrix.
 */
public class ZigZagConversionConstruct2DMatrixImpl implements ZigZagConversion {
    @Override
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if (nRows == 1) {
            return s;
        }
        final int unitLen = nRows + nRows - 2;
        StringBuilder[] texts = new StringBuilder[nRows];
        for (int i = 0; i < nRows; i++) {
            texts[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int y = i % unitLen;
            if (y < nRows) {
                texts[y].append(c);
            } else {
                texts[nRows - 1 - (y - nRows) - 1].append(c);
            }
        }
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < nRows; i++) {
            ret.append(texts[i].toString());
        }
        return ret.toString();
    }
}
