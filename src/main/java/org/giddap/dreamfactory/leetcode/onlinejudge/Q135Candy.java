package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/candy/
 * <p/>
 * There are N children standing in a line. Each child is assigned a rating value.
 * <p/>
 * You are giving candies to these children subjected to the following requirements:
 * <p/>
 * <ul>
 * <li>Each child must have at least one candy.</li>
 * <li>Children with a higher rating get more candies than their neighbors.</li>
 * </ul>
 * What is the minimum candies you must give?
 */
public interface Q135Candy {
    int candy(int[] ratings);
}
