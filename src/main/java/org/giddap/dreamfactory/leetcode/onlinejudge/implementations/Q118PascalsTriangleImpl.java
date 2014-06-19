package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q118PascalsTriangle;

import java.util.ArrayList;

public class Q118PascalsTriangleImpl implements Q118PascalsTriangle {
    @Override
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (numRows == 0) {
            return ret;
        }

        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(1);
        ret.add(one);

        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            ArrayList<Integer> prev = ret.get(ret.size() - 1);
            for (int j = 1; j < prev.size(); j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            ret.add(curr);
        }

        return ret;
    }
}
