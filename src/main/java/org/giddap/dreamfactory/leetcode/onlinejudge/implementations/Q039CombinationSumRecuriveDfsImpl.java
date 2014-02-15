package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q039CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;


public class Q039CombinationSumRecuriveDfsImpl implements Q039CombinationSum {
    @Override
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (candidates.length == 0) {
            return ret;
        }
        Arrays.sort(candidates);
        calculateCombinationSum(candidates, ret, new ArrayList<Integer>(), target, 0);
        return ret;
    }

    private void calculateCombinationSum(int[] candidates, ArrayList<ArrayList<Integer>> ret,
                                         ArrayList<Integer> numbers, int remainingSum, int currIdx) {
        if (remainingSum == 0) {
            ret.add(new ArrayList<Integer>(numbers));
        }

        for (int i = currIdx; i < candidates.length; i++) {
            if (candidates[i] <= remainingSum) {
                numbers.add(candidates[i]);
                calculateCombinationSum(candidates, ret, numbers, remainingSum - candidates[i], i);
                numbers.remove(numbers.size() - 1);
            }
        }
    }
}
