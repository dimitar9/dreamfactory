package org.giddap.dreamfactory.leetcode.onlinejudge;


import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q075SortColorsImpl;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class Q075SortColorsTest {
    private Q075SortColors solution = new Q075SortColorsImpl();

    @Test
    public void small01() {
        int[] input = {2, 0};
        int[] expected = Arrays.copyOf(input, input.length);
        Arrays.sort(expected);

        solution.sortColors(input);

        assertEquals(expected.length, input.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], input[i]);
        }
    }
}

/*
Test cases
Input	 Output	 Expected
[0]	[0]	[0]
[1]	[1]	[1]
[2]	[2]	[2]
[0,0]	[0,0]	[0,0]
[1,1]	[1,1]	[1,1]
[2,2]	[2,2]	[2,2]
[0,1]	[0,1]	[0,1]
[1,0]	[0,1]	[0,1]
[0,2]	[0,2]	[0,2]
[2,0]	[0,2]	[0,2]
[1,2]	[1,2]	[1,2]
[2,1]	[1,2]	[1,2]
[0,1,2]	[0,1,2]	[0,1,2]
[0,2,1]	[0,1,2]	[0,1,2]
[1,0,2]	[0,1,2]	[0,1,2]
[1,2,0]	[0,1,2]	[0,1,2]
[2,0,1]	[0,1,2]	[0,1,2]
[2,1,0]	[0,1,2]	[0,1,2]
[0,0,1]	[0,0,1]	[0,0,1]
[0,1,0]	[0,0,1]	[0,0,1]
[1,0,0]	[0,0,1]	[0,0,1]
[1,1,0]	[0,1,1]	[0,1,1]
[1,0,1]	[0,1,1]	[0,1,1]
[0,1,1]	[0,1,1]	[0,1,1]
[0,0,2]	[0,0,2]	[0,0,2]
[0,2,0]	[0,0,2]	[0,0,2]
[2,0,0]	[0,0,2]	[0,0,2]
[2,2,0]	[0,2,2]	[0,2,2]
[2,0,2]	[0,2,2]	[0,2,2]
[0,2,2]	[0,2,2]	[0,2,2]
[1,1,2]	[1,1,2]	[1,1,2]
[1,2,1]	[1,1,2]	[1,1,2]
[2,1,1]	[1,1,2]	[1,1,2]
[2,2,1]	[1,2,2]	[1,2,2]
[2,1,2]	[1,2,2]	[1,2,2]
[1,2,2]	[1,2,2]	[1,2,2]
[2,1,1,0]	[0,1,1,2]	[0,1,1,2]
[1,2,0,0]	[0,0,1,2]	[0,0,1,2]
[0,0,1,0,1,1]	[0,0,0,1,1,1]	[0,0,0,1,1,1]
[1,2,2,2,2,0,0,0,1,1]	[0,0,0,1,1,1,2,2,2,2]	[0,0,0,1,1,1,2,2,2,2]
[0,2,2,2,0,2,1,1]	[0,0,1,1,2,2,2,2]	[0,0,1,1,2,2,2,2]
[0,2,1,2,0,2,0,1]	[0,0,0,1,1,2,2,2]	[0,0,0,1,1,2,2,2]
[1,1,2,0,1,1,1,2]	[0,1,1,1,1,1,2,2]	[0,1,1,1,1,1,2,2]
[1,1,1,2]	[1,1,1,2]	[1,1,1,2]
[2,1,2,0,1,1,1,1]	[0,1,1,1,1,1,2,2]	[0,1,1,1,1,1,2,2]
[0,1,2,0,0,2,2,1]	[0,0,0,1,1,2,2,2]	[0,0,0,1,1,2,2,2]
[1,0,0,2,2]	[0,0,1,2,2]	[0,0,1,2,2]
[1,2,2,1,2,0]	[0,1,1,2,2,2]	[0,1,1,2,2,2]
[1,1,0,0,1,1]	[0,0,1,1,1,1]	[0,0,1,1,1,1]
[1,1,1,2,2,0,1]	[0,1,1,1,1,2,2]	[0,1,1,1,1,2,2]
[1,0,1,2,1,0,0,0]	[0,0,0,0,1,1,1,2]	[0,0,0,0,1,1,1,2]
[0,1,0,2,1,0,1,2]	[0,0,0,1,1,1,2,2]	[0,0,0,1,1,1,2,2]
[2,0,0,0,0,1,2,2]	[0,0,0,0,1,2,2,2]	[0,0,0,0,1,2,2,2]
[1,0,1,2,1,2]	[0,1,1,1,2,2]	[0,1,1,1,2,2]
[1,1,2,0,2,1,0,0,2,2]	[0,0,0,1,1,1,2,2,2,2]	[0,0,0,1,1,1,2,2,2,2]
[2,2,0,0,2,0,2,1,0]	[0,0,0,0,1,2,2,2,2]	[0,0,0,0,1,2,2,2,2]
[2,2,1,2,1,1,1,0,0,2,1,0,2,1,2,2,1,1,1,1,1,0,2,0,2,0,2,2,1,0,2,1,0,2,1,2,0,0,0,0,2,1,1,2,0,1,2,2,0,0,2,2,0,1,0,1,0,0,1,1,1,0,0,2,2,2,1,0,0,2,1,0,1,0,2,2,1,2,1,1,2,1,1,0,0,2,1,0,0]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,1,1,0,1,1,0,0,2,0,0,1,1,2,1,1,1,2,0,0,2,0,2,1,1,0,1,0,0,1,0,2,1,2,2,2,1,0]	[0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2]
[1,0,1,2,2,0,0,0,2,0,1,0,0,1,0,2,0,0,0,1,1,0,2,1,1,2,1,0,1,2,2,2,0,0,2,0,1,0,1,1,0,0,1,2,1,2,2,2,0,0,0,2,0,1,1,2,1,2,0,2,2,2,2,0,0,1,1,1,2,2,2,0,0,1,2,0,1,2,2,2,0,1,2,1,0,1,1,1,1,1,0,1,1,0,2,2,2,1,1,1,1,0,1,2,2,2,0]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,0,1,1,1,1,0,2,2,1,0,0,0,1,2,2,1,2,1,0,0,2,2,2,0,1,2,0,1,2,2,2,2,0,2,2,2,2,1,2,1,0,0,2,1,0,1,0,0,0,1,1,0,1,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[0,0,1,2,0,2,1,1,0,1,1,0,1,0,2,2,0,0,2,2,2,1,0,2,1,1,1,2,0,0,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,2,0,1,1,2,1,1,2,2,0,1,1,1,0,0,2,1,2,0,2,0,1,2,2,2,0,2,0,2,1,2,1,2,0,0,1,1,2,0,1,2,0,0,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,1,0,0,2,2,1,2,1,0,1,2,1,1,1,2,0,1,2,0,1,0,2,1,2,1,2,2,1,0,1,2,2,1,0,2,0,1,1,1,0,2,2,1,2,0,0]	[0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,2,1,0,0,0,0,2,2,2,2,1,2,0,1,2,1,0,1,2,2,2,2,2,2,1,0,1,2,1,2,1,1,0,2,2,1,2,2,1,2,2,0,2,0,2,1,0,0,0,2,0,0,1,0,2,2,1,1,2,0,0,1,2,1,1,1,0,2,0,2,1,0,2,0,2,0,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[0,2,1,0,1,2,0,1,1,2,1,1,2,0,1,1,0,2,1,2,1,1,1,2,0]	[0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2]	[0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2]
[1,1,2,1,2,0,1,1,0,0,0,1,2,2,0,1,2,0,1,0,1,1,0,0,1,2,1,0,1,2,0,1,2,0,2,1,1,1,0,0,1,1,1,1,1,0,0,0,0,1,1,0,1,1,1,0,1,2,1,2,2,2,1,1,0,1,0,2,2,1,2,2,0,2,0,1,0,0,2,1,2,0,1,1,2,2,0,0,2,1,0,2,1,2,1,2,1,2,2,1,1,2,0,1,2,1,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[2,2,0,0,2,0,1,2,0,2]	[0,0,0,0,1,2,2,2,2,2]	[0,0,0,0,1,2,2,2,2,2]
[0,1,1,0,0,1,1,0,2,1,2,1,2,2,0,0,1,1,1,1,2,0,0,2,1,0,1,0,0,1,2,0,0,0,1,1,1,0,2,1,1,1,2,1,1,0,2,0,0,0,2,2,2,2,2,0,0,0,1,0,2,0,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,0,2,0,1,1,1,0,0,2,2,2,2,1,2,2,0,2,2,2,2,1,0,2,0,2,1,2,1,0,1,2,1,0,0,0,2,2,1,0,1,0,2,2,2,2,2,0,2,2,0,2,1,0,2,1,1,0,2,2,1,0,2,2,0,0,0,0,0,1,0,2,2,0,2,0,0,2,0,0,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[2,2,2,2,2,0,2,1,0,1,1,0,1,2,1,2,1,1,1,1,2,1,2,1,1,2,1,0,0,0,2,2,1,2,0,0,1,2,1,1,2,0,2,0,0,2,2,1,1,1,0]	[0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,0,0,0,0,1,0,0,2,0,0,0,1,0,1,2,1,2,1,0,0,2,1,0,1,1,2,2,0,0,1,1,0,2,1,1,0,0,1,0,1,1,1,2,0,2,2,1,2,2,1,2,1,2,1,0,0,1,0,1,1,1,0,2,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[0,2,1,2,0,0,1,2,1,1,1,0,2,1,2,1,1,1,1,2,1,0,0,0,1,2,2,0,2,1,0,0,1,2,2,1,2,1,0,0,0,0,2,0,2,1,2,1,1,1,1,0,1,2,0,0,0,0,0,0,2,1,1,0,0,1,1,0,0,0,0,1,1,2,2,0,2,1,1,1,2,0,1,1,1,0,2,1,1,2,2,0,1,0,0,1,0,2,2,1,2,1,2,0,0]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,0,1,1,2,1,1,1,0,0,2,2,2,0,2,2,1,0,0,1,0,0,1,2,2,1,0,2,2,2,2,1,0,1,2,0,2,1,2,0,0,1,0,2,1,0,1,0,0,0,1,0,0,0,1,0,1,2,0,1,1,0,0,0,1,0,0,1,2,2,0,2,1,0,0,0,0,2,0,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[0,0,2,1,1,2,1,1,1,0,2,1,0,1,2,1,0,1,1,1,2,2,1,2,0,0,1,0,2,1,2,2,2,0]	[0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2]
[0,2,1,0,0,2,2,2,1,1,1,2,2,2,2,0]	[0,0,0,0,1,1,1,1,2,2,2,2,2,2,2,2]	[0,0,0,0,1,1,1,1,2,2,2,2,2,2,2,2]
[2,1,1,0,2,0,0,1,1,1,2]	[0,0,0,1,1,1,1,1,2,2,2]	[0,0,0,1,1,1,1,1,2,2,2]
[2,1,0,1,0,0,2,2,1,1,0,2,2,1,1,2,0,1,2,2,0,0,0,0,1,2,1,2,1,1,0,0,2,2,1,0,0,1,0,1,2,1,0,2,2,2,2,0,0,2,0,2,1,0,2,2,0,1,0,1,0,0,1,0,0,0,1,1,1,2,0,1,0,2,0,0,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[0,0,2,1,2,0,0,1,1,0,0,1,2,0,2,1,1,0,2,0,2,0,2,0,0,0,2,0,1,2,1,2,2,2,1,2,0,2,0,1,0,0,2,0,2,0,1,1,1,1,1,1,0,1,1,0,1,2,0,0,1,2,0,1,2,2,0,2,2,1,1,2,2,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,2,2,2,0,1,1,1,1,0,1,1,2,0,2,0,2,2,1,1,1,0,2,1,2,1,0,2,0,2,2,0,2,2]	[0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[2,0,2,2,2,2,0,0,2,1,2,0,1,0,1,0,1,2,2,0,2,0,0,2,1,0,1,1,2,1,1,2,1,1,1,0,0,1,1,1,0,2,1,1,2,0,2,1,0,1,2,2,2,0,1,1,0,1,2,0,2,1,0,2,2,2,0,1,2,2,2,2,1,0,2,1,1,1,2,1,1,1,2,0,2,1,2,0,2,2,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[0,2,2,1,1,2,2,1,2,2,1,1,2,1,2,2,0,2,0,1,0,2,0,0,1,2,1,1,1,0,1,0,0,1,2,2,2,2,1,1,1,2,0,1,1,2,0,1,2,1,0]	[0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,1,1,0,0,0,2,0,1,1,1,1,1,0,1,0,0,2,1,1,2,2,2,0,0,1,1,2,2,2,0,1,0,0,0,1,0]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2]
[2,0,1,1,1,2,1,2,0,2,1,2,0,1,2,0,1,2,1,0,2,1,2,0,1,1,0,1,0,2,1,2,2,0,0,0,1,2,1,1,1,0,1,2,2,1,2,0,0,2,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[0,2,1,1,0,2,0,0,1,1,2,1,2,0,0,1,0,1,2,1,2,2,0,2,0,0,0,1,2,2,0,1,1,2,0,1,1,1,1,1,0,1,2,0,2,0,1,2,2,1,0,2,0,1,1,1,0]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[0,2,2,0,1,0,2,2,0,2,1,2,0,1,1,0,2,0,2,0,0,1,2,1,1,0,1,1,2,1,0,0,0,0,1,0,2,1,2,2,1,0,1,1,2,0,2,1,2,1,0,2,1,2,1,2,1,2,0,0,1,2,0,2,0,2,0,2,1,2,2,0,0,2,2,0,2,1,2,1,1,2,1]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[2,1,2,0,0,1,2,2,1,0,2,1,0,0,2,1,0,1,2,0,0,1,0,1,0,0,2,2,0,2,2,1,0,2,2,1,0,1,1,1,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
[1,2,1,0,2,1,1,1,2,0,0,0,1,1,1,1,0,2,0,0,1,0,2,0,0,1,2,1,0]	[0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2]	[0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2]
*/