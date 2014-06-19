package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q046Permutations;

import java.util.ArrayList;

public class Q046PermutationsDfsImpl implements Q046Permutations {
    @Override
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        for (int n : num) {
            input.add(n);
        }

        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        permuteUniqueRecursively(ret, new ArrayList<Integer>(), input);
        return ret;
    }

    private void permuteUniqueRecursively(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> prefix, ArrayList<Integer> suffix) {
        if (suffix.size() == 0) {
            ret.add(new ArrayList<Integer>(prefix));
            return;
        }

        final int suffixLen = suffix.size();
        for (int i = 0; i < suffixLen; i++) {
            Integer curr = suffix.get(i);
            suffix.remove(i);
            prefix.add(curr);
            permuteUniqueRecursively(ret, prefix, suffix);
            prefix.remove(prefix.size() - 1);
            suffix.add(i, curr);
        }
    }
}
