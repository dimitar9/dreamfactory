package org.giddap.dreamfactory.mitbbs;

/**
 * Problem statement:
 * Given two sorted arrays, A and B, find minimal |A[i] - B[j]|.
 * <p/>
 * http://stackoverflow.com/questions/12233939/best-algorithm-to-find-the-minimum-absolute-difference-between-two-numbers-in-an
 * http://www.mitbbs.com/article_t/JobHunting/32603691.html
 */
public class FindMinimumAbsoluteDifferenceBetweenTwoNumbersFromTwoSortedArrays {
    public int find(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;

        int i = 0;
        int j = 0;

        int minAbsDiff = Integer.MAX_VALUE;
        while (i < aLen && j < bLen) {
            minAbsDiff = Math.min(minAbsDiff, Math.abs(a[i] - b[j]));

            if (a[i] == b[j]) {
                return minAbsDiff;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return minAbsDiff;
    }
}
