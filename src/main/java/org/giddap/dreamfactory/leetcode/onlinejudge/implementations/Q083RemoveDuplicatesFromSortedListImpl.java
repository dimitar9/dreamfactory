package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q083RemoveDuplicatesFromSortedList;

public class Q083RemoveDuplicatesFromSortedListImpl implements Q083RemoveDuplicatesFromSortedList {
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            if (curr.val == next.val) {
                curr.next = next.next;
            } else {
                curr = next;
            }
        }
        return head;
    }
}
