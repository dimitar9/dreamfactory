package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumImpl implements FourSum {
    @Override
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        final int len = num.length;
        if (len <= 3) {
            return ret;
        }
        Arrays.sort(num);
        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            for (int n = len - 1; n > i + 2; n--) {
                if (n < len - 1 && num[n] == num[n + 1]) {
                    continue;
                }
                int j = i + 1;
                int m = n - 1;
                while (j < m) {
                    if (j > i + 1 && num[j] == num[j - 1]) {
                        j++;
                        continue;
                    }
                    if (m < n - 1 && num[m] == num[m + 1]) {
                        m--;
                        continue;
                    }
                    int delta = target - num[i] - num[j] - num[m] - num[n];
                    if (delta == 0) {
                        List<Integer> one = new ArrayList<>();
                        one.add(num[i]);
                        one.add(num[j]);
                        one.add(num[m]);
                        one.add(num[n]);
                        ret.add(one);
                        j++;
                        m--;
                    } else if (delta > 0) { // sum is less than 'target'
                        j++;
                    } else { // sum is larger than 'target'
                        m--;
                    }
                }
            }
        }
        return ret;
    }
}
