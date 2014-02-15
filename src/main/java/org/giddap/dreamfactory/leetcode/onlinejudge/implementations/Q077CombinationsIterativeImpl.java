package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q077Combinations;

import java.util.ArrayList;


public class Q077CombinationsIterativeImpl implements Q077Combinations {

    @Override
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ret.add(new ArrayList<Integer>());
        for (int i = 0; i < k; i++) {
            ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> combo : ret) {
                int j = combo.size() > 0 ? combo.get(combo.size() - 1) + 1 : 1;
                for (; j <= n; j++) {
                    ArrayList<Integer> newCombo = new ArrayList<Integer>(combo);
                    newCombo.add(j);
                    tmp.add(newCombo);
                }
            }
            ret = tmp;
        }

        return ret;
    }
}
