package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.ReorderListImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReorderListTest {
    private ReorderList solution = new ReorderListImpl();

    @Test
    public void small01() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ln1.next = ln2;

        solution.reorderList(ln1);

        assertEquals(ln1.val, ln1.val);
        assertEquals(ln2.val, ln1.next.val);
        assertNull(ln1.next.next);
    }

    @Test
    public void small02() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ln1.next = ln2;
        ln2.next = ln3;

        solution.reorderList(ln1);

        assertEquals(ln1.val, ln1.val);
        assertEquals(ln3.val, ln1.next.val);
        assertEquals(ln2.val, ln1.next.next.val);
        assertNull(ln1.next.next.next);
    }

    @Test
    public void small03() {
        ListNode ln1 = new ListNode(1);

        solution.reorderList(ln1);

        assertEquals(ln1.val, ln1.val);
        assertNull(ln1.next);
    }

    @Test
    public void small04() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;

        solution.reorderList(ln1);

        assertEquals(ln1.val, ln1.val);
        assertEquals(ln4.val, ln1.next.val);
        assertEquals(ln2.val, ln1.next.next.val);
        assertEquals(ln3.val, ln1.next.next.next.val);
        assertNull(ln1.next.next.next.next);
    }
}
