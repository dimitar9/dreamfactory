package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.LinkedListCycleImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class LinkedListCycleTest {
    private LinkedListCycle solution = new LinkedListCycleImpl();

    @Test
    public void small01() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ln1.next = ln2;
        ln2.next = ln1;

        assertTrue(solution.hasCycle(ln1));
    }

    @Test
    public void small02() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ln1.next = ln2;
        ln2.next = ln1;

        assertTrue(solution.hasCycle(ln1));
    }
}
