package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q121BestTimeToBuyAndSellStock;

public class Q121BestTimeToBuyAndSellStockImpl implements Q121BestTimeToBuyAndSellStock {
    @Override
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int lowestLeft = prices[0];
        int maxP = 0;
        for (int i = 1; i < prices.length; i++) {
            lowestLeft = Math.min(lowestLeft, prices[i - 1]);
            maxP = Math.max(maxP, prices[i] - lowestLeft);
        }
        return maxP;
    }
}
