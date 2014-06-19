package org.giddap.dreamfactory.clrs3ed;

/**
 *
 */
public class Problem0204FindInversions {
    public int countInversions(int[] numbers) {
        return countInversions(numbers, 0, numbers.length - 1);
    }

    private int countInversions(int[] numbers, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = low + (high - low) / 2;

        int numInversions = 0;
        numInversions += countInversions(numbers, low, mid);
        numInversions += countInversions(numbers, mid + 1, high);
        numInversions += countInversionsByMergeSort(numbers, low, mid, high);
        return numInversions;
    }

    private int countInversionsByMergeSort(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = nums[left + i];
        }

        int i = 0;
        int j = mid - left + 1;

        int numOfInversions = 0;
        int previousSeenI = -1;

        for (int k = left; k <= right; k++) {
            System.out.println("i: " + i + ", j: " + j + ", k: " + k);
            if (i > mid - left) {
                nums[k] = tmp[j++];
            } else if (j >= tmp.length) {
                if (i != previousSeenI) {
                    System.out.println("hello increment numOfInversions from " + numOfInversions
                            + " to " + (numOfInversions + 1));
                    numOfInversions++;
                    previousSeenI = i;
                }
                nums[k] = tmp[i++];

            } else if (tmp[i] <= tmp[j]) {
                nums[k] = tmp[i++];
            } else {
                System.out.println("world increment numOfInversions from " + numOfInversions
                        + " to " + (numOfInversions + 1));
                numOfInversions++;
                previousSeenI = i;
                nums[k] = tmp[j++];
            }
        }
        return numOfInversions;
    }
}
