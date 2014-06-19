package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/gas-station/
 * <p/>
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
 * <p/>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station
 * (i+1). You begin the journey with an empty tank at one of the gas stations.
 * <p/>
 * Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
 * <p/>
 * Note:
 * The solution is guaranteed to be unique.
 */
public interface Q134GasStation {
    int canCompleteCircuit(int[] gas, int[] cost);
}
