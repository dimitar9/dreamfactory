package org.giddap.dreamfactory.clrs3ed;

/**
 *
 */
public class MergeSort {
    public void sort(int[] nums) {
        sortRecursively(nums, 0, nums.length - 1);
    }

    private void sortRecursively(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sortRecursively(nums, left, mid);
        sortRecursively(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = nums[left + i];
        }

        int i = 0;
        int j = mid - left + 1;

        for (int k = left; k <= right; k++) {
            if (i > mid - left) {
                nums[k] = tmp[j++];
            } else if (j >= tmp.length) {
                nums[k] = tmp[i++];
            } else if (tmp[i] <= tmp[j]) {
                nums[k] = tmp[i++];
            } else {
                nums[k] = tmp[j++];
            }
        }
    }
}
