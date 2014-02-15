package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q024SwapNodesInPairsImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Q024SwapNodesInPairsTest {
    private Q024SwapNodesInPairs solution = new Q024SwapNodesInPairsImpl();

    @Test
    public void small01() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next = two;
        two.next = three;
        three.next = four;

        ListNode actual = solution.swapPairs(one);

        assertNotNull(actual);
        assertEquals(two.val, actual.val);
        assertEquals(one.val, actual.next.val);
        assertEquals(four.val, actual.next.next.val);
        assertEquals(three.val, actual.next.next.next.val);
    }

    @Test
    public void small02() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode actual = solution.swapPairs(one);

        assertNotNull(actual);
        assertEquals(two.val, actual.val);
        assertEquals(one.val, actual.next.val);
        assertEquals(four.val, actual.next.next.val);
        assertEquals(three.val, actual.next.next.next.val);
        assertEquals(five.val, actual.next.next.next.next.val);
    }

    @Test
    public void small03() {
        ListNode one = new ListNode(1);

        ListNode actual = solution.swapPairs(one);

        assertNotNull(actual);
        assertEquals(one.val, actual.val);
    }
}
