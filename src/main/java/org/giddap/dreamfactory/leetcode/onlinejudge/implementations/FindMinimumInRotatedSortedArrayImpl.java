package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.FindMinimumInRotatedSortedArray;

public class FindMinimumInRotatedSortedArrayImpl implements
        FindMinimumInRotatedSortedArray {
    @Override
    public int findMin(int[] num) {
        final int len = num.length;
        int low = 0;
        int high = len - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (num[low] <= num[mid]) {
                if (num[mid] < num[high]) { // sorted entirely
                    break;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid;
            }
        }
        return num[low];
    }
}
