package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleImpl implements PascalsTriangle {
    @Override
    public List<List<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return ret;
        }

        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(1);
        ret.add(one);

        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            List<Integer> prev = ret.get(ret.size() - 1);
            for (int j = 1; j < prev.size(); j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            ret.add(curr);
        }

        return ret;
    }
}
