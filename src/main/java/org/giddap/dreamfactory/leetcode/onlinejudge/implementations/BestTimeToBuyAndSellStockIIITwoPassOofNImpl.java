package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.BestTimeToBuyAndSellStockIII;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time: O(n); Space: O(n) with extra storage for intermediate results
 * .</li>
 * <li>Thought Process
 * <ul>
 * <li>From the most basic case, only one transaction is allowed,
 * we can either scan forward OR backward to figure out the max profit.</li>
 * <li>Forward: on the iTH day:
 * <pre>
 * maxProfits[i] = Math.max(maxProfits[i - 1], prices[i] - currentLowest);
 * currentLowest = Math.min(currentLowest, prices[i]);
 * </pre>
 * </li>
 * <li>For the case of 'at most two transactions', we could then divide
 * the range into 2 sections: before (forward) and after (backward) and run
 * forware and backward scans, respectively to achieve overall O(n) time
 * complexity. </li>
 * </ul>
 * </li>
 * <li>
 * Solution summary:
 * <ol>
 * <li>Calculate and store the max profit before the iTH day via
 * forward scan.</li>
 * <li>Calculate and store the max profit after the iTH day via backwards
 * scan.</li>
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
        int[] maxProfitsBefore = calculateMaxProfitsBefore(prices);

        // find out maxProfit for each day as buying day
        int[] maxProfitsAfter = calculateMaxProfitsAfter(prices);

        // find out max(maxProfitSelling[i] + maxProfitBuying[i])
        // when 0 < i <= len - 1
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, maxProfitsBefore[i]
                    + maxProfitsAfter[i]);
        }
        return maxProfit;
    }

    private int[] calculateMaxProfitsBefore(int[] prices) {
        int lowest = prices[0];
        int[] maxProfits = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            maxProfits[i] = Math.max(maxProfits[i - 1], prices[i] - lowest);
            lowest = Math.min(lowest, prices[i]);
        }
        return maxProfits;
    }

    private int[] calculateMaxProfitsAfter(int[] prices) {
        int highest = prices[prices.length - 1];
        int[] maxProfits = new int[prices.length];
        for (int i = prices.length - 2; i >= 0; i--) {
            maxProfits[i] = Math.max(maxProfits[i + 1],
                    highest - prices[i]);
            highest = Math.max(highest, prices[i]);
        }
        return maxProfits;
    }
}
