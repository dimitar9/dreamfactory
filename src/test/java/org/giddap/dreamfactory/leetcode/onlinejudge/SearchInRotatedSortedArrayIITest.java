package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.SearchInRotatedSortedArrayIIImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchInRotatedSortedArrayIITest {
    private SearchInRotatedSortedArrayII solution = new SearchInRotatedSortedArrayIIImpl();

    @Test
    public void small01() {
        assertTrue(solution.search(new int[]{9, 13, 2, 4, 4, 5, 8}, 13));
    }

    @Test
    public void small02() {
        assertFalse(solution.search(new int[]{9, 13, 2, 4, 4, 5, 8}, 3));
    }

    @Test
    public void small03() {
        assertTrue(solution.search(new int[]{9, 13, 2, 4, 4, 5, 8}, 5));
    }

    @Test
    public void small04() {
        assertTrue(solution.search(new int[]{9, 13, 14, 15, 18, 5, 8}, 18));
    }

    @Test
    public void small05() {
        assertFalse(solution.search(new int[]{9, 13, 14, 15, 18, 5, 8}, 12));
    }

    @Test
    public void small06() {
        assertFalse(solution.search(new int[]{9}, 12));
    }

    @Test
    public void small07() {
        assertTrue(solution.search(new int[]{12}, 12));
    }

    @Test
    public void small08() {
        assertTrue(solution.search(new int[]{9, 12}, 12));
    }

    @Test
    public void small09() {
        assertTrue(solution.search(new int[]{19, 12}, 12));
    }

    @Test
    public void small10() {
        assertFalse(solution.search(new int[]{12, 12}, 11));
    }

    @Test
    public void small11() {
        assertTrue(solution.search(new int[]{1, 3, 1, 1, 1}, 3));
    }

    @Test
    public void small12() {
        assertTrue(solution.search(new int[]{3, 1, 1}, 3));
    }
}
