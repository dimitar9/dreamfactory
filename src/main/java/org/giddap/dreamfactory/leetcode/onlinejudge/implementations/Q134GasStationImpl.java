package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q134GasStation;

public class Q134GasStationImpl implements Q134GasStation {
    @Override
    public int canCompleteCircuit(int[] gas, int[] cost) {
        final int numStations = gas.length;
        int aggregatedGas = 0;
        int start = -1;
        for (int i = 0; i <= numStations; i++) {
            int currGas = gas[i % numStations] - cost[i % numStations];
            aggregatedGas += currGas;
            if (aggregatedGas < 0) {
                start = -1;
                aggregatedGas = 0;
            } else {
                if (start == -1) {
                    start = i % numStations;
                }
            }

            if (i == numStations) {
                break;
            }
        }

        return start;
    }
}
