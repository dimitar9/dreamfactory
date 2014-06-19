package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import java.util.ArrayList;

public class Q089GrayCodeIterativeImpl {
    public ArrayList<Integer> grayCode(int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<Integer> ret = new ArrayList<Integer>();
        ret.add(0);
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>(ret);
            for (int j = ret.size() - 1; j >= 0; j--) {
                tmp.add(ret.get(j) | 1 << (i - 1));
            }
            ret = tmp;
        }
        return ret;
    }
}
