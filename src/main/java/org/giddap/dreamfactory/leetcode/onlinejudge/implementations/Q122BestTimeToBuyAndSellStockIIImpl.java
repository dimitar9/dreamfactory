package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q122BestTimeToBuyAndSellStockII;

public class Q122BestTimeToBuyAndSellStockIIImpl implements Q122BestTimeToBuyAndSellStockII {
    @Override
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int maxSum = 0;
        for (int i = 1; i < prices.length; i++) {
            maxSum += Math.max(0, prices[i] - prices[i - 1]);
        }
        return maxSum;
    }
}
