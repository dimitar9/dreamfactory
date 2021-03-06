package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.ReverseLinkedListIIIterativeImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class ReverseLinkedListIITest {
    private ReverseLinkedListII solution = new ReverseLinkedListIIIterativeImpl();

    @Test
    public void small01() {
        ListNode n1 = new ListNode(5);

        ListNode actual = solution.reverseBetween(n1, 1, 1);
        assertEquals(n1.val, actual.val);
    }

    @Test
    public void small02() {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(5);
        n1.next = n2;

        ListNode actual = solution.reverseBetween(n1, 2, 2);
        assertEquals(n1.val, actual.val);
        assertEquals(n2.val, actual.next.val);
    }
}
