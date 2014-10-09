package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

/**
 * <a href="http://oj.leetcode.com/problems/remove-duplicates-from-sorted-list/">Remove Duplicates From Sorted List</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p/>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/258/remove-duplicates-from-sorted-list">leetcode discussion</a>
 */
public interface RemoveDuplicatesFromSortedList {
    ListNode deleteDuplicates(ListNode head);
}
