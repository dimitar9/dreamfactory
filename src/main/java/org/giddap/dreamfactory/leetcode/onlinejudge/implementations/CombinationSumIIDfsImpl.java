package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Notes:
 * <ul>
 * <li>DFS with Backtracking</li>
 * <li>Special requirements: (1) unique combos, and (2) Same element can be used only once.</li>
 * <li>Sort the numbers first</li>
 * <li>To ensure uniqueness, at the same position, skip the current one if previous element is same value</li>
 * <li>To ensure 'used once', use an 'index' to make sure we always make progress.</li>
 * <li>More progressive pruning: the delta must be >= numbers[i].</li>
 * </ul>
 */
public class CombinationSumIIDfsImpl implements CombinationSumII {
    @Override
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> nums = new ArrayList<>();
        for (int i : num) {
            nums.add(i);
        }
        Collections.sort(nums);
        compute(ret, new ArrayList<Integer>(), nums, 0, target);
        return ret;
    }

    private void compute(List<List<Integer>> ret, List<Integer> selected, List<Integer> num, int idx, int target) {
        if (target == 0) {
            List<Integer> one = new ArrayList<>(selected);
            ret.add(one);
        }
        for (int i = idx; i < num.size(); i++) {
            int n = num.get(i);
            if (n <= target) {
                if ((i > idx) && (n == num.get(i - 1))) {
                    continue;
                }
                selected.add(n);
                compute(ret, selected, num, i + 1, target - n);
                selected.remove(selected.size() - 1);
            } else {
                break;
            }
        }
    }
}
