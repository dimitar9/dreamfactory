package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q123BestTimeToBuyAndSellStockIII;

/**
 *
 */
public class Q123BestTimeToBuyAndSellStockIIIOnImpl implements Q123BestTimeToBuyAndSellStockIII {
    @Override
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = prices.length;

        if (len < 2) {
            return 0;
        }

        int[] beforeMax = new int[len];
        int min = prices[0];
        for (int i = 0; i < len; i++) {
            if (prices[i] <= min) {
                min = prices[i];
                if (i > 0) {
                    beforeMax[i] = beforeMax[i - 1];
                }
            } else {
                beforeMax[i] = Math.max(prices[i] - min, beforeMax[i - 1]);
            }
        }

        int[] afterMax = new int[len];
        int max = prices[len - 1];
        for (int i = len - 1; i >= 0; i--) {
            if (prices[i] >= max) {
                max = prices[i];
                if (i < len - 1) {
                    afterMax[i] = afterMax[i + 1];
                }
            } else {
                afterMax[i] = Math.max(max - prices[i], afterMax[i + 1]);
            }

        }

        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, beforeMax[i] + afterMax[i]);
        }
        return maxProfit;
    }
}
