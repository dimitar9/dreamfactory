package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q015ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;

public class Q015ThreeSumImpl implements Q015ThreeSum {
    @Override
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = num.length;
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (len < 3) {
            return ret;
        }
        Arrays.sort(num);

        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
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

                int sum = num[i] + num[j] + num[k];
                if (sum == 0) {
                    ArrayList<Integer> matched = new ArrayList<Integer>();
                    matched.add(num[i]);
                    matched.add(num[j]);
                    matched.add(num[k]);
                    ret.add(matched);
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
