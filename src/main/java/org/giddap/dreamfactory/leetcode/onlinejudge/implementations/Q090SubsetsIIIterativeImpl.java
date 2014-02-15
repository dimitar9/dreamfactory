package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q090SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;


public class Q090SubsetsIIIterativeImpl implements Q090SubsetsII {
    @Override
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (num.length == 0) {
            return ret;
        }

        Arrays.sort(num);
        ret.add(new ArrayList<Integer>());
        int numOfPreviousPerms = 0;
        for (int i = 0; i < num.length; i++) {
            ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>(ret);
            final int currSize = tmp.size();
            int j = 0;
            if (i > 0 && num[i] == num[i - 1]) {
                j = currSize - numOfPreviousPerms;
            }

            numOfPreviousPerms = 0;
            for (; j < currSize; j++) {
                ArrayList<Integer> newOne = new ArrayList<Integer>(tmp.get(j));
                newOne.add(num[i]);
                ret.add(newOne);
                numOfPreviousPerms++;
            }
        }

        return ret;
    }
}
