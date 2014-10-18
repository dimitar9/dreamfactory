package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

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
 * <p/>
 * http://n00tc0d3r.blogspot.com/2013/05/remove-n-th-to-end-element-from-list.html
 */
public interface RemoveNthNodeFromEndOfList {
    ListNode removeNthFromEnd(ListNode head, int n);
}
