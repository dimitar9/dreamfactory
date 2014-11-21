package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.FindMinimumInRotatedSortedArrayII;

/**
 *
 */
public class FindMinimumInRotatedSortedArrayIIImpl
        implements FindMinimumInRotatedSortedArrayII {
    @Override
    public int findMin(int[] num) {
        int left = 0;
        int right = num.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (num[left] < num[mid]) { // left is sorted
                if (num[left] >= num[right]) {// pivot is on the right
                    left = mid + 1;
                } else { // sorted entirely
                    // 'min' is 'num[left]';
                    break;
                }
            } else if (num[left] > num[mid]) { // pivot is on the left
                right = mid;
            } else { // duplicates on 'left' and 'mid'
                if (num[mid] == num[right]) {
                    left += 1;
                    right -= 1;
                } else if (num[mid] > num[right]) { // left is flat
                    left = mid + 1;
                } else { // entirely sorted
                    break;
                }
            }
        }

        return num[left];
    }
}
