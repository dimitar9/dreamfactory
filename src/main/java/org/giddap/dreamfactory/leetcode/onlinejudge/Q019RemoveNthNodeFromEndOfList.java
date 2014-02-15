package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.ListNode;

/**
 * <a href="http://oj.leetcode.com/problems/remove-nth-node-from-end-of-list/">Remove Nth Node From End Of List</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p/>
 * For example,
 * <p/>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p/>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/200/remove-nth-node-from-end-of-list">leetcode discussion</a>
 */
public interface Q019RemoveNthNodeFromEndOfList {
    ListNode removeNthFromEnd(ListNode head, int n);
}
