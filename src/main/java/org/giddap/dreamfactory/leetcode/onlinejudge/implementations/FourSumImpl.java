package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.FourSum;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSumImpl implements FourSum {
    @Override
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        final int len = num.length;
        if (len == 0) {
            return ret;
        }

        Arrays.sort(num);

        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            for (int j = len - 1; j > i + 2; j--) {
                if (j < len - 1 && num[j] == num[j + 1]) {
                    continue;
                }
                int m = i + 1;
                int n = j - 1;
                while (m < n) {
                    if (m > i + 1 && num[m] == num[m - 1]) {
                        m++;
                        continue;
                    }
                    if (n < j - 1 && num[n] == num[n + 1]) {
                        n--;
                        continue;
                    }
                    int delta = target - num[i] - num[j] - num[m] - num[n];
                    if (delta == 0) {
                        ArrayList<Integer> one = new ArrayList<Integer>();
                        one.add(num[i]);
                        one.add(num[m]);
                        one.add(num[n]);
                        one.add(num[j]);
                        ret.add(one);
                        m++;
                        n--;
                    } else if (delta > 0) {
                        m++;
                    } else {
                        n--;
                    }
                }
            }
        }
        return ret;
    }
}
