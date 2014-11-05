package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.JumpGame;

public class JumpGameImpl implements JumpGame {

    @Override
    public boolean canJump(int[] A) {
        int f = 0;
        for (int i = 0; i <= f; i++) {
            f = Math.max(f, i + A[i]);
            if (f >= A.length - 1) {
                return true;
            }
        }
        return false;
    }
}
