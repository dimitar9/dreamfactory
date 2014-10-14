package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ReorderList;

/**
 *
 */
public class ReorderListImpl implements ReorderList {
    @Override
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }


        // Find the mid node
        ListNode slow = head;
        ListNode fast = head.next;
        if (fast == null) {
            return;
        }
        ListNode prevFast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            prevFast = fast.next;
            fast = fast.next.next;
        }

        if (fast == null) {
            fast = prevFast;
        }

        // Reverse the second half of the list
        ListNode curr = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Merge the two lists
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        slow = newhead.next;
        prev = newhead;
        while (fast != null && slow != null) {
            ListNode slowNext = slow.next;
            ListNode fastNext = fast.next;

            prev.next = slow;
            prev = slow;
            prev.next = fast;
            prev = fast;
            prev.next = null;

            slow = slowNext;
            fast = fastNext;
        }

        if (slow != null) {
            prev.next = slow;
            prev = prev.next;
        } else if (fast != null) {
            prev.next = fast;
            prev = prev.next;
        }

        if (prev != null) {
            prev.next = null;
        }
    }
}
