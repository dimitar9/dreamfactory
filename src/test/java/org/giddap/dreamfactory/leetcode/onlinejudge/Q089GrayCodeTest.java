package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q089GrayCodeMathImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q089GrayCodeTest {
    private Q089GrayCode solution = new Q089GrayCodeMathImpl();

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
