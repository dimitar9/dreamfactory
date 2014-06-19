package org.giddap.dreamfactory.cc150;

/**
 *
 */
public class Q1706MinimumSequenceToBeSorted {
    public int[] findMinimumSequenceToBeSorted(int[] nums) {
        final int len = nums.length;

        // figure out sorted left
        int sortedLeftEnd = 0;
        while (sortedLeftEnd < len - 1 && (nums[sortedLeftEnd] <= nums[sortedLeftEnd + 1])) {
            sortedLeftEnd++;
        }

        // figure out sorted right
        int sortedRightEnd = len - 1;
        while (sortedRightEnd > 0 && (nums[sortedRightEnd] >= nums[sortedRightEnd - 1])) {
            sortedLeftEnd++;
        }

        if (sortedLeftEnd + 1 == sortedRightEnd) {
            // already sorted
            return new int[2];
        }

        // figure out the min value after sortedLeftEnd
        int minAfterSortedLeftEndIdx = 0;
        int minAfterSortedLeftEnd = Integer.MAX_VALUE;
        for (int i = sortedLeftEnd + 1; i < sortedRightEnd; i++) {
            if (nums[i] < minAfterSortedLeftEnd) {
                minAfterSortedLeftEnd = nums[i];
                minAfterSortedLeftEndIdx = i;
            }
        }

        // figure out the max value before sortedLeftEnd
        int maxBeforeSortedRightEndIdx = 0;
        int maxBeforeSortedRightEnd = Integer.MIN_VALUE;
        for (int i = sortedRightEnd - 1; i > sortedLeftEnd; i--) {
            if (nums[i] > maxBeforeSortedRightEnd) {
                maxBeforeSortedRightEnd = nums[i];
                maxBeforeSortedRightEndIdx = i;
            }
        }

        //int m = 0;

        return new int[2];
    }
}
