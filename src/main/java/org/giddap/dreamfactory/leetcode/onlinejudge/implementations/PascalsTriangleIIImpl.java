package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIIImpl implements PascalsTriangleII {
    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        if (rowIndex == 0) {
            return prev;
        }
        List<Integer> curr = null;
        for (int i = 1; i <= rowIndex; ++i) {
            curr = new ArrayList<Integer>();
            curr.add(1);
            for (int j = 0; j < prev.size() - 1; ++j) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1);
            prev = curr;
        }
        return prev;
    }
}
