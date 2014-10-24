package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.GrayCode;

import java.util.ArrayList;
import java.util.List;

public class GrayCodeMathImpl implements GrayCode {
    @Override
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int count = 1 << n;
        for (int i = 0; i < count; i++) {
            ret.add(i ^ (i >> 1));
        }
        return ret;
    }
}
