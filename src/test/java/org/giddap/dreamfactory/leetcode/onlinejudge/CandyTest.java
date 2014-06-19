package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.CandyImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyTest {
    private Candy solution = new CandyImpl();

    @Test
    public void small01() {
        int[] input = {1, 2, 2};
        assertEquals(4, solution.candy(input));
    }
}
