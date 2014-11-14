package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PermutationSequence;

import java.util.Arrays;

/**
 *
 */
public class PermutationSequenceImpl implements PermutationSequence {
    @Override
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }

        for (int i = 2; i <= k; i++) {
            getNext(nums);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        return sb.toString();
    }

    private void getNext(int[] num) {
        final int len = num.length;

        int i = len - 1;
        while (i > 0 && num[i - 1] >= num[i]) {
            i--;
        }

        if (i == 0) {
            return;
        }

        int j = len - 1;
        while (j >= i && num[i - 1] >= num[j]) {
            j--;
        }

        // swap
        int tmp = num[i - 1];
        num[i - 1] = num[j];
        num[j] = tmp;

        // sort i till len - 1
        Arrays.sort(num, i, len);
    }
}
