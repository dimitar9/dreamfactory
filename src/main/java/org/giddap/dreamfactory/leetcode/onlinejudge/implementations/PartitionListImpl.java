package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PartitionList;

public class PartitionListImpl implements PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode largehead = new ListNode(0);
        largehead.next = head;

        ListNode smallhead = new ListNode(-1);
        ListNode smalltail = smallhead;

        ListNode prev = largehead;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            if (curr.val < x) {
                // Remove current node from the 'large' list
                prev.next = next;
                // Append it to the 'small' list
                curr.next = null;
                smalltail.next = curr;
                // Advance 'smalltail' to the next node
                smalltail = smalltail.next;
            } else {
                // Advance 'largetail' to the next node
                prev = curr;
            }
            // Advance curr to the next node on 'large' list
            curr = next;
        }
        smalltail.next = largehead.next;
        return smallhead.next;
    }
}
