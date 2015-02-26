package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.GasStationImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.GasStationTwoLoopImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasStationTest {
    private GasStation solution = new GasStationImpl();
    private GasStation solution2 = new GasStationTwoLoopImpl();

    @Test
    public void small01() {
        int[] gas = {1, 5};
        int[] cost = {2, 3};

        assertEquals(1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    public void small02() {
        int[] gas = {1, 4};
        int[] cost = {3, 3};

        assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    public void small03() {
        int[] gas = {1, 2, 3, 5, 0, 0, 0, 10};
        int[] cost = {15, 0, 0, 0, 0, 0, 0, 6};

        assertEquals(1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    public void small04() {
        int[] gas = {6, 0, 1, 3, 2};
        int[] cost = {4, 5, 2, 5, 5};

        assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    public void small05() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        assertEquals(3, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    public void small06() {
        int[] gas = {2, 4};
        int[] cost = {3, 4};

        assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }
}
