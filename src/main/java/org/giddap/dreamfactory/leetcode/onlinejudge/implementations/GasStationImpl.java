package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.GasStation;

/**
 * Time: O(n); Space: O(n)
 *
 * Two key points:
 * 1. Can complete the circle if sum(gas[i]) >= sum(cost[i]); cannot otherwise.
 * 2. Keep a pointer to the start of a segment that has positive sum.
 * Need to upadte the start only if 'gas[i] - cost[i] > 0' and 'previous
 * segment sum < 0' note in this case, we also need to reset the
 * 'previous segment sum' to 'gas[i] - cost[i]'.
 * For all other cases, we just need to add to 'segment sum'
 */
public class GasStationImpl implements GasStation {
    @Override
    public int canCompleteCircuit(int[] gas, int[] cost) {
        final int n = gas.length;
        if (n < 1) {
            return 0;
        }
        int sum = gas[0] - cost[0];
        int start = 0;
        int totalGas = gas[0];
        int totalCost = cost[0];
        for (int i = 1; i < n; i++) {
            int cur = gas[i] - cost[i];
            totalGas += gas[i];
            totalCost += cost[i];
            if (cur > 0 && sum <= 0) {
                start = i;
                sum = cur;
            } else {
                sum += cur;
            }
        }

        return (totalGas >= totalCost) ? start : -1;
    }
}
