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
        final int n = prices.length;
        if (n < 2) {
            return 0;
        }
        // buy & sell before i-th day
        int[] sell = new int[n];
        int min = prices[0];
        int mp = 0;
        for (int i = 1; i < n; i++) {
            min = Math.min(prices[i - 1], min);
            mp = Math.max(prices[i] - min, mp);
            sell[i] = mp;
        }
        // buy & sell after i-th day
        int[] buy = new int[n];
        int max = prices[n - 1];
        mp = 0;
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(prices[i + 1], max);
            mp = Math.max(max - prices[i], mp);
            buy[i] = mp;
        }
        // calculate the max profit for each day
        // and pick the max
        mp = 0;
        for (int i = 0; i < n; i++) {
            // note: need to filter out negative profits
            mp = Math.max(sell[i] + buy[i], mp);
        }
        return mp;
    }
}
