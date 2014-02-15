package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q089GrayCode;

import java.util.ArrayList;

public class Q089GrayCodeMathImpl implements Q089GrayCode {
    @Override
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int count = 1 << n;
        for (int i = 0; i < count; i++) {
            ret.add(i ^ (i >> 1));
        }
        return ret;
    }
}
