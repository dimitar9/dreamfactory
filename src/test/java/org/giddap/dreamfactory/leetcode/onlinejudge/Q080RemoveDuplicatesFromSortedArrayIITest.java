package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q080RemoveDuplicatesFromSortedArrayIIImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q080RemoveDuplicatesFromSortedArrayIITest {
    private Q080RemoveDuplicatesFromSortedArrayII solution = new Q080RemoveDuplicatesFromSortedArrayIIImpl();

    @Test
    public void small01() {
        int actual = solution.removeDuplicates(new int[]{1, 1, 1});
        assertEquals(2, actual);
    }

    @Test
    public void small02() {
        int actual = solution.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
        assertEquals(5, actual);
    }

    @Test
    public void small03() {
        int actual = solution.removeDuplicates(new int[]{1, 1, 1, 2, 2, 2, 3, 3});
        assertEquals(6, actual);
    }

    @Test
    public void small04() {
        int actual = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 2, 2, 4});
        assertEquals(7, actual);
    }
}
