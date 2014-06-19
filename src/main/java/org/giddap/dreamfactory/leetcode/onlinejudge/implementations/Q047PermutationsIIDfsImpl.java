package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q047PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;

public class Q047PermutationsIIDfsImpl implements Q047PermutationsII {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
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
            if (i > 0 && curr == suffix.get(i - 1)) {
                continue;
            }
            suffix.remove(i);
            prefix.add(curr);
            permuteUniqueRecursively(ret, prefix, suffix);
            prefix.remove(prefix.size() - 1);
            suffix.add(i, curr);
        }
    }
}
