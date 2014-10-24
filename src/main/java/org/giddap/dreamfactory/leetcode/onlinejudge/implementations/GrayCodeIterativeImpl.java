package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.GrayCode;

import java.util.ArrayList;
import java.util.List;

public class GrayCodeIterativeImpl implements GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<Integer>();
        ret.add(0);
        for (int i = 1; i <= n; i++) {
            int size = ret.size() - 1;
            int leading = 1 << (i - 1);
            for (int j = size; j >= 0; j--) {
                ret.add(ret.get(j) | leading);
            }
        }
        return ret;
    }
}
