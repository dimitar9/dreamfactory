package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q001TwoSum;

import java.util.HashMap;
import java.util.Map;


public class Q001TwoSumImpl implements Q001TwoSum {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function

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
