package org.giddap.dreamfactory.geeksforgeeks.dynamicprogramming;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-6-min-cost-path/
 * <p/>
 * minCost(i, j) = min(minCost(i - 1, j - 1), minCost(i, j - 1), minCost(i - 1, j)) + cost[i][j]
 */
public class Set06MinCostPath {
    public int findMinCostPathCost(int[][] costs) {
        int[][] minCosts = new int[costs.length][costs[0].length];

        minCosts[0][0] = costs[0][0];

        // first column
        for (int i = 1; i < minCosts.length; i++) {
            minCosts[i][0] = minCosts[i - 1][0] + costs[i][0];
        }

        // first row
        for (int i = 1; i < minCosts[0].length; i++) {
            minCosts[0][i] = minCosts[i - 1][0] + costs[i][0];
        }

        for (int j = 1; j < costs.length; j++) {
            for (int k = 1; k < costs[0].length; k++) {
                minCosts[j][k] = Math.min(minCosts[j][k - 1], minCosts[j - 1][k - 1]);
                minCosts[j][k] = Math.min(minCosts[j][k], minCosts[j - 1][k]);
                minCosts[j][k] += costs[j][k];
            }
        }

        return minCosts[minCosts.length - 1][minCosts[0].length - 1];
    }
}
