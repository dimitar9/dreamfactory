package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.TwoSum;

import java.util.HashMap;
import java.util.Map;


public class TwoSumImpl implements TwoSum {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (visited.containsKey(delta)) {
                ret[0] = visited.get(delta) + 1;
                ret[1] = i + 1;
                return ret;
            } else {
                if (!visited.containsKey(numbers[i])) {
                    visited.put(numbers[i], i);
                }
            }
        }
        return ret;
    }
}
