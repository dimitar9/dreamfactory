package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q123BestTimeToBuyAndSellStockIII;

public class Q123BestTimeToBuyAndSellStockIIIOn2Impl implements Q123BestTimeToBuyAndSellStockIII {
    @Override
    public int maxProfit(int[] prices) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int mp = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length - 1; i++) {
            mp = Math.max(
                    mp, Math.max(0, maxProfitByRange(prices, 0, i)) +
                    Math.max(0, maxProfitByRange(prices, i + 1, prices.length - 1)));
        }
        return mp;
    }

    private int maxProfitByRange(int[] prices, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int[] minValues = new int[prices.length];
        minValues[start] = prices[start];
        int mp = Integer.MIN_VALUE;
        for (int i = start + 1; i <= end; i++) {
            minValues[i] = Math.min(minValues[i - 1], prices[i - 1]);
            mp = Math.max(mp, prices[i] - minValues[i]);
        }
        return mp;
    }
}
