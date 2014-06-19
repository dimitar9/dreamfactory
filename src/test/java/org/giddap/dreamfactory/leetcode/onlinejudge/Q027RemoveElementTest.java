package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q027RemoveElementImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q027RemoveElementTest {
    private Q027RemoveElement solution = new Q027RemoveElementImpl();

    @Test
    public void small01() {
        int[] input = {1, 1, 2};

        int actual = solution.removeElement(input, 1);
        assertEquals(1, actual);
        assertEquals(input[0], 2);
    }
}
