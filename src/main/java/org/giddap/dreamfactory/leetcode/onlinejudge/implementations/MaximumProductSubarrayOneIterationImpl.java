package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximumProductSubarray;

/**
 * max_product = max{
 *   A[i]*min_product (when A[i]<0),
 *   A[i]*max_product (when A[i]>0),
 *   A[i] (when 0 occurs before A[i])
 * }.
 * <p>
 * min_product = min{
 *   A[i]*min_product,
 *   A[i]*max_product,
 *   A[i]
 * }.
 */
public class MaximumProductSubarrayOneIterationImpl
        implements MaximumProductSubarray {
    @Override
    public int maxProduct(int[] A) {
        int maxp = Integer.MIN_VALUE;
        int prevMinProd = 1;
        int currentProd = 1;
        for (int a : A) {
            currentProd *= a;
            if (a == 0) {
                maxp = Math.max(maxp, 0);
                prevMinProd = 1;
                currentProd = 1;
            } else if (a > 0) {
                maxp = Math.max(maxp, currentProd);
                if (prevMinProd < 0) {
                    prevMinProd *= a;
                }
            } else { // a < 0
                int tmp = prevMinProd * a;
                maxp = Math.max(maxp, tmp);
                prevMinProd = currentProd;
                currentProd = Math.max(tmp, 1);
            }
        }
        return maxp;
    }
}
