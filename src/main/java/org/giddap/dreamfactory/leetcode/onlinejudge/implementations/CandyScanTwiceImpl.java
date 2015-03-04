package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Candy;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Thought process: the actual value depends on both sides and they
 * can both change depending on the values that have not been explored.</li>
 * <li>Scan from left, calculate the values considering left neighbors
 * only</li>
 * <li>Scan from right, calculate the values considering right neighbors
 * only</li>
 * <li>Pick the larger one from both left and right for each position,
 * sum them up to get the minimum costs.</li>
 * </ul>
 *
 * 初始化所有小孩糖数目为1，
 * 从前往后扫描，如果第i个小孩等级比第i-1个高，那么i的糖数目等于
 * i-1的糖数目+1；
 * 从后往前扫描，如果第i个的小孩的等级比i+1个小孩高,但是糖的数目却小或者相等，
 * 那么i的糖数目等于i+1的糖数目+1。
 * <p/>
 * 该算法时间复杂度为O(N)
 */
public class CandyScanTwiceImpl implements Candy {
    public int candy(int[] ratings) {
        final int len = ratings.length;
        if (len == 0) {
            return 0;
        }
        // from left to right
        int[] l = new int[len];
        l[0] = 1;
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = 1;
            }
        }

        // from right to left
        int[] r = new int[len];
        r[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                r[i] = r[i + 1] + 1;
            } else {
                r[i] = 1;
            }
        }

        // look at both sides
        int totalCost = 0;
        for (int i = 0; i < len; i++) {
            totalCost += Math.max(l[i], r[i]);
        }

        return totalCost;
    }
}
