package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.ReverseNodesInKGroupImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.ReverseNodesInKGroupIterativeImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * input	output	expected
 * {}, 1	{}    {}
 * <p/>
 * {}, 2	{}    {}
 * <p/>
 * {1}, 1	{1}    {1}
 * <p/>
 * {1}, 2	{1}    {1}
 * <p/>
 * {1,2}, 1	{1,2}    {1,2}
 * <p/>
 * {1,2}, 2	{2,1}    {2,1}
 * <p/>
 * {1,2}, 3	{1,2}    {1,2}
 * <p/>
 * {1,2,3}, 1	{1,2,3}    {1,2,3}
 * <p/>
 * {1,2,3}, 2	{2,1,3}    {2,1,3}
 * <p/>
 * {1,2,3}, 3	{3,2,1}    {3,2,1}
 * <p/>
 * {1,2,3}, 4	{1,2,3}    {1,2,3}
 * <p/>
 * {1,2,3,4}, 1	{1,2,3,4}    {1,2,3,4}
 * <p/>
 * {1,2,3,4}, 2	{2,1,4,3}    {2,1,4,3}
 * <p/>
 * {1,2,3,4}, 3	{3,2,1,4}    {3,2,1,4}
 * <p/>
 * {1,2,3,4}, 4	{4,3,2,1}    {4,3,2,1}
 * <p/>
 * {1,2,3,4}, 5	{1,2,3,4}    {1,2,3,4}
 * <p/>
 * {1,2,3,4,5}, 1	{1,2,3,4,5}    {1,2,3,4,5}
 * <p/>
 * {1,2,3,4,5}, 2	{2,1,4,3,5}    {2,1,4,3,5}
 * <p/>
 * {1,2,3,4,5}, 3	{3,2,1,4,5}    {3,2,1,4,5}
 * <p/>
 * {1,2,3,4,5}, 4	{4,3,2,1,5}    {4,3,2,1,5}
 * <p/>
 * {1,2,3,4,5}, 5	{5,4,3,2,1}    {5,4,3,2,1}
 * <p/>
 * {1,2,3,4,5}, 6	{1,2,3,4,5}    {1,2,3,4,5}
 * <p/>
 * {1,2,3,4,5,6}, 1	{1,2,3,4,5,6}    {1,2,3,4,5,6}
 * <p/>
 * {1,2,3,4,5,6}, 2	{2,1,4,3,6,5}    {2,1,4,3,6,5}
 * <p/>
 * {1,2,3,4,5,6}, 3	{3,2,1,6,5,4}    {3,2,1,6,5,4}
 * <p/>
 * {1,2,3,4,5,6}, 4	{4,3,2,1,5,6}    {4,3,2,1,5,6}
 * <p/>
 * {1,2,3,4,5,6}, 5	{5,4,3,2,1,6}    {5,4,3,2,1,6}
 * <p/>
 * {1,2,3,4,5,6}, 6	{6,5,4,3,2,1}    {6,5,4,3,2,1}
 * <p/>
 * {1,2,3,4,5,6}, 7	{1,2,3,4,5,6}    {1,2,3,4,5,6}
 */
public class ReverseNodesInKGroupTest {
    private ReverseNodesInKGroup solution = new ReverseNodesInKGroupImpl();
    private ReverseNodesInKGroup solution2 = new ReverseNodesInKGroupIterativeImpl();

    @Test
    public void small01() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next = two;
        two.next = three;
        three.next = four;

        ListNode actual = solution.reverseKGroup(one, 4);

        assertNotNull(actual);

        assertEquals(four.val, actual.val);
        assertEquals(three.val, actual.next.val);
        assertEquals(two.val, actual.next.next.val);
        assertEquals(one.val, actual.next.next.next.val);
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

        ListNode actual = solution.reverseKGroup(one, 2);

        assertNotNull(actual);

        assertEquals(two.val, actual.val);
        assertEquals(one.val, actual.next.val);
        assertEquals(four.val, actual.next.next.val);
        assertEquals(three.val, actual.next.next.next.val);
        assertEquals(five.val, actual.next.next.next.next.val);
    }

    @Test
    public void small03() {
        assertNull(solution.reverseKGroup(null, 1));
    }
}
