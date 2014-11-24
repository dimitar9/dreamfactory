package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ReverseNodesInKGroup;

/**
 *
 */
public class ReverseNodesInKGroupIterativeImpl implements ReverseNodesInKGroup {
    @Override
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        // Calculate number of nodes
        ListNode curr = head;
        int numOfNodes = 0;
        while (curr != null) {
            numOfNodes++;
            curr = curr.next;
        }

        if (numOfNodes < k) {
            return head;
        }

        final int nonReversableTailStartNodeIdx = numOfNodes + 1 - numOfNodes % k;

        // Reverse the nodes
        int i = 1;
        ListNode prev = newhead;
        while (i < nonReversableTailStartNodeIdx) {
            prev = reverse(prev, k);
            i += k;
        }

        return newhead.next;
    }

    // Return the tail node after the reversion
    private ListNode reverse(ListNode beforeHead, int k) {
        ListNode prev = beforeHead;
        int i = 1;
        ListNode curr = beforeHead.next;
        while (i < k) {
            ListNode next = curr.next;
            curr.next = next.next;
            ListNode prevNext = prev.next;
            prev.next = next;
            next.next = prevNext;
            i++;
        }
        return curr;
    }
}
