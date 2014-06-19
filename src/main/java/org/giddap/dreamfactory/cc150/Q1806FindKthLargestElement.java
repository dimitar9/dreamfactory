package org.giddap.dreamfactory.cc150;

import java.util.Random;

/**
 *
 */
public class Q1806FindKthLargestElement {
    private int findKthElement(int[] numbers, int left, int right, int rank) {
        if (left >= right) {
            return left - 1;
        }

        int pivot = left + new Random().nextInt(right - left);
        int leftEnd = partition(numbers, left, right, pivot);

        int leftSize = leftEnd - left + 1;
        if (leftSize == rank + 1) {
            return Math.max(numbers[left], numbers[leftEnd]);
        } else if (rank < leftSize) {
            return findKthElement(numbers, left, leftEnd, rank);
        } else {
            return findKthElement(numbers, leftEnd + 1, right, rank - leftSize);
        }
    }

    private int partition(int[] numbers, int left, int right, int pivot) {
        while (true) {
            while (left <= right && numbers[left] < pivot) {
                left++;
            }

            while (left <= right && numbers[right] > pivot) {
                right--;
            }

            if (left > right) {
                return left - 1;
            }

            swap(numbers, left, right);
        }
    }

    private void swap(int[] numbers, int a, int b) {
        int tmp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp;
    }
}
