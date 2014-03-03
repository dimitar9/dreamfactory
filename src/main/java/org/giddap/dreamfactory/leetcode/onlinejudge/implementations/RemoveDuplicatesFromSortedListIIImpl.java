package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.RemoveDuplicatesFromSortedListII;

public class RemoveDuplicatesFromSortedListIIImpl implements RemoveDuplicatesFromSortedListII {
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode curr = head;
        ListNode prev = newhead;

        while (curr != null) {
            ListNode explorer = curr.next;
            while (explorer != null && explorer.val == curr.val) {
                explorer = explorer.next;
            }
            if (explorer == curr.next) { // no duplicates
                prev = curr;
            }
            prev.next = explorer;
            curr = explorer;
        }
        return newhead.next;
    }
}
