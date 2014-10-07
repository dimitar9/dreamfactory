package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

/**
 * <a href="http://oj.leetcode.com/problems/merge-two-sorted-lists/">Merge Two Sorted Lists</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/202/merge-two-sorted-lists">Leetcode discussion</a>
 */
public interface MergeTwoSortedLists {
    ListNode mergeTwoLists(ListNode l1, ListNode l2);
}
