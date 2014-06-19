package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock/">Best Time to Buy and Sell Stock</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p/>
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * <p/>
 *
 * @see <a href="http://leetcode.com/2010/11/best-time-to-buy-and-sell-stock.html">Leetcode blog</a>
 * @see <a href="http://discuss.leetcode.com/questions/94/best-time-to-buy-and-sell-stock">Leetcode discussion</a>
 */
public interface Q121BestTimeToBuyAndSellStock {
    int maxProfit(int[] prices);
}
