package org.giddap.dreamfactory.cc150;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class Q0202FindNthNodeFromTheEndTest {
    private Q0202FindNthNodeFromTheEnd solution = new Q0202FindNthNodeFromTheEnd();

    @Test
    public void small01() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;

        ListNode actual = solution.findKthNodeFromEnd(one, 2);
        assertEquals(four.val, actual.val);
    }

    @Test
    public void small02() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;
        three.next = null;

        ListNode actual = solution.findKthNodeFromEnd(one, 5);
        assertEquals(two.val, actual.val);
    }

    @Test
    public void small03() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;
        three.next = null;

        ListNode actual = solution.findKthNodeFromEnd(one, 3);
        assertEquals(one.val, actual.val);

    }

    @Test
    public void small04() {
        ListNode one = new ListNode(1);

        one.next = null;

        ListNode actual = solution.findKthNodeFromEnd(one, 1);
        assertEquals(one.val, actual.val);
    }

    @Test
    public void small05() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        one.next = two;
        two.next = null;

        ListNode actual = solution.findKthNodeFromEnd(one, 2);
        assertEquals(one.val, actual.val);
    }

    @Test
    public void small06() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        one.next = two;

        ListNode actual = solution.findKthNodeFromEnd(one, 1);
        assertEquals(two.val, actual.val);
    }
}
