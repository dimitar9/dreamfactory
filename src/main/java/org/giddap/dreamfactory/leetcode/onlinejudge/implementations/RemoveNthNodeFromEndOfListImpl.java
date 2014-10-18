package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfListImpl implements RemoveNthNodeFromEndOfList {
    @Override
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newhead = new ListNode(0);
        newhead.next = head;

        ListNode fast = head;
        int i = 1;
        while (i < n && fast != null) {
            fast = fast.next;
            i++;
        }

        ListNode slow = head;
        ListNode prev = newhead;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;
        slow.next = null;
        return newhead.next;
    }
}
