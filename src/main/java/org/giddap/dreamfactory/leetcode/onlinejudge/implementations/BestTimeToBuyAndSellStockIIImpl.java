package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.BestTimeToBuyAndSellStockII;

/**
 * Greedy approach:
 * Accumulate the positive incrementals.
 */
public class BestTimeToBuyAndSellStockIIImpl
        implements BestTimeToBuyAndSellStockII {
    @Override
    public int maxProfit(int[] prices) {
        final int n = prices.length;
        int mp = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                mp += (prices[i] - prices[i - 1]);
            }
        }
        return mp;
    }
}
