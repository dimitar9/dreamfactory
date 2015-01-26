package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsBitMaskImpl implements Subsets {
    @Override
    public List<List<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < (1 << S.length); i++) {
            List<Integer> one = new ArrayList<>();
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
