package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q082RemoveDuplicatesFromSortedListII;

public class Q082RemoveDuplicatesFromSortedListIIImpl implements Q082RemoveDuplicatesFromSortedListII {
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode newhead = new ListNode(0);
        newhead.next = head;

        ListNode prev = newhead;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            boolean duplicate = false;
            while (next != null && curr.val == next.val) {
                next = next.next;
                duplicate = true;
            }

            if (duplicate) {
                prev.next = next;
            } else {
                prev = curr;
            }
            curr = next;
        }

        return newhead.next;
    }
}
