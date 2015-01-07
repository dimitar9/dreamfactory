package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.NextPermutation;

public class NextPermutationImpl implements NextPermutation {

    @Override
    public void nextPermutation(int[] num) {
        final int n = num.length;
        if (n <= 1) {
            return;
        }
        // Starting from the end,
        // find i such that num[i] < num[i + 1]
        int i = num.length - 2;
        while (i >= 0 && num[i] >= num[i + 1]) {
            i--;
        }
        if (i == -1) {
            // this is already the max
            // need to reverse the string to get the min
            reverse(num, 0, n);
            return;
        }
        // Starting from the end,
        // find j such that num[j] is the first number
        // that is larger than num[i]
        int j = num.length - 1;
        while(j > i && num[j] <= num[i]) {
            j--;
        }
        // swap num[i] with num[j]
        swap(num, i, j);

        // reverse between i + 1 and the end;
        reverse(num, i + 1, n);
    }

    private void reverse(int[] numbers, final int s, final int e) {
        int l = s;
        int r = e - 1;
        while (l < r) {
            swap(numbers, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
