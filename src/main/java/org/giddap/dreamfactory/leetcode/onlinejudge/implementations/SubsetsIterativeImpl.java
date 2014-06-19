package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Subsets;

import java.util.ArrayList;

/**
 * 弼馬溫注解：
 * <p/>
 * <p/>
 * Time complexity: O(n^2).
 * Space complexity: O(n^2).
 */
public class SubsetsIterativeImpl implements Subsets {
    @Override
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

        final int len = S.length;
        if (len == 0) {
            return ret;
        }

        ret.add(new ArrayList<Integer>());

        for (int i = 0; i < len; i++) {
            ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> one : ret) {
                ArrayList<Integer> nextOne = new ArrayList<Integer>(one);
                nextOne.add(S[i]);
                tmp.add(nextOne);
            }
            ret.addAll(tmp);
        }

        return ret;
    }
}
