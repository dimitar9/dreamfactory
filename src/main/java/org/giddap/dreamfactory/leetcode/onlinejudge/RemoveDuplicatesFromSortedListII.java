package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

/**
 * http://oj.leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * <p/>
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from
 * the original list.
 * <p/>
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/257/remove-duplicates-from-sorted-list-ii
 */
public interface RemoveDuplicatesFromSortedListII {
    ListNode deleteDuplicates(ListNode head);
}
