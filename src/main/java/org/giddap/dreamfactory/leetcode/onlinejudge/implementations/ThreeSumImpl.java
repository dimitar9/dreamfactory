package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumImpl implements ThreeSum {
    @Override
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        final int len = num.length;
        if (len < 3) {
            return ret;
        }
        Arrays.sort(num);
        for (int i = 0; i < len - 2; ++i) {
            if (i > 0 && num[i - 1] == num[i]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (j > i + 1 && num[j] == num[j - 1]) {
                    j++;
                    continue;
                }
                if (k < len - 1 && num[k] == num[k + 1]) {
                    k--;
                    continue;
                }
                final int sum = num[i] + num[j] + num[k];
                if (sum == 0) {
                    List<Integer> one = new ArrayList<Integer>();
                    one.add(num[i]);
                    one.add(num[j]);
                    one.add(num[k]);
                    ret.add(one);
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return ret;
    }
}
