package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ReverseNodesInKGroup;

public class ReverseNodesInKGroupImpl implements ReverseNodesInKGroup {

    @Override
    public ListNode reverseKGroup(ListNode head, int k) {
        // Count the number of nodes
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        // Calculate the starting node of the tail section
        // that should not be reversed
        final int firstNonReversibleNodeNumber = len - (len % k) + 1;

        // Reverse the list in k nodes
        ListNode newhead = new ListNode(0);
        newhead.next = head;

        ListNode prev = newhead;
        curr = head;

        int i = 1;
        while (i < firstNonReversibleNodeNumber
            && curr != null && curr.next != null) {
            ListNode next = curr.next;
            if (i % k != 0) {
                ListNode nextnext = next.next;
                ListNode prevnext = prev.next;
                next.next = prevnext;
                prev.next = next;
                curr.next = nextnext;
            } else { // Skip the Kth node
                prev = curr;
                curr = next;
            }
            i++;
        }

        return newhead.next;
    }
}
