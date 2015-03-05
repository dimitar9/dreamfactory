package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.SingleNumberIIWithArrayImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberIITest {
    private SingleNumberII solution = new SingleNumberIIWithArrayImpl();

    @Test
    public void small01() {
        assertEquals(-4, solution.singleNumber(new int[]{-2,-2,1,1,-3,1,-3,-3,-4,-2}));
    }
}
