package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q021MergeTwoSortedLists;

/**
 *
 */
public class Q021MergeTwoSortedListsRecursiveImpl implements Q021MergeTwoSortedLists {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            ListNode curr = null;
            if (l1.val < l2.val) {
                curr = l1;
                curr.next = mergeTwoLists(l1.next, l2);
            } else {
                curr = l2;
                curr.next = mergeTwoLists(l1, l2.next);
            }
            return curr;
        }
    }
}
