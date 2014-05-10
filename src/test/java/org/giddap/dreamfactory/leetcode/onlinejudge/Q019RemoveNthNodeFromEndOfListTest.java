package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q019RemoveNthNodeFromEndOfListImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Q019RemoveNthNodeFromEndOfListTest {
    private Q019RemoveNthNodeFromEndOfList solution = new Q019RemoveNthNodeFromEndOfListImpl();

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

        ListNode actual = solution.removeNthFromEnd(one, 2);
        assertEquals(one.val, actual.val);
        assertEquals(two.val, actual.next.val);
        assertEquals(three.val, actual.next.next.val);
        assertEquals(five.val, actual.next.next.next.val);

    }

    @Test
    public void small02() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;
        three.next = null;

        ListNode actual = solution.removeNthFromEnd(one, 5);
        assertEquals(one.val, actual.val);
        assertEquals(three.val, actual.next.val);

    }

    @Test
    public void small03() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;
        three.next = null;

        ListNode actual = solution.removeNthFromEnd(one, 3);
        assertEquals(two.val, actual.val);
        assertEquals(three.val, actual.next.val);

    }

    @Test
    public void small04() {
        ListNode one = new ListNode(1);

        one.next = null;

        ListNode actual = solution.removeNthFromEnd(one, 1);
        assertNull(actual);
    }

    @Test
    public void small05() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        one.next = two;
        two.next = null;

        ListNode actual = solution.removeNthFromEnd(one, 2);
        assertEquals(two.val, actual.val);
    }

    @Test
    public void small06() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        one.next = two;

        ListNode actual = solution.removeNthFromEnd(one, 1);
        assertEquals(one.val, actual.val);
        assertNull(one.next);
    }
}


