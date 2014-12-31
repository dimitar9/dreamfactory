package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ZigZagConversion;

import java.util.ArrayList;
import java.util.List;

/**
 * 弼馬溫注解：
 * Build up the 2D matrix.
 */
public class ZigZagConversionConstruct2DMatrixImpl implements ZigZagConversion {
    @Override
    public String convert(String s, int nRows) {
        if (nRows < 2) {
            return s;
        }
        if (s.length() == 0) {
            return s;
        }
        List<StringBuilder> visited = new ArrayList<>();
        for (int i = 0; i < nRows; i++) {
            visited.add(new StringBuilder());
        }
        final int blockSize = nRows * 2 - 2;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int r = i % blockSize;
            if (r < nRows) {
                visited.get(r).append(chars[i]);
            } else {
                visited.get(blockSize - r).append(chars[i]);
            }
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder sb : visited) {
            ret.append(sb.toString());
        }
        return ret.toString();
    }
}
