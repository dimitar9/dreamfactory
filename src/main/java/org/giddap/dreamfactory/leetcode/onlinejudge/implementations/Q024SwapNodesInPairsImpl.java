package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q024SwapNodesInPairs;

public class Q024SwapNodesInPairsImpl implements Q024SwapNodesInPairs {
    @Override
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode prev = newHead;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode nextnext = curr.next.next;
            curr.next.next = curr;
            prev.next = curr.next;
            curr.next = nextnext;
            prev = curr;
            curr = nextnext;
        }

        return newHead.next;
    }
}
