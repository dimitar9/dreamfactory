package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.BestTimeToBuyAndSellStockIII;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time: O(n); Space: O(n) with extra storage for intermediate results
 * .</li>
 * <li>
 * Solution summary:
 * <ol>
 * <li>Calculate and store the max profit if selling on the iTH day via
 * forward scan.</li>
 * <li>Calculate and store the max profit if 2nd txn happens after the iTH
 * day via backwards scan.</li>
 * <li>Figure out the max profit by max (sums of the elements from the two
 * arrays, respectively).</li>
 * </ol>
 * </li>
 * <li>We could combine step 2 and step 3 to calculate the result and be
 * more efficient on space complexity. However, the code will be a bit
 * messier that way. It is a personal preference, I guess</li>
 * </ul>
 */
public class BestTimeToBuyAndSellStockIIITwoPassOofNImpl implements
        BestTimeToBuyAndSellStockIII {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        // find out maxProfit for each day as selling day
        int[] maxProfitsSellingOn = calculateMaxProfitsSellingOn(prices);

        // find out maxProfit for each day as buying day
        int[] maxProfitsBuyingAfter = calculateMaxProfitsBuyingAfter(prices);

        // find out max(maxProfitSelling[i] + maxProfitBuying[i])
        // when 0 < i <= len - 1
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, maxProfitsSellingOn[i]
                    + maxProfitsBuyingAfter[i]);
        }
        return maxProfit;
    }

    private int[] calculateMaxProfitsSellingOn(int[] prices) {
        int lowest = prices[0];
        int[] maxProfitsSellingOn = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            int p = prices[i];
            lowest = Math.min(lowest, p);
            maxProfitsSellingOn[i] = p - lowest;
        }
        return maxProfitsSellingOn;
    }

    private int[] calculateMaxProfitsBuyingAfter(int[] prices) {
        int lowest = prices[prices.length - 1];
        int highest = prices[prices.length - 1];
        int maxProfit = 0;
        int[] maxProfitsBuyingAfter = new int[prices.length];
        for (int i = prices.length - 2; i >= 0; i--) {
            int p = prices[i];
            if (p > highest) {
                highest = p;
                lowest = p;
            } else {
                lowest = Math.min(lowest, p);
                maxProfit = Math.max(maxProfit, highest - lowest);
            }
            maxProfitsBuyingAfter[i] = maxProfit;
        }
        return maxProfitsBuyingAfter;
    }
}
