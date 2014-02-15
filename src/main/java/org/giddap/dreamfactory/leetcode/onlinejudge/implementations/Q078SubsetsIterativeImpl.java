package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q078Subsets;

import java.util.ArrayList;

public class Q078SubsetsIterativeImpl implements Q078Subsets {
    @Override
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

        final int len = S.length;
        if (len == 0) {
            return ret;
        }

        ret.add(new ArrayList<Integer>());

        for (int i = 0; i < len; i++) {
            ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> one : ret) {
                ArrayList<Integer> nextOne = new ArrayList<Integer>(one);
                nextOne.add(S[i]);
                tmp.add(nextOne);
            }
            ret.addAll(tmp);
        }

        return ret;
    }
}
