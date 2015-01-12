package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PermutationsII;

import java.util.*;

/**
 *
 */
public class PermutationsIISwapImpl implements PermutationsII {

    public List<List<Integer>> permuteUnique(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (num.length == 0) {
            return res;
        }
        Arrays.sort(num);
        permute(res, num, 0);
        return res;
    }

    private void permute(List<List<Integer>> res, int[] num, int idx) {
        if (idx == num.length) {
            List<Integer> one = new ArrayList<Integer>();
            for (int n : num) {
                one.add(n);
            }
            res.add(one);
            return;
        }
        // Need to remember all the numbers that have been swapped to the
        // same position.
        // The remaining string is not sorted anymore.
        // Another option is to maintain the sorted property by
        // shifting the remaining array
        Set<Integer> visited = new HashSet<Integer>();
        for (int i = idx; i < num.length; i++) {
            if (visited.contains(num[i])) {
                continue;
            } else {
                visited.add(num[i]);
            }
            swap(num, idx, i);
            permute(res, num, idx + 1);
            swap(num, i, idx);
        }
    }

    private void swap(int[] num, int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
}
