package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.LRUCacheImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 弼馬溫注解：
 */
public class LRUCacheTest {
    private LRUCache solution;

    @Test
    public void small01() {
        solution = new LRUCacheImpl(3);

        solution.set(1, 1);
        solution.set(2, 2);
        solution.set(3, 3);

        assertEquals(1, solution.get(1));
        assertEquals(2, solution.get(2));
        assertEquals(3, solution.get(3));

        solution.set(4, 4);
        assertEquals(4, solution.get(4));
        assertEquals(2, solution.get(2));
        assertEquals(3, solution.get(3));

        assertEquals(-1, solution.get(1));
    }

    @Test
    public void small02() {
        solution = new LRUCacheImpl(2);

        solution.set(2, 1);
        solution.set(2, 2);
        assertEquals(2, solution.get(2));
        solution.set(1, 1);
        solution.set(4, 1);
        assertEquals(-1, solution.get(2));

    }
}
