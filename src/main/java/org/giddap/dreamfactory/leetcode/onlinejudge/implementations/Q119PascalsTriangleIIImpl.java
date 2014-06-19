package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q119PascalsTriangleII;

import java.util.ArrayList;

public class Q119PascalsTriangleIIImpl implements Q119PascalsTriangleII {
    @Override
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> prev = new ArrayList<Integer>();
        prev.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1);

            for (int j = 1; j < prev.size(); j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);

            prev = curr;
        }

        return prev;
    }
}
