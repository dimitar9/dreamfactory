package org.giddap.dreamfactory.cc150;

import org.giddap.dreamfactory.commons.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 *
 */
public class Q0201RemoveDuplicateListNodeTest {
    private Q0201RemoveDuplicateListNode solution = new Q0201RemoveDuplicateListNode();

    @Test
    public void small01() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode actual = solution.removeDuplicatesWithExtraSpace(n1);

        assertNotNull(actual);

        assertEquals(n1.val, actual.val);
        assertEquals(n2.val, actual.next.val);
        assertEquals(n3.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }

    @Test
    public void small02() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode actual = solution.removeDuplicatesWithExtraSpace(n1);

        assertNotNull(actual);

        assertEquals(n1.val, actual.val);
        assertEquals(n2.val, actual.next.val);
        assertEquals(n4.val, actual.next.next.val);
        assertNull(actual.next.next.next);
    }

    @Test
    public void small03() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode actual = solution.removeDuplicatesWithExtraSpace(n1);

        assertNotNull(actual);

        assertEquals(n1.val, actual.val);
        assertEquals(n2.val, actual.next.val);
        assertEquals(n3.val, actual.next.next.val);
        assertEquals(n4.val, actual.next.next.next.val);
        assertNull(actual.next.next.next.next);
    }
}
