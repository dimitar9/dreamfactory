package org.giddap.dreamfactory.cc150;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.SortList;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.SortListDivideAndConquerImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 *
 */
public class SortListTest {
    private SortList solution = new SortListDivideAndConquerImpl();

    @Test
    public void small01() {
        ListNode ln1 = new ListNode(1);

        ListNode actual = solution.sortList(ln1);
        assertNotNull(actual);
        assertEquals(ln1.val, actual.val);
        assertNull(actual.next);
    }

    @Test
    public void small02() {
        ListNode ln1 = new ListNode(3);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(4);

        ln1.next = ln2;
        ln2.next = ln3;

        ListNode actual = solution.sortList(ln1);
        assertNotNull(actual);
        assertEquals(ln2.val, actual.val);
        assertEquals(ln1.val, actual.next.val);
        assertEquals(ln3.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }
}
