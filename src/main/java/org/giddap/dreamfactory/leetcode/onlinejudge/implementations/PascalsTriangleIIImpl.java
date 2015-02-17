package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

/**
 * Iterative approach.
 */
public class PascalsTriangleIIImpl implements PascalsTriangleII {
    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> r = new ArrayList<>();
        r.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 0; j < r.size() - 1; j++) {
                tmp.add(r.get(j) + r.get(j + 1));
            }
            tmp.add(1);
            r = tmp;
        }
        return r;
    }
}