/*
Test cases
Input	 Output	 Expected
{1}, 1	{}	{}
{1,2}, 1	{1}	{1}
{1,2}, 2	{2}	{2}
{1,2,3}, 1	{1,2}	{1,2}
{1,2,3}, 2	{1,3}	{1,3}
{1,2,3}, 3	{2,3}	{2,3}
{1,2,3,4,5,6,7,8,9,10}, 7	{1,2,3,5,6,7,8,9,10}	{1,2,3,5,6,7,8,9,10}
{3,7,9,3,5,8,0}, 1	{3,7,9,3,5,8}	{3,7,9,3,5,8}
{4,5,4}, 1	{4,5}	{4,5}
{8,2,8,7}, 2	{8,2,7}	{8,2,7}
{5,6,9,8,6,4,5,1,9,8,7,2,8,6,8,3,5,8,6}, 17	{5,6,8,6,4,5,1,9,8,7,2,8,6,8,3,5,8,6}	{5,6,8,6,4,5,1,9,8,7,2,8,6,8,3,5,8,6}
{3,5,1,9}, 2	{3,5,9}	{3,5,9}
{7,2,9,7,9,7,7,8,3,3,5,4,2,6,1,6,6}, 16	{7,9,7,9,7,7,8,3,3,5,4,2,6,1,6,6}	{7,9,7,9,7,7,8,3,3,5,4,2,6,1,6,6}
{9,7,5,8,6}, 1	{9,7,5,8}	{9,7,5,8}
{3,3}, 1	{3}	{3}
{9,0,3,8,7,3,8,6,3,1}, 10	{0,3,8,7,3,8,6,3,1}	{0,3,8,7,3,8,6,3,1}
{6,3,4,9,0,2,1,6,2,8,1,2,6,3,5,0,7,8,1}, 4	{6,3,4,9,0,2,1,6,2,8,1,2,6,3,5,7,8,1}	{6,3,4,9,0,2,1,6,2,8,1,2,6,3,5,7,8,1}
{4}, 1	{}	{}
{7,5,8,0,6,9,1,4,3,7}, 7	{7,5,8,6,9,1,4,3,7}	{7,5,8,6,9,1,4,3,7}
{0,7,1,4,8,5,6,6,8,3,8,5,1,9,4,1}, 13	{0,7,1,8,5,6,6,8,3,8,5,1,9,4,1}	{0,7,1,8,5,6,6,8,3,8,5,1,9,4,1}
{3,3,8,1,6,6,0,9,3,5,6,9}, 7	{3,3,8,1,6,0,9,3,5,6,9}	{3,3,8,1,6,0,9,3,5,6,9}
{8,4,2,6,9,0,5,9,4}, 5	{8,4,2,6,0,5,9,4}	{8,4,2,6,0,5,9,4}
{7,5,9,9,1,2}, 1	{7,5,9,9,1}	{7,5,9,9,1}
{2,5,2,8,7,1,1,3,0,2,3,8,1,7,3}, 10	{2,5,2,8,7,1,3,0,2,3,8,1,7,3}	{2,5,2,8,7,1,3,0,2,3,8,1,7,3}
{5,4,8,1,0,5,9,5,4,0,6,8,4,2,0,9,5,0,6}, 10	{5,4,8,1,0,5,9,5,4,6,8,4,2,0,9,5,0,6}	{5,4,8,1,0,5,9,5,4,6,8,4,2,0,9,5,0,6}
{1,0,6,5,1,7,4,6,7,5,1,3,5,3,3,0,2,8,6,2,6,4,8}, 4	{1,0,6,5,1,7,4,6,7,5,1,3,5,3,3,0,2,8,6,6,4,8}	{1,0,6,5,1,7,4,6,7,5,1,3,5,3,3,0,2,8,6,6,4,8}
{7,6,6,5,4,0,7}, 4	{7,6,6,4,0,7}	{7,6,6,4,0,7}
{4,8,6,0,4,3,7,7}, 2	{4,8,6,0,4,3,7}	{4,8,6,0,4,3,7}
{2,2,2}, 3	{2,2}	{2,2}
{8,0,9,4}, 3	{8,9,4}	{8,9,4}
{0,7,6,9,5,3,9,4,0}, 6	{0,7,6,5,3,9,4,0}	{0,7,6,5,3,9,4,0}
{0,5,0,6,8,8,3,9,0,8,2,5,4,7,3,5,6,8,3}, 4	{0,5,0,6,8,8,3,9,0,8,2,5,4,7,3,6,8,3}	{0,5,0,6,8,8,3,9,0,8,2,5,4,7,3,6,8,3}
{3}, 1	{}	{}
{8,8,9,2,8,7,2,0,2,4}, 7	{8,8,9,8,7,2,0,2,4}	{8,8,9,8,7,2,0,2,4}
{2,2,2,5,0,6,0,6,3,5,1,2,5,7}, 14	{2,2,5,0,6,0,6,3,5,1,2,5,7}	{2,2,5,0,6,0,6,3,5,1,2,5,7}
{0,4,5,0,5,6,2}, 1	{0,4,5,0,5,6}	{0,4,5,0,5,6}
{4,6,8,8,2,1,3,6,6,0,6,2,0,3,8,7,6,0,3,5,1,9,5,7,4}, 21	{4,6,8,8,1,3,6,6,0,6,2,0,3,8,7,6,0,3,5,1,9,5,7,4}	{4,6,8,8,1,3,6,6,0,6,2,0,3,8,7,6,0,3,5,1,9,5,7,4}
{1,9,8,7,5,4,5,4,8,9,9,5,7}, 5	{1,9,8,7,5,4,5,4,9,9,5,7}	{1,9,8,7,5,4,5,4,9,9,5,7}
{1,1,6,9,8,5,1,1,0,4,2,8}, 9	{1,1,6,8,5,1,1,0,4,2,8}	{1,1,6,8,5,1,1,0,4,2,8}
{5,6,2,5,6,9,0,0,6,6}, 10	{6,2,5,6,9,0,0,6,6}	{6,2,5,6,9,0,0,6,6}
{7,4,4,8,7,8,9,6}, 6	{7,4,8,7,8,9,6}	{7,4,8,7,8,9,6}
{1}, 1	{}	{}
{3,5,6,1,7,5,7,6,9,4,2,8,6,5}, 13	{3,6,1,7,5,7,6,9,4,2,8,6,5}	{3,6,1,7,5,7,6,9,4,2,8,6,5}
{4,6,2,0,2,1,9,0,2,7,0,4,0,1,8,4}, 9	{4,6,2,0,2,1,9,2,7,0,4,0,1,8,4}	{4,6,2,0,2,1,9,2,7,0,4,0,1,8,4}
{7,6,3,6,2,2,0,6,2,9,1,0,4,7,6,8,9}, 17	{6,3,6,2,2,0,6,2,9,1,0,4,7,6,8,9}	{6,3,6,2,2,0,6,2,9,1,0,4,7,6,8,9}
{1,1,6,8,1,0,9,4,8,5,3,6}, 3	{1,1,6,8,1,0,9,4,8,3,6}	{1,1,6,8,1,0,9,4,8,3,6}
{9,9,3,1,1,9,3,0,3,4}, 7	{9,9,3,1,9,3,0,3,4}	{9,9,3,1,9,3,0,3,4}
{2,7,2,3,0,3,5,6,1,8,9,2,5,9,7,8,6,2,7,5,1}, 18	{2,7,2,0,3,5,6,1,8,9,2,5,9,7,8,6,2,7,5,1}	{2,7,2,0,3,5,6,1,8,9,2,5,9,7,8,6,2,7,5,1}
{4,3,2,7,6,8,3,9,1,2}, 4	{4,3,2,7,6,8,9,1,2}	{4,3,2,7,6,8,9,1,2}
{5,6,1,3,9,2,2,4,7,2,3,5,0,5,4,5,8}, 5	{5,6,1,3,9,2,2,4,7,2,3,5,5,4,5,8}	{5,6,1,3,9,2,2,4,7,2,3,5,5,4,5,8}
{3,1,1,0,0,9,5,1,2,0,4,9,5,2,2,8,1}, 6	{3,1,1,0,0,9,5,1,2,0,4,5,2,2,8,1}	{3,1,1,0,0,9,5,1,2,0,4,5,2,2,8,1}
{7,3,5,1,0,5,6,4,2,7,2,1}, 3	{7,3,5,1,0,5,6,4,2,2,1}	{7,3,5,1,0,5,6,4,2,2,1}
{2,2,4,3,7,5,6,9,9,7,4,1,1,3,4}, 14	{2,4,3,7,5,6,9,9,7,4,1,1,3,4}	{2,4,3,7,5,6,9,9,7,4,1,1,3,4}
{2,3,3,5,4,0,1,8,4,8,1,5,0,7,7,2,1}, 6	{2,3,3,5,4,0,1,8,4,8,1,0,7,7,2,1}	{2,3,3,5,4,0,1,8,4,8,1,0,7,7,2,1}
{8,9,1,9,8,6,2,1,1,6,9,9,0,3,2,5,7,2,9,7,8,9,0}, 2	{8,9,1,9,8,6,2,1,1,6,9,9,0,3,2,5,7,2,9,7,8,0}	{8,9,1,9,8,6,2,1,1,6,9,9,0,3,2,5,7,2,9,7,8,0}
{7,3,6,0,6,8,8,5,0,7,5,8,1,7,1,0,6,0,0,1,4,8,0}, 12	{7,3,6,0,6,8,8,5,0,7,5,1,7,1,0,6,0,0,1,4,8,0}	{7,3,6,0,6,8,8,5,0,7,5,1,7,1,0,6,0,0,1,4,8,0}
{0,6,0,0,2,2,8,6,9,8,2,9,9,0,1,6,5,9,0,2}, 3	{0,6,0,0,2,2,8,6,9,8,2,9,9,0,1,6,5,0,2}	{0,6,0,0,2,2,8,6,9,8,2,9,9,0,1,6,5,0,2}
{1}, 1	{}	{}
{4,8,2,7,6,1,7,5,4,7,7,8,7,5,9,6,8,9,7,0,2,3,5}, 12	{4,8,2,7,6,1,7,5,4,7,7,7,5,9,6,8,9,7,0,2,3,5}	{4,8,2,7,6,1,7,5,4,7,7,7,5,9,6,8,9,7,0,2,3,5}
{0,6,5,3,1,8,9,9,0,6,8,4,3,5,8,3}, 3	{0,6,5,3,1,8,9,9,0,6,8,4,3,8,3}	{0,6,5,3,1,8,9,9,0,6,8,4,3,8,3}
{0,0,8,8,0,9,5,0,1,1,7,5,6,9,4,4,2,5,2}, 14	{0,0,8,8,0,5,0,1,1,7,5,6,9,4,4,2,5,2}	{0,0,8,8,0,5,0,1,1,7,5,6,9,4,4,2,5,2}
{4,0,6,8,6,1,8,1,6,9,1,6,7,2,6,8,9}, 3	{4,0,6,8,6,1,8,1,6,9,1,6,7,2,8,9}	{4,0,6,8,6,1,8,1,6,9,1,6,7,2,8,9}
{0,5,7,9,5,1,3,9,8,7,3,6}, 2	{0,5,7,9,5,1,3,9,8,7,6}	{0,5,7,9,5,1,3,9,8,7,6}
{3,2,2,4,2,3,2,1,6,8,0,0,6,8,0,4,0}, 17	{2,2,4,2,3,2,1,6,8,0,0,6,8,0,4,0}	{2,2,4,2,3,2,1,6,8,0,0,6,8,0,4,0}
{9,3,9}, 2	{9,9}	{9,9}
{8,2,5,4,8,9,0,1,1,4,8,3,9,0,7,7,9,7,8,5,8,0,2,0,2,4,1}, 4	{8,2,5,4,8,9,0,1,1,4,8,3,9,0,7,7,9,7,8,5,8,0,2,2,4,1}	{8,2,5,4,8,9,0,1,1,4,8,3,9,0,7,7,9,7,8,5,8,0,2,2,4,1}
{3,4,3,5}, 3	{3,3,5}	{3,3,5}
{3,9,9,7,2,5,5,7,4,5}, 5	{3,9,9,7,2,5,7,4,5}	{3,9,9,7,2,5,7,4,5}
{4,4,2,2,4,2,6,4,6,2,5,2,7,0,9}, 11	{4,4,2,2,2,6,4,6,2,5,2,7,0,9}	{4,4,2,2,2,6,4,6,2,5,2,7,0,9}
{1,0,0,2,1,7,4,9,2,3,5,0,0,9,6,4}, 16	{0,0,2,1,7,4,9,2,3,5,0,0,9,6,4}	{0,0,2,1,7,4,9,2,3,5,0,0,9,6,4}
{8,5,6,4,2,8,9,6,5,1,7}, 6	{8,5,6,4,2,9,6,5,1,7}	{8,5,6,4,2,9,6,5,1,7}
{8,0,8,0,3,8,6,2,2,0,8,2,0,9,9,6,3}, 12	{8,0,8,0,3,6,2,2,0,8,2,0,9,9,6,3}	{8,0,8,0,3,6,2,2,0,8,2,0,9,9,6,3}
{8,8,0,2,6,1,1,4,2,8,4,8,9,6,8,9,9,6,8,4,1,8,4,3,8}, 4	{8,8,0,2,6,1,1,4,2,8,4,8,9,6,8,9,9,6,8,4,1,4,3,8}	{8,8,0,2,6,1,1,4,2,8,4,8,9,6,8,9,9,6,8,4,1,4,3,8}
{4,6,4,0,7,2,0,9,0,1,2,6,3,3,2}, 9	{4,6,4,0,7,2,9,0,1,2,6,3,3,2}	{4,6,4,0,7,2,9,0,1,2,6,3,3,2}
{8,3,3,0,2,1,4,3,9,8,6,9,1,1,5,0,7,7,7,1,9,8,3}, 3	{8,3,3,0,2,1,4,3,9,8,6,9,1,1,5,0,7,7,7,1,8,3}	{8,3,3,0,2,1,4,3,9,8,6,9,1,1,5,0,7,7,7,1,8,3}
{0,5,6,4,0,8,3,6,3,3,8,5,9,1,6,7,9,8,0,2,3,0}, 6	{0,5,6,4,0,8,3,6,3,3,8,5,9,1,6,7,8,0,2,3,0}	{0,5,6,4,0,8,3,6,3,3,8,5,9,1,6,7,8,0,2,3,0}
{7,2}, 1	{7}	{7}
{6,3,9,8,0,5,2}, 3	{6,3,9,8,5,2}	{6,3,9,8,5,2}
{7,1,8,2,9,3,1,2,2,8,3,0,9,6,5,9,7,6,9,0,9,5,8,4,6,8}, 13	{7,1,8,2,9,3,1,2,2,8,3,0,9,5,9,7,6,9,0,9,5,8,4,6,8}	{7,1,8,2,9,3,1,2,2,8,3,0,9,5,9,7,6,9,0,9,5,8,4,6,8}
{0,9,6,0,2,4,2,1,0,6,5,4,4,9,4,5,5,9,7,4,8,6}, 3	{0,9,6,0,2,4,2,1,0,6,5,4,4,9,4,5,5,9,7,8,6}	{0,9,6,0,2,4,2,1,0,6,5,4,4,9,4,5,5,9,7,8,6}
{3,4,3,9,2,1,0,5,3,8,7,5,4,9,7,6,5,2,0,2,1,4,9,8,6,6,3,6,4,9}, 26	{3,4,3,9,1,0,5,3,8,7,5,4,9,7,6,5,2,0,2,1,4,9,8,6,6,3,6,4,9}	{3,4,3,9,1,0,5,3,8,7,5,4,9,7,6,5,2,0,2,1,4,9,8,6,6,3,6,4,9}
{6,0,6,0,1,8,5,4,6,2,0,3,4,9,9,1,3,0,5,7,6,5,5,2,3,0,8,8}, 15	{6,0,6,0,1,8,5,4,6,2,0,3,4,9,1,3,0,5,7,6,5,5,2,3,0,8,8}	{6,0,6,0,1,8,5,4,6,2,0,3,4,9,1,3,0,5,7,6,5,5,2,3,0,8,8}
{5,8,5,4,0,7}, 5	{5,5,4,0,7}	{5,5,4,0,7}
{1,1,0,3,4,6,2,3,0,6,5,7,3,2,4,0,4,8,3,5,6,5,0,3,5,6,9}, 12	{1,1,0,3,4,6,2,3,0,6,5,7,3,2,4,4,8,3,5,6,5,0,3,5,6,9}	{1,1,0,3,4,6,2,3,0,6,5,7,3,2,4,4,8,3,5,6,5,0,3,5,6,9}
{2,3,8,5,6,2,1,4,6,6,4,4,2,4,9,4,8,0,0,6,3,5,4,0,6,0}, 22	{2,3,8,5,2,1,4,6,6,4,4,2,4,9,4,8,0,0,6,3,5,4,0,6,0}	{2,3,8,5,2,1,4,6,6,4,4,2,4,9,4,8,0,0,6,3,5,4,0,6,0}
{9,2,9,3,6}, 3	{9,2,3,6}	{9,2,3,6}
{4,1,1,8,8,8,5,4,2,9,4}, 11	{1,1,8,8,8,5,4,2,9,4}	{1,1,8,8,8,5,4,2,9,4}
{4,6,8,9,4,2,9,2,4,6,8,6,8,7,9,6,6,2,0,0}, 14	{4,6,8,9,4,2,2,4,6,8,6,8,7,9,6,6,2,0,0}	{4,6,8,9,4,2,2,4,6,8,6,8,7,9,6,6,2,0,0}
{0,3,6,4,5,7,8,3,8,4,2,6}, 2	{0,3,6,4,5,7,8,3,8,4,6}	{0,3,6,4,5,7,8,3,8,4,6}
{1,4,0,5,0,8,1,1,7}, 1	{1,4,0,5,0,8,1,1}	{1,4,0,5,0,8,1,1}
{5,5,0,7,0,1,7,6,9,4,3,8,4,9,6,9,1,3}, 13	{5,5,0,7,0,7,6,9,4,3,8,4,9,6,9,1,3}	{5,5,0,7,0,7,6,9,4,3,8,4,9,6,9,1,3}
{6,1}, 2	{1}	{1}
{3,1,5,4,0,0,4,7,7,6,5,9}, 4	{3,1,5,4,0,0,4,7,6,5,9}	{3,1,5,4,0,0,4,7,6,5,9}
{5,8,8,1,8}, 4	{5,8,1,8}	{5,8,1,8}
{6,4,3,1,0,4,7,1,5,1,5}, 6	{6,4,3,1,0,7,1,5,1,5}	{6,4,3,1,0,7,1,5,1,5}
{1,0,8,5,7,5,1}, 1	{1,0,8,5,7,5}	{1,0,8,5,7,5}
{0,9,2,0,9,3,0,4,5,7,8,8,8,9,2,8,2,9,9,9,9,7,1,9,5,8,8}, 24	{0,9,2,9,3,0,4,5,7,8,8,8,9,2,8,2,9,9,9,9,7,1,9,5,8,8}	{0,9,2,9,3,0,4,5,7,8,8,8,9,2,8,2,9,9,9,9,7,1,9,5,8,8}
{3,8,4,2,2,5,3,7,5,8,2,4,6,2,5,7,4,3,2,5,4,1,4}, 5	{3,8,4,2,2,5,3,7,5,8,2,4,6,2,5,7,4,3,5,4,1,4}	{3,8,4,2,2,5,3,7,5,8,2,4,6,2,5,7,4,3,5,4,1,4}
{5,8,3,4,2,5,7,2,9,1,5,6,4,4,4,2,9,8,1,1,5,0,8}, 13	{5,8,3,4,2,5,7,2,9,1,6,4,4,4,2,9,8,1,1,5,0,8}	{5,8,3,4,2,5,7,2,9,1,6,4,4,4,2,9,8,1,1,5,0,8}
{3,4,4}, 1	{3,4}	{3,4}
{8,5,7,1,1,9,8,0,4,0,1,9,6,8,5,0,2,4,1,3,6,6,4,4,9,6,9,3}, 7	{8,5,7,1,1,9,8,0,4,0,1,9,6,8,5,0,2,4,1,3,6,4,4,9,6,9,3}	{8,5,7,1,1,9,8,0,4,0,1,9,6,8,5,0,2,4,1,3,6,4,4,9,6,9,3}
{3,3}, 2	{3}	{3}
{4,0,2,5,1,6,5,4,7,1,4}, 5	{4,0,2,5,1,6,4,7,1,4}	{4,0,2,5,1,6,4,7,1,4}
{7,7,7,0,3,5,6,9,4,5,0,8,9,2,3}, 8	{7,7,7,0,3,5,6,4,5,0,8,9,2,3}	{7,7,7,0,3,5,6,4,5,0,8,9,2,3}
{3,9,3,7,4,4,3,9,1,0,2,5,5,8,4,2,5,5,7,1,3,8}, 18	{3,9,3,7,4,3,9,1,0,2,5,5,8,4,2,5,5,7,1,3,8}	{3,9,3,7,4,3,9,1,0,2,5,5,8,4,2,5,5,7,1,3,8}
{8,5,0,2,8,2,3,4,1,7,1,5,3,7,6,6,9,1,2,4,9}, 12	{8,5,0,2,8,2,3,4,1,1,5,3,7,6,6,9,1,2,4,9}	{8,5,0,2,8,2,3,4,1,1,5,3,7,6,6,9,1,2,4,9}
{7,3,5,0,9,5,7,9,4,3,1,6,3,4,2,9,7,1,3}, 11	{7,3,5,0,9,5,7,9,3,1,6,3,4,2,9,7,1,3}	{7,3,5,0,9,5,7,9,3,1,6,3,4,2,9,7,1,3}
{15,28,33,34,40,20,7,27,33,3,38,40}, 9	{15,28,33,40,20,7,27,33,3,38,40}	{15,28,33,40,20,7,27,33,3,38,40}
{35,45,45,42,28,31,38,37,34,20,2,16,5,20,26,25,41,44,5}, 10	{35,45,45,42,28,31,38,37,34,2,16,5,20,26,25,41,44,5}	{35,45,45,42,28,31,38,37,34,2,16,5,20,26,25,41,44,5}
{46}, 1	{}	{}
{25,30,43,15,22,15,26,9,11,21,1}, 9	{25,30,15,22,15,26,9,11,21,1}	{25,30,15,22,15,26,9,11,21,1}
{42,30,39,12,35,5,19,5,33,45,48,29,0,24,10,48,22,0,23,4,45,41,26}, 14	{42,30,39,12,35,5,19,5,33,48,29,0,24,10,48,22,0,23,4,45,41,26}	{42,30,39,12,35,5,19,5,33,48,29,0,24,10,48,22,0,23,4,45,41,26}
{37,24,38,41,15,42,33,47,33,47,32,40,16,37,24,11,35,3,14,11,15,12,34,15,38,38,11,29}, 6	{37,24,38,41,15,42,33,47,33,47,32,40,16,37,24,11,35,3,14,11,15,12,15,38,38,11,29}	{37,24,38,41,15,42,33,47,33,47,32,40,16,37,24,11,35,3,14,11,15,12,15,38,38,11,29}
{46,4,48,36,47}, 1	{46,4,48,36}	{46,4,48,36}
{32}, 1	{}	{}
{29,45,4,46,34}, 1	{29,45,4,46}	{29,45,4,46}
{20,36,23,31,1,38,17,17,26,6,30,7,25,4,5,31,2,43,29,19}, 14	{20,36,23,31,1,38,17,26,6,30,7,25,4,5,31,2,43,29,19}	{20,36,23,31,1,38,17,26,6,30,7,25,4,5,31,2,43,29,19}
{31,39}, 2	{39}	{39}
{44,39,11,24,48,33,12}, 2	{44,39,11,24,48,12}	{44,39,11,24,48,12}
{14,10,34,31,38,42,13,47,17,17,2,48,21,47,27,40,20}, 9	{14,10,34,31,38,42,13,47,17,2,48,21,47,27,40,20}	{14,10,34,31,38,42,13,47,17,2,48,21,47,27,40,20}
{10,34,0,6,23,13,32,21,48,45,45,14,9,7,48,42,45,40,5,44,9,24}, 15	{10,34,0,6,23,13,32,48,45,45,14,9,7,48,42,45,40,5,44,9,24}	{10,34,0,6,23,13,32,48,45,45,14,9,7,48,42,45,40,5,44,9,24}
{45,45,37,37,16,30,8,28,14,10,34,37,25,18,9,23,13,6,38}, 2	{45,45,37,37,16,30,8,28,14,10,34,37,25,18,9,23,13,38}	{45,45,37,37,16,30,8,28,14,10,34,37,25,18,9,23,13,38}
{38,16,11,31,23}, 2	{38,16,11,23}	{38,16,11,23}
{47,4,0}, 1	{47,4}	{47,4}
{40,31,20,20,42,48,35,4,34,24,30,2,35}, 11	{40,31,20,42,48,35,4,34,24,30,2,35}	{40,31,20,42,48,35,4,34,24,30,2,35}
{42,43,42,6,34,9,17,17,34,23,9,34,30,10,28,32,2,12,2,22,4,2,9,8,38,34,40,42,19}, 29	{43,42,6,34,9,17,17,34,23,9,34,30,10,28,32,2,12,2,22,4,2,9,8,38,34,40,42,19}	{43,42,6,34,9,17,17,34,23,9,34,30,10,28,32,2,12,2,22,4,2,9,8,38,34,40,42,19}
{11}, 1	{}	{}
{17,23,14,35,42,48,10,2,32,40,14,13,24,16,25,28,40,31,32,0,41,20,36,32}, 18	{17,23,14,35,42,48,2,32,40,14,13,24,16,25,28,40,31,32,0,41,20,36,32}	{17,23,14,35,42,48,2,32,40,14,13,24,16,25,28,40,31,32,0,41,20,36,32}
{28,25,19,19,28,38,45,44,25,37,43,36,39,27,28,3,42,5,21,19,33,12,2,18,12,44}, 7	{28,25,19,19,28,38,45,44,25,37,43,36,39,27,28,3,42,5,21,33,12,2,18,12,44}	{28,25,19,19,28,38,45,44,25,37,43,36,39,27,28,3,42,5,21,33,12,2,18,12,44}
{28}, 1	{}	{}
{8,31,26,27,9,17,24,4,42,12,49,30,3,28,9,9,21,16}, 1	{8,31,26,27,9,17,24,4,42,12,49,30,3,28,9,9,21}	{8,31,26,27,9,17,24,4,42,12,49,30,3,28,9,9,21}
{49,42,45}, 3	{42,45}	{42,45}
{41,8,6,19,13,14,29,44,42,8,6,9,33,12,2,47,11}, 16	{41,6,19,13,14,29,44,42,8,6,9,33,12,2,47,11}	{41,6,19,13,14,29,44,42,8,6,9,33,12,2,47,11}
{41,43,11,12,9,42,7,11,36,2,30,43,43,40,1,14,4,15,43,0,8,1,6}, 17	{41,43,11,12,9,42,11,36,2,30,43,43,40,1,14,4,15,43,0,8,1,6}	{41,43,11,12,9,42,11,36,2,30,43,43,40,1,14,4,15,43,0,8,1,6}
{20,21,33,31,6,36,25,1,49,39,13,43,46,24,30,48,6}, 3	{20,21,33,31,6,36,25,1,49,39,13,43,46,24,48,6}	{20,21,33,31,6,36,25,1,49,39,13,43,46,24,48,6}
{47,26,7,3,44,2,3,2,6,12,21,44,32,45,30,16,1,18,41,4,17,30,17,11}, 20	{47,26,7,3,2,3,2,6,12,21,44,32,45,30,16,1,18,41,4,17,30,17,11}	{47,26,7,3,2,3,2,6,12,21,44,32,45,30,16,1,18,41,4,17,30,17,11}
{43,27,0,18,23,47,46,32,0,40,35,5,42,43,17,16,37,2,11,17,18,14}, 20	{43,27,18,23,47,46,32,0,40,35,5,42,43,17,16,37,2,11,17,18,14}	{43,27,18,23,47,46,32,0,40,35,5,42,43,17,16,37,2,11,17,18,14}
{18,3,41,36,16,20,29,9,0,29,29,23,28,25,5,28,16,42,34,10,35,3}, 19	{18,3,41,16,20,29,9,0,29,29,23,28,25,5,28,16,42,34,10,35,3}	{18,3,41,16,20,29,9,0,29,29,23,28,25,5,28,16,42,34,10,35,3}
{5,39,42,25,3,30,36,22,35,30,10,1,2,39,12,2,21,41,25,49,18,33,28,34,25,14}, 6	{5,39,42,25,3,30,36,22,35,30,10,1,2,39,12,2,21,41,25,49,33,28,34,25,14}	{5,39,42,25,3,30,36,22,35,30,10,1,2,39,12,2,21,41,25,49,33,28,34,25,14}
{19,21,38,27,13,30,2,16,10,41,40,47}, 10	{19,21,27,13,30,2,16,10,41,40,47}	{19,21,27,13,30,2,16,10,41,40,47}
{48,25,42,12,28,13,5,5,12,24,38,42,8,14,8,3,27,28,27,15,5}, 9	{48,25,42,12,28,13,5,5,12,24,38,42,14,8,3,27,28,27,15,5}	{48,25,42,12,28,13,5,5,12,24,38,42,14,8,3,27,28,27,15,5}
{9,8,10,0,49,7,23,49,8,49,41,20,29,6,26,34,19,0,23,13,10,39,22,16,18,2,45,35}, 6	{9,8,10,0,49,7,23,49,8,49,41,20,29,6,26,34,19,0,23,13,10,39,16,18,2,45,35}	{9,8,10,0,49,7,23,49,8,49,41,20,29,6,26,34,19,0,23,13,10,39,16,18,2,45,35}
{32,20,45,44,21,44}, 3	{32,20,45,21,44}	{32,20,45,21,44}
{46,10,47,39,32,26,46,10,13,17,10,36,30,21,27,4,37,45,8,32,30,17,19,14,40,16,9}, 6	{46,10,47,39,32,26,46,10,13,17,10,36,30,21,27,4,37,45,8,32,30,19,14,40,16,9}	{46,10,47,39,32,26,46,10,13,17,10,36,30,21,27,4,37,45,8,32,30,19,14,40,16,9}
{13,9,9,23}, 2	{13,9,23}	{13,9,23}
{7,35,46,18,48,13,30,36,46}, 3	{7,35,46,18,48,13,36,46}	{7,35,46,18,48,13,36,46}
{0,42,10,11}, 3	{0,10,11}	{0,10,11}
{30,47,7,20,14,16,33,27,29,43,36,4,2,36,13,39,35,31,38,48,14,26,44}, 15	{30,47,7,20,14,16,33,27,43,36,4,2,36,13,39,35,31,38,48,14,26,44}	{30,47,7,20,14,16,33,27,43,36,4,2,36,13,39,35,31,38,48,14,26,44}
{47,10,2}, 2	{47,2}	{47,2}
{45,38,34,4,9,48,20}, 4	{45,38,34,9,48,20}	{45,38,34,9,48,20}
{1,37,15,7,41,3,20,31}, 3	{1,37,15,7,41,20,31}	{1,37,15,7,41,20,31}
{21,39,18,49,35,37,41,32,47,44,42,36,41,31,22,45,42,22,17,36,49,20,26,14,29}, 18	{21,39,18,49,35,37,41,47,44,42,36,41,31,22,45,42,22,17,36,49,20,26,14,29}	{21,39,18,49,35,37,41,47,44,42,36,41,31,22,45,42,22,17,36,49,20,26,14,29}
{1,0,8,5,23,47,25,23,32,13,14,17,12,10,9,0,3,42}, 13	{1,0,8,5,23,25,23,32,13,14,17,12,10,9,0,3,42}	{1,0,8,5,23,25,23,32,13,14,17,12,10,9,0,3,42}
{36,44,19,23,45,39,49,9,20,18,29}, 8	{36,44,19,45,39,49,9,20,18,29}	{36,44,19,45,39,49,9,20,18,29}
{39,27,44,36,5,19,20,20,34,37,32,46,49,35,2,41,7,2,28,4,24,3}, 20	{39,27,36,5,19,20,20,34,37,32,46,49,35,2,41,7,2,28,4,24,3}	{39,27,36,5,19,20,20,34,37,32,46,49,35,2,41,7,2,28,4,24,3}
{4,11,36,24,42,8,45,31,35,42,19,42,11,39,12,47}, 8	{4,11,36,24,42,8,45,31,42,19,42,11,39,12,47}	{4,11,36,24,42,8,45,31,42,19,42,11,39,12,47}
{44,30,32,48,21,39,2,1}, 2	{44,30,32,48,21,39,1}	{44,30,32,48,21,39,1}
{6,45,42,12,8,28,37,0,36,32,33,23,24,2,16,38,43,30,35,24,27,31,4,9,29,28,1}, 14	{6,45,42,12,8,28,37,0,36,32,33,23,24,16,38,43,30,35,24,27,31,4,9,29,28,1}	{6,45,42,12,8,28,37,0,36,32,33,23,24,16,38,43,30,35,24,27,31,4,9,29,28,1}
{46,10,38,43,4,0,1,34,37,3,20,22,36,46,48,38,14,36,34,44,22,8,22,3,15,33,35,43,34,19}, 25	{46,10,38,43,4,1,34,37,3,20,22,36,46,48,38,14,36,34,44,22,8,22,3,15,33,35,43,34,19}	{46,10,38,43,4,1,34,37,3,20,22,36,46,48,38,14,36,34,44,22,8,22,3,15,33,35,43,34,19}
{31,12,28,36}, 4	{12,28,36}	{12,28,36}
{20,2,35,43,26,22,41,27,12,5,15}, 4	{20,2,35,43,26,22,41,12,5,15}	{20,2,35,43,26,22,41,12,5,15}
{39,7,21,45,22,5,30,17,41,1,41,24,32,6,5,20,19,35,41,23}, 11	{39,7,21,45,22,5,30,17,41,41,24,32,6,5,20,19,35,41,23}	{39,7,21,45,22,5,30,17,41,41,24,32,6,5,20,19,35,41,23}
{2,44,27,31,7,32,46,5,33,38,14,7,33,38,12,15,5,5,18,47,32,0,5,37,23,26,24}, 27	{44,27,31,7,32,46,5,33,38,14,7,33,38,12,15,5,5,18,47,32,0,5,37,23,26,24}	{44,27,31,7,32,46,5,33,38,14,7,33,38,12,15,5,5,18,47,32,0,5,37,23,26,24}
{46,2,3,41,31,34,48,13,33,5}, 9	{46,3,41,31,34,48,13,33,5}	{46,3,41,31,34,48,13,33,5}
{20,5,4,8,19,21,14,25,39,13,7,41}, 3	{20,5,4,8,19,21,14,25,39,7,41}	{20,5,4,8,19,21,14,25,39,7,41}
{14,44,20,30,45,16,32,1,7,13,35,7,28,18,15,29,39}, 1	{14,44,20,30,45,16,32,1,7,13,35,7,28,18,15,29}	{14,44,20,30,45,16,32,1,7,13,35,7,28,18,15,29}
{45,43,4,16,9}, 5	{43,4,16,9}	{43,4,16,9}
{24,38,47,44,34,13}, 5	{24,47,44,34,13}	{24,47,44,34,13}
{44,36,22,28,37}, 3	{44,36,28,37}	{44,36,28,37}
{24,39,22,43,4,1,34,41,38,30,37,42,48,48,23,6,23,11,5,17,47,18,10,1,12}, 24	{24,22,43,4,1,34,41,38,30,37,42,48,48,23,6,23,11,5,17,47,18,10,1,12}	{24,22,43,4,1,34,41,38,30,37,42,48,48,23,6,23,11,5,17,47,18,10,1,12}
{41,35,7,35,11,49}, 4	{41,35,35,11,49}	{41,35,35,11,49}
{5,13,41,47,1,23,34,45,21,32,18,27,7,29,32,27,26}, 15	{5,13,47,1,23,34,45,21,32,18,27,7,29,32,27,26}	{5,13,47,1,23,34,45,21,32,18,27,7,29,32,27,26}
{29,15,35,4,6,22,12,43}, 4	{29,15,35,4,22,12,43}	{29,15,35,4,22,12,43}
{3,40,18,18,33,15,19,6,1,14,27,36,34,5,43,13,39,22,41,42,9,22,8,46}, 23	{3,18,18,33,15,19,6,1,14,27,36,34,5,43,13,39,22,41,42,9,22,8,46}	{3,18,18,33,15,19,6,1,14,27,36,34,5,43,13,39,22,41,42,9,22,8,46}
{18,40,8,4,3,13,44,22,31,27,39,2,33,41,18}, 3	{18,40,8,4,3,13,44,22,31,27,39,2,41,18}	{18,40,8,4,3,13,44,22,31,27,39,2,41,18}
{2,19,22,17,9,47,10,1,6,32}, 10	{19,22,17,9,47,10,1,6,32}	{19,22,17,9,47,10,1,6,32}
{8,26,21,1}, 3	{8,21,1}	{8,21,1}
{6,49,21,30,32,0}, 3	{6,49,21,32,0}	{6,49,21,32,0}
{35,13,4,48,42,8,17,16,25,28,13,35,32,22,19,43,25}, 17	{13,4,48,42,8,17,16,25,28,13,35,32,22,19,43,25}	{13,4,48,42,8,17,16,25,28,13,35,32,22,19,43,25}
{48,30,7,26,37,6,49,17,40,0,39,26,35,2,32,35,46,40,5,15}, 8	{48,30,7,26,37,6,49,17,40,0,39,26,2,32,35,46,40,5,15}	{48,30,7,26,37,6,49,17,40,0,39,26,2,32,35,46,40,5,15}
{30,4,17,2,23,11,29,3,32,28,33,40,6,22,48,5,42,39,7,31,17,45,36,0,30,34}, 11	{30,4,17,2,23,11,29,3,32,28,33,40,6,22,48,42,39,7,31,17,45,36,0,30,34}	{30,4,17,2,23,11,29,3,32,28,33,40,6,22,48,42,39,7,31,17,45,36,0,30,34}
{49,10,21,32,14,40,34,38,3,14,41,38,44,26,28,0}, 16	{10,21,32,14,40,34,38,3,14,41,38,44,26,28,0}	{10,21,32,14,40,34,38,3,14,41,38,44,26,28,0}
{7,43,19,15,26,37,10,14,39,42,1,31,28,0,41,1,32,6,43,19,44,47,33,37,35,27,13,15,29}, 8	{7,43,19,15,26,37,10,14,39,42,1,31,28,0,41,1,32,6,43,19,44,33,37,35,27,13,15,29}	{7,43,19,15,26,37,10,14,39,42,1,31,28,0,41,1,32,6,43,19,44,33,37,35,27,13,15,29}
{36,9,15,1,36,4}, 2	{36,9,15,1,4}	{36,9,15,1,4}
{43,6,3,26,36,6,18,39,40,24,32,9,20,31,42,7,18,21,22,33,0,39,31}, 12	{43,6,3,26,36,6,18,39,40,24,32,20,31,42,7,18,21,22,33,0,39,31}	{43,6,3,26,36,6,18,39,40,24,32,20,31,42,7,18,21,22,33,0,39,31}
{46,42,36,2,6,39,47,12,44,23,0,0,43,39,41,19,21,0,39,5,45,48,23,18,23,9,21,12,40}, 22	{46,42,36,2,6,39,47,44,23,0,0,43,39,41,19,21,0,39,5,45,48,23,18,23,9,21,12,40}	{46,42,36,2,6,39,47,44,23,0,0,43,39,41,19,21,0,39,5,45,48,23,18,23,9,21,12,40}
{38,2,1,40,8,40,39,22,34,14,22,37,8,13,28,27,37,30,17,42,25,17,15}, 17	{38,2,1,40,8,40,22,34,14,22,37,8,13,28,27,37,30,17,42,25,17,15}	{38,2,1,40,8,40,22,34,14,22,37,8,13,28,27,37,30,17,42,25,17,15}
{26,17,4,16,27,19,4,29,20,46,40}, 10	{26,4,16,27,19,4,29,20,46,40}	{26,4,16,27,19,4,29,20,46,40}
{12,46,2,37,33,10,2,13}, 6	{12,46,37,33,10,2,13}	{12,46,37,33,10,2,13}
{44,8,31,19,26,49,15,18,25,32,25,44,11,44,0,41,14,49,31,26}, 17	{44,8,31,26,49,15,18,25,32,25,44,11,44,0,41,14,49,31,26}	{44,8,31,26,49,15,18,25,32,25,44,11,44,0,41,14,49,31,26}
{24,40,34,10,2,37,23,42,26,17,0,10,39,28,11,6,49,38,41,24,32,2,20,33,43,34}, 9	{24,40,34,10,2,37,23,42,26,17,0,10,39,28,11,6,49,41,24,32,2,20,33,43,34}	{24,40,34,10,2,37,23,42,26,17,0,10,39,28,11,6,49,41,24,32,2,20,33,43,34}
{12,20,24,38,13,8,48,15,45,22,7,24,41,10,36,30,38}, 12	{12,20,24,38,13,48,15,45,22,7,24,41,10,36,30,38}	{12,20,24,38,13,48,15,45,22,7,24,41,10,36,30,38}
{39,35,30,13,20,32,35,3,26,21,39,4,33,9,28,22,24,37,22,40,34,44,49,10,38,9,46,20,0,45}, 20	{39,35,30,13,20,32,35,3,26,21,4,33,9,28,22,24,37,22,40,34,44,49,10,38,9,46,20,0,45}	{39,35,30,13,20,32,35,3,26,21,4,33,9,28,22,24,37,22,40,34,44,49,10,38,9,46,20,0,45}
{31,39,5,1,22,40,6,0,12,45,4,47,6,33,21,31,22,44,23,8,40,22,19,28,34,17,49,34,13,10}, 26	{31,39,5,1,40,6,0,12,45,4,47,6,33,21,31,22,44,23,8,40,22,19,28,34,17,49,34,13,10}	{31,39,5,1,40,6,0,12,45,4,47,6,33,21,31,22,44,23,8,40,22,19,28,34,17,49,34,13,10}
{0,32,49,22,25,5,22}, 2	{0,32,49,22,25,22}	{0,32,49,22,25,22}
{28,36,10,13,8,41,35,4,16,46,44,39,15,25,23,34,26,9,47,36,34,45,38}, 8	{28,36,10,13,8,41,35,4,16,46,44,39,15,25,23,26,9,47,36,34,45,38}	{28,36,10,13,8,41,35,4,16,46,44,39,15,25,23,26,9,47,36,34,45,38}
{10,44,1,34,33,3,13,19,14,28,29,7,14,33,24}, 8	{10,44,1,34,33,3,13,14,28,29,7,14,33,24}	{10,44,1,34,33,3,13,14,28,29,7,14,33,24}
{13}, 1	{}	{}
{38,13,35,47,13,23,33,8,12,2,3,22,46,4,9,31,10,24}, 16	{38,13,47,13,23,33,8,12,2,3,22,46,4,9,31,10,24}	{38,13,47,13,23,33,8,12,2,3,22,46,4,9,31,10,24}
{2,32,33,18,18,7,30,0,22,9,7,12,25,44,9,38,17,45,48,29,47,1,4,46,8}, 16	{2,32,33,18,18,7,30,0,22,7,12,25,44,9,38,17,45,48,29,47,1,4,46,8}	{2,32,33,18,18,7,30,0,22,7,12,25,44,9,38,17,45,48,29,47,1,4,46,8}
{20,39,30,46,41,13,29,12}, 2	{20,39,30,46,41,13,12}	{20,39,30,46,41,13,12}
{42,33,13,4,40,26,29,34,37,19,3,32,17,33,32,21,39,30,29,4,9,49,43,40,45,36,5,26,0,38}, 26	{42,33,13,4,26,29,34,37,19,3,32,17,33,32,21,39,30,29,4,9,49,43,40,45,36,5,26,0,38}	{42,33,13,4,26,29,34,37,19,3,32,17,33,32,21,39,30,29,4,9,49,43,40,45,36,5,26,0,38}
{21,31,49,13,7,30,49,46,49,2,31,16,37,15}, 6	{21,31,49,13,7,30,49,46,2,31,16,37,15}	{21,31,49,13,7,30,49,46,2,31,16,37,15}
{45,18,30,4,19,25,46,16,14,3,45,14,41,10,9,14,43}, 14	{45,18,30,19,25,46,16,14,3,45,14,41,10,9,14,43}	{45,18,30,19,25,46,16,14,3,45,14,41,10,9,14,43}
{0,40,28,49,39,33,30,8,20,45,47,47,42,18,29,46,39,7,45,6,23,48,1,37,42,13,49,8,7,9}, 9	{0,40,28,49,39,33,30,8,20,45,47,47,42,18,29,46,39,7,45,6,23,1,37,42,13,49,8,7,9}	{0,40,28,49,39,33,30,8,20,45,47,47,42,18,29,46,39,7,45,6,23,1,37,42,13,49,8,7,9}
{0,18,8,41,1,40,1,22,35,49,21,29,19,2,26,8,11,23,16,34}, 4	{0,18,8,41,1,40,1,22,35,49,21,29,19,2,26,8,23,16,34}	{0,18,8,41,1,40,1,22,35,49,21,29,19,2,26,8,23,16,34}
{24,17,35,23,26,44,34,16,5,34}, 5	{24,17,35,23,26,34,16,5,34}	{24,17,35,23,26,34,16,5,34}
*/