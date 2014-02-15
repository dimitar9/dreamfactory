package org.giddap.dreamfactory.geeksforgeeks.dynamicprogramming;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
 * <p/>
 * Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value
 * in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and
 * weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find
 * out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
 * You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).
 */
public class Set10ZeroOneKnapsackProblem {
    public int[] solve01KnapsackProblem(int[] values, int[] weights, int maxWeight) {
        int[] maxValues = new int[maxWeight];
        for (int i = 0; i < weights.length; i++) {
            for (int w = 0; w <= maxWeight; w++) {

                if (weights[i] == w) {
                    if (values[i] > maxValues[w]) {
                        maxValues[w] = values[i];
                    }
                } else if (weights[i] < w) {
                    int delta = w - weights[i];
                    if (maxValues[delta] + values[i] > maxValues[w]) {
                        maxValues[w] = maxValues[delta] + values[i];
                    }
                } else {
                    maxValues[w] = maxValues[w - 1];
                }

            }
        }
        return new int[5];
    }
}
