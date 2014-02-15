package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q070ClimbingStairs;

public class Q070ClimbingStairsDPImpl implements Q070ClimbingStairs {
    @Override
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int prevprev = 1;
        int ret = 1;

        int i = 2;
        while (i <= n) {
            int tmp = ret;
            ret += prevprev;
            prevprev = tmp;
            i++;
        }
        return ret;
    }
}
