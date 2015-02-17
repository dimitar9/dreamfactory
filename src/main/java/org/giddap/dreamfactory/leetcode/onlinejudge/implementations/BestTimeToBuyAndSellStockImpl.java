package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.BestTimeToBuyAndSellStock;

/**
 * Time: O(n); Space: O(1)
 * Iterate through the array while keeping two numbers:
 * on ith element:
 * * min_so_far: min(prices[i - 1], min_so_far)
 * * max_profit_so_far: max(prices[i] - min_so_far, max_profit_so_far)
 */
public class BestTimeToBuyAndSellStockImpl
        implements BestTimeToBuyAndSellStock {
    @Override
    public int maxProfit(int[] prices) {
        final int n = prices.length;
        if (n < 2) {
            return 0;
        }
        int mp = 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(prices[i - 1], min);
            mp = Math.max(prices[i] - min, mp);
        }
        return mp;
    }
}
