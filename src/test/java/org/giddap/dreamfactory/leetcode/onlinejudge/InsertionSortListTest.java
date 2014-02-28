package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.InsertionSortListLinearSearchImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * 弼馬溫注解：
 */
public class InsertionSortListTest {
    InsertionSortList solution = new InsertionSortListLinearSearchImpl();

    @Test
    public void small01() {
        ListNode ln1 = new ListNode(1);

        ListNode actual = solution.insertionSortList(ln1);
        assertEquals(ln1.val, actual.val);
        assertNull(ln1.next);
    }

    @Test
    public void small02() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);

        ln1.next = ln2;
        ln2.next = ln3;

        ListNode actual = solution.insertionSortList(ln1);
        assertEquals(ln1.val, actual.val);
        assertEquals(ln2.val, actual.next.val);
        assertEquals(ln3.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }

    @Test
    public void small03() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);

        ln1.next = ln3;
        ln3.next = ln2;

        ListNode actual = solution.insertionSortList(ln1);
        assertEquals(ln1.val, actual.val);
        assertEquals(ln2.val, actual.next.val);
        assertEquals(ln3.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }

    @Test
    public void small04() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);

        ln3.next = ln2;
        ln2.next = ln1;

        ListNode actual = solution.insertionSortList(ln3);
        assertEquals(ln1.val, actual.val);
        assertEquals(ln2.val, actual.next.val);
        assertEquals(ln3.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }
}
