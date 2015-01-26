package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 弼馬溫注解：
 * <p/>
 * <p/>
 * Time complexity: O(n^2).
 * Space complexity: O(n^2).
 */
public class SubsetsIterativeImpl implements Subsets {
    @Override
    public List<List<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        List<List<Integer>> sol = new ArrayList<>();
        if (S.length == 0) {
            return sol;
        }
        sol.add(new ArrayList<Integer>());
        for (int n : S) {
            List<List<Integer>> tmp = new ArrayList<>(sol);
            for (List<Integer> nums : sol) {
                List<Integer> one = new ArrayList<>(nums);
                one.add(n);
                tmp.add(one);
            }
            sol = tmp;
        }
        return sol;
    }
}
