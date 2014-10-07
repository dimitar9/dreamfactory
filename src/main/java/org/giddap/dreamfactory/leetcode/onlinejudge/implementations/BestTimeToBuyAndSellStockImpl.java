package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStockImpl implements BestTimeToBuyAndSellStock {
    @Override
    public int maxProfit(int[] prices) {
        final int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        int leftMin = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < len; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - leftMin);
            leftMin = Math.min(leftMin, prices[i]);
        }

        return maxProfit;
    }
}
