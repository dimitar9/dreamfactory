package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.GrayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Iterative approach
 * Time: O(n); Space: O(n)
 * Algorithm:
 * (1) Initialize the list with '0'
 * (2) Iterate the list reversely, get the next number by: ret.get(j) | leading
 * (3) Add the new number to the list.
 */
public class GrayCodeIterativeImpl implements GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<>();
        ret.add(0);
        for (int i = 1; i <= n; i++) {
            int size = ret.size() - 1;
            int leading = 1 << (i - 1);
            for (int j = size; j >= 0; j--) {
                ret.add(ret.get(j) | leading);
            }
        }
        return ret;
    }
}
