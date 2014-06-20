package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.TwoSum;

import java.util.HashMap;
import java.util.Map;


public class TwoSumImpl implements TwoSum {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> delta = new HashMap<Integer, Integer>();
        // Iterating through the array to find the delta
        int[] ret = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (delta.containsKey(numbers[i])) {
                ret[0] = Math.min(i, delta.get(numbers[i])) + 1;
                ret[1] = Math.max(i, delta.get(numbers[i])) + 1;
            } else {
                delta.put(target - numbers[i], i);
            }
        }
        return ret;
    }
}
