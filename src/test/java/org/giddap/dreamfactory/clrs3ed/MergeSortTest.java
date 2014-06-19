package org.giddap.dreamfactory.clrs3ed;


import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class MergeSortTest {
    private MergeSort mergeSort = new MergeSort();

    @Test
    public void small01() {
        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            input[i] = new Random().nextInt(100);
        }

        int[] expected = input.clone();
        Arrays.sort(expected);

        mergeSort.sort(input);
        assertEquals(expected.length, input.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], input[i]);
        }
    }
}
