package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.AddTwoNumbersImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers = new AddTwoNumbersImpl();

    @Test
    public void small01() {
        ListNode ln11 = new ListNode(5);
        ListNode ln12 = new ListNode(1);
        ListNode ln13 = new ListNode(4);
        ln11.next = ln12;
        ln12.next = ln13;

        ListNode ln21 = new ListNode(5);
        ListNode ln22 = new ListNode(6);
        ln21.next = ln22;

        ListNode actual = addTwoNumbers.addTwoNumbers(ln11, ln21);
        assertEquals(0, actual.val);
        assertEquals(8, actual.next.val);
        assertEquals(4, actual.next.next.val);
    }
}

/*
Test cases
Input 	Output 	Expected
{0}, {0}	{0}	{0}
{0}, {1}	{1}	{1}
{2}, {0}	{2}	{2}
{1}, {1}	{2}	{2}
{5}, {3}	{8}	{8}
{4}, {5}	{9}	{9}
{5}, {5}	{0,1}	{0,1}
{9}, {9}	{8,1}	{8,1}
{6}, {8}	{4,1}	{4,1}
{1,8}, {0}	{1,8}	{1,8}
{0}, {7,3}	{7,3}	{7,3}
{9,8}, {1}	{0,9}	{0,9}
{1}, {9,9}	{0,0,1}	{0,0,1}
{9,9}, {9}	{8,0,1}	{8,0,1}
{9,1,6}, {0}	{9,1,6}	{9,1,6}
{0}, {2,7,8}	{2,7,8}	{2,7,8}
{8,9,9}, {2}	{0,0,0,1}	{0,0,0,1}
{9}, {9,9,9}	{8,0,0,1}	{8,0,0,1}
{3,7}, {9,2}	{2,0,1}	{2,0,1}
{9,9}, {9,9}	{8,9,1}	{8,9,1}
{1,8,3}, {7,1}	{8,9,3}	{8,9,3}
{8,6}, {6,4,8}	{4,1,9}	{4,1,9}
{8,6}, {6,4,9}	{4,1,0,1}	{4,1,0,1}
{9}, {1,9,9,9,9,9,9,9,9,9}	{0,0,0,0,0,0,0,0,0,0,1}	{0,0,0,0,0,0,0,0,0,0,1}
{3,9,9,9,9,9,9,9,9,9}, {7}	{0,0,0,0,0,0,0,0,0,0,1}	{0,0,0,0,0,0,0,0,0,0,1}
{9}, {1,9,9,9,9,9,8,9,9,9}	{0,0,0,0,0,0,9,9,9,9}	{0,0,0,0,0,0,9,9,9,9}
{2,8,9,9,9,9,8,9,9,9}, {8}	{0,9,9,9,9,9,8,9,9,9}	{0,9,9,9,9,9,8,9,9,9}
{2,8,9,9,9,9,8,9,9,9}, {8,1,2}	{0,0,2,0,0,0,9,9,9,9}	{0,0,2,0,0,0,9,9,9,9}
{9,9,9,9,9,9,9,9,9,9}, {0}	{9,9,9,9,9,9,9,9,9,9}	{9,9,9,9,9,9,9,9,9,9}
{0}, {9,9,9,9,9,9,9,9,9,9}	{9,9,9,9,9,9,9,9,9,9}	{9,9,9,9,9,9,9,9,9,9}
*/