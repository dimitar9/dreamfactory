package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.LinkedListCycleIIImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListCycleIITest {
    private LinkedListCycleII solution = new LinkedListCycleIIImpl();

    @Test
    public void small01() {
        ListNode head = new ListNode(1);
        assertNull(solution.detectCycle(head));
    }

    @Test
    public void small02() {
        ListNode head = new ListNode(1);
        head.next = head;
        assertEquals(head, solution.detectCycle(head));
    }
}
