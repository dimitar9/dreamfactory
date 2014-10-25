package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.GasStation;

/**
 *
 */
public class GasStationTwoLoopImpl implements GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        final int len = gas.length;
        int[] deltas = new int[gas.length];
        for (int i = 0; i < len; i++) {
            deltas[i] = gas[i] - cost[i];
        }

        int i = 0;
        while (i < len && deltas[i] >= 0) {
            int j = i;
            int r = deltas[i];
            while (r >= 0) {
                j = (j + 1) % len;
                if (j == i) {
                    return i;
                }
                r += deltas[j];
            }
            i++;
        }
        return -1;
    }
}
