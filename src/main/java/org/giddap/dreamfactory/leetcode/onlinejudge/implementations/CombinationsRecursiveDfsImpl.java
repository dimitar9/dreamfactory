package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Combinations;

import java.util.ArrayList;
import java.util.List;

public class CombinationsRecursiveDfsImpl implements Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        combineDfs(n, k, new ArrayList<Integer>(), ret);
        return ret;
    }

    private void combineDfs(int n, int k, ArrayList<Integer> curr, List<List<Integer>> ret) {
        final int currSize = curr.size();

        if (currSize == k) {
            ret.add(new ArrayList<Integer>(curr));
            return;
        }

        int last = (currSize == 0 ? 0 : curr.get(currSize - 1));
        for (int i = last + 1; i <= n; i++) {
            curr.add(i);
            combineDfs(n, k, curr, ret);
            curr.remove(curr.size() - 1);
        }
    }
}
