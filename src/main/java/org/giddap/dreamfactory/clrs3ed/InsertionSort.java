package org.giddap.dreamfactory.clrs3ed;

/**
 *
 */
public class InsertionSort {
    public void sort(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            j++;
            nums[j] = key;
        }
    }
}
