package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q021MergeTwoSortedLists;

public class Q021MergeTwoSortedListsIterativeImpl implements Q021MergeTwoSortedLists {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        // Return the other list immediately if one of the lists is null
        ListNode head = new ListNode(0);
        ListNode prev = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if (l1 != null) {
            prev.next = l1;
        } else if (l2 != null) {
            prev.next = l2;
        }

        return head.next;
    }
}
