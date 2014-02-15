package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q040CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;

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
public class Q040CombinationSumIIDfsImpl implements Q040CombinationSumII {
    @Override
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (num.length == 0) {
            return ret;
        }
        Arrays.sort(num);
        calc(ret, new ArrayList<Integer>(), 0, num, target);
        return ret;
    }

    private void calc(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> curr, int currIdx,
                      int[] numbers, int remainingTarget) {

        for (int i = currIdx; i < numbers.length; i++) {
            if (i > currIdx && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int delta = remainingTarget - numbers[i];
            if (delta == 0) {// found one
                ArrayList<Integer> one = new ArrayList(curr);
                one.add(numbers[i]);
                ret.add(one);
            } else if (delta >= numbers[i]) {
                curr.add(numbers[i]);
                calc(ret, curr, i + 1, numbers, remainingTarget - numbers[i]);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
