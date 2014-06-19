package org.giddap.dreamfactory.geeksforgeeks.dynamicprogramming;

/**
 * Given an array of n positive integers. Write a program to find the sum of maximum sum subsequence of the given
 * array such that the integers in the subsequence are sorted in increasing order. For example, if input is
 * {1, 101, 2, 3, 100, 4, 5}, then output should be 106 (1 + 2 + 3 + 100), if the input array is {3, 4, 5, 10},
 * then output should be 22 (3 + 4 + 5 + 10) and if the input array is {10, 5, 4, 3}, then output should be 10.
 * <p/>
 * sum(i) =
 * Case 1: base case, where Sum(i) = A[i];
 * Case 2: max(sum(j)) + A[i], where 0 <= j < i and A[j] < A[i]
 */
public class Set14MaximumSumIncreasingSubsequence {
    public int findMaximumSumIncreasingSubsequence(int[] numbers) {
        int[] maxSums = new int[numbers.length];

        int maxSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            maxSums[i] = numbers[i];
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i]) {
                    maxSums[i] = Math.max(maxSums[i], maxSums[j] + numbers[i]);
                }
            }
            maxSum = Math.max(maxSum, maxSums[i]);
        }
        return maxSum;
    }
}
