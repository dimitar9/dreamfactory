package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.GrayCodeMathImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrayCodeTest {
    private GrayCode solution = new GrayCodeMathImpl();

    @Test
    public void small01() {
        assertEquals(Lists.newArrayList(0), solution.grayCode(0));
    }

    @Test
    public void small02() {
        assertEquals(Lists.newArrayList(0, 1), solution.grayCode(1));
    }

    @Test
    public void small03() {
        assertEquals(Lists.newArrayList(0, 1, 3, 2), solution.grayCode(2));
    }

}
