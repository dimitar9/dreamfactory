package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximumProductSubarray;

/**
 * 第二次优化，其实子数组乘积最大值的可能性为：
 * 累乘的最大值碰到了一个正数；或者，累乘的最小值（负数），碰到了一个负数。
 * 所以每次要保存累乘的最大（正数）和最小值（负数）。同时还有一个选择起点的逻辑，
 * 如果之前的最大和最小值同当前元素相乘之后，没有当前元素大（或小）那么当前元素就可作为新的起点。
 * 例如，前一个元素为0的情况，{1,0,9,2}，到9的时候9应该作为一个最大值，
 * 也就是新的起点，{1,0,-9,-2}也是同样道理，-9比当前最小值还小，所以更新为当前最小值。
 * 这种方法只需要遍历一次数组即可，算法时间复杂度为O(n)。
 */
public class MaximumProductSubarrayDpImpl implements MaximumProductSubarray {
    public int maxProduct(int A[]) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int maxProduct = A[0];
        int max_temp = A[0];
        int min_temp = A[0];

        for (int i = 1; i < A.length; i++) {
            int a = A[i] * max_temp;
            int b = A[i] * min_temp;
            max_temp = Math.max(Math.max(a, b), A[i]);
            min_temp = Math.min(Math.min(a, b), A[i]);
            maxProduct = Math.max(maxProduct, max_temp);
        }
        return maxProduct;
    }
}
