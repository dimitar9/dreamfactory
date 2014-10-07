package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.MergeTwoSortedLists;

public class MergeTwoSortedListsIterativeImpl implements MergeTwoSortedLists {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode(0);
        ListNode prev = newhead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                prev = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                prev = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            prev.next = l1;
        } else {
            prev.next = l2;
        }

        return newhead.next;
    }
}
