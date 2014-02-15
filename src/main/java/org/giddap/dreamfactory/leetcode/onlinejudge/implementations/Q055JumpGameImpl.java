package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q055JumpGame;

public class Q055JumpGameImpl implements Q055JumpGame {

    @Override
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int len = A.length;
        if (len <= 1) {
            return true;
        }
        int limit = A[0];
        for (int i = 0; i <= limit; i++) {
            limit = Math.max(limit, i + A[i]);
            if (limit >= len - 1) {
                return true;
            }
        }
        return false;
    }
}
