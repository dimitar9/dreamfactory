package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q031NextPermutation;

public class Q031NextPermutationImpl implements Q031NextPermutation {

    @Override
    public void nextPermutation(int[] num) {
        final int len = num.length;
        if (len == 0) {
            return;
        }
        // initialize i to the right-most
        int i = len - 1;
        while (i > 0 && num[i - 1] >= num[i]) {
            i--;
        }
        i--;

        if (i < 0) {
            reverse(num, 0, len);
            return;
        }

        int j = len - 1;
        while (i < j && num[i] >= num[j]) {
            j--;
        }

        swap(num, i, j);

        i++;
        reverse(num, i, len);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int start, int endExclusive) {
        int left = start;
        int right = endExclusive - 1;

        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
