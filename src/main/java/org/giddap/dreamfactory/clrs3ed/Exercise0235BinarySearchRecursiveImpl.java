package org.giddap.dreamfactory.clrs3ed;

/**
 *
 */
public class Exercise0235BinarySearchRecursiveImpl {
    public int doBinarySearch(int[] nums, int target) {
        return recursiveBS(nums, target, 0, nums.length - 1);
    }

    private int recursiveBS(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        final int mid = low + (high - low) / 2;

        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return recursiveBS(nums, target, mid + 1, high);
        } else {
            return recursiveBS(nums, target, low, mid - 1);
        }
    }
}
