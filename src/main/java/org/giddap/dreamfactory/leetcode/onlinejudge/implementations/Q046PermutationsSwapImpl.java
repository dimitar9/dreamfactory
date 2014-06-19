package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q046Permutations;

import java.util.ArrayList;


public class Q046PermutationsSwapImpl implements Q046Permutations {
    @Override
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (num.length == 0) {
            return ret;
        }
        doPermutation(ret, num, num.length - 1);
        return ret;
    }

    private void doPermutation(ArrayList<ArrayList<Integer>> ret, int[] nums, int curr) {
        if (curr == 0) {
            ArrayList<Integer> one = new ArrayList<Integer>();
            for (int n : nums) {
                one.add(n);
            }
            ret.add(one);
            return;
        }

        for (int i = 0; i <= curr; i++) {
            swap(nums, i, curr);
            doPermutation(ret, nums, curr - 1);
            swap(nums, i, curr);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
