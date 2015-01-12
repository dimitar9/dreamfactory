package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Permutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationsDfsImpl implements Permutations {
    @Override
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        if (num.length == 0) {
            return result;
        }

        List<Integer> nums = new ArrayList<Integer>();
        for (int n : num) {
            nums.add(n);
        }

        doPermutations(result, new ArrayList<Integer>(), nums);
        return result;
    }

    public void doPermutations(List<List<Integer>> result, List<Integer> done, List<Integer> remain) {
        if (remain.isEmpty()) {
            result.add(new ArrayList<Integer>(done));
        } else {
            for (int i = 0; i < remain.size(); i++) {
                int n = remain.remove(i);
                done.add(n);
                doPermutations(result, done, remain);
                done.remove(done.size() - 1);
                remain.add(i, n);
            }
        }
    }
}
