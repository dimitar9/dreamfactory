package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.CompareVersionNumbersImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareVersionNumbersTest {
    private CompareVersionNumbers solution = new CompareVersionNumbersImpl();

    @Test
    public void small01() {
        assertEquals(0, solution.compareVersion("01", "1"));
    }

    @Test
    public void small02() {
        assertEquals(0, solution.compareVersion("1.0", "1"));
    }
}
