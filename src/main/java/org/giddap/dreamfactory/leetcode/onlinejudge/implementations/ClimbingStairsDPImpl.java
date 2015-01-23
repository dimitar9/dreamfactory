package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ClimbingStairs;

public class ClimbingStairsDPImpl implements ClimbingStairs {
    @Override
    public int climbStairs(int n) {
        int prevprev = 1;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = prev;
            prev += prevprev;
            prevprev = tmp;
        }
        return prev;
    }
}
