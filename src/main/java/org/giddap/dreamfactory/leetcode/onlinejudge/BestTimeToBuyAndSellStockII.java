package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">
 *     Best Time To Buy And Sell Stock II</a>
 * <p/>
 * Say you have an array for which the ith element is the price of a given
 * stock on day i.
 * <p/>
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 */
public interface BestTimeToBuyAndSellStockII {
    int maxProfit(int[] prices);
}
