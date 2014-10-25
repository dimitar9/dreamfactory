package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.GasStation;

public class GasStationImpl implements GasStation {
    @Override
    public int canCompleteCircuit(int[] gas, int[] cost) {
        final int len = gas.length;
        int maxSum = Integer.MIN_VALUE;
        int maxSumStartIdx = -1;

        int startIdx = -1;
        int currSum = 0;
        int totalSum = 0;
        boolean wrappedUp = false;
        for (int i = 0; i < len; i++) {
            int d = gas[i] - cost[i];
            totalSum += d;
            currSum = Math.max(currSum + d, d);

            if (currSum >= 0 ) {
                if (startIdx == -1) {
                    startIdx = i;
                }
            } else {
                if (wrappedUp) {
                    break;
                }
                startIdx = -1;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                maxSumStartIdx = startIdx;
            }
            if (i == len - 1) {
                if (totalSum < 0) {
                    return - 1;
                }
                if (!wrappedUp) {
                    wrappedUp = true;
                    i = 0;
                } else {
                    break;
                }
            }
        }

        return maxSumStartIdx;
    }
}
