package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RemoveElementImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
    private RemoveElement solution = new RemoveElementImpl();

    @Test
    public void small01() {
        int[] input = {1, 1, 2};

        int actual = solution.removeElement(input, 1);
        assertEquals(1, actual);
        assertEquals(input[0], 2);
    }
}
