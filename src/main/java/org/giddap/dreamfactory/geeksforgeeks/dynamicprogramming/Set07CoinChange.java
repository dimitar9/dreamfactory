package org.giddap.dreamfactory.geeksforgeeks.dynamicprogramming;

import java.util.Arrays;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/
 * <p/>
 * Given a value N, if we want to make change for N cents, and we have infinite supply of each of
 * S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.
 * <p/>
 * For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should
 * be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}.
 * So the output should be 5.
 */
public class Set07CoinChange {
    public int findTotalWaysOfCoinChanges(final int[] units, final int sum) {
        int[] ways = new int[sum + 1];
        int[] maxUnit = new int[sum + 1];

        Arrays.sort(units);

        for (int i = 0; i < ways.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < units.length; k++) {
                    if (units[k] + j == i && units[k] >= maxUnit[i]) {
                        ways[i] += ways[j] + 1;
                        maxUnit[i] = units[k];
                    }
                }
            }
        }

        return ways[ways.length - 1];
    }
}
