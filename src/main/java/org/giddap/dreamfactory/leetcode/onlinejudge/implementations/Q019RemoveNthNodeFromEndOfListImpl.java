package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q019RemoveNthNodeFromEndOfList;

public class Q019RemoveNthNodeFromEndOfListImpl implements Q019RemoveNthNodeFromEndOfList {
    @Override
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode newhead = new ListNode(0);
        newhead.next = head;

        ListNode fast = head;
        int i = 1;
        while (i < n) {
            fast = fast.next == null ? head : fast.next;
            i++;
        }

        ListNode prev = newhead;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return newhead.next;
    }
}
