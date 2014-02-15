package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q078Subsets;

import java.util.ArrayList;
import java.util.Arrays;

public class Q078SubsetsBitMaskImpl implements Q078Subsets {
    @Override
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(S);
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < (1 << S.length); i++) {
            ArrayList<Integer> one = new ArrayList<Integer>();
            for (int j = 0; j < S.length; j++) {
                if ((i & (1 << j)) != 1) {
                    one.add(S[j]);
                }
            }
            ret.add(one);
        }
        return ret;
    }
}
