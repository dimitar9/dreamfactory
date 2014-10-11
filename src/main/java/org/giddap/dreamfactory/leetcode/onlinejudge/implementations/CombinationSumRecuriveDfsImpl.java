package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSumRecuriveDfsImpl implements CombinationSum {
    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        // We need a sorted list to avoid duplicate combo
        Arrays.sort(candidates);
        build(res, candidates, new ArrayList<Integer>(), 0, target);
        return res;
    }

    private void build(List<List<Integer>> res, int[] can, List<Integer> curr, int s, int t) {
        if (t == 0) {
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        for (int i = s; i < can.length; ++i) {
            // Break out the loop if all remaining numbers are larger than 't'
            // More efficient
            if (can[i] > t) {
                break;
            }
            // DFS
            curr.add(can[i]);
            build(res, can, curr, i, t - can[i]);
            curr.remove(curr.size() - 1);
        }
    }
}
