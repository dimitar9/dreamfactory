package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Combinations;

import java.util.ArrayList;
import java.util.List;


public class CombinationsIterativeImpl implements Combinations {

    @Override
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<Integer>());
        for (int i = 0; i < k; i++) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> combo : ret) {
                int j = combo.size() > 0 ? combo.get(combo.size() - 1) + 1 : 1;
                for (; j <= n; j++) {
                    List<Integer> newCombo = new ArrayList<>(combo);
                    newCombo.add(j);
                    tmp.add(newCombo);
                }
            }
            ret = tmp;
        }

        return ret;
    }
}
