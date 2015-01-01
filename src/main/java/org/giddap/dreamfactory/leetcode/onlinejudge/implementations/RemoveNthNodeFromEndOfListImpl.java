package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfListImpl implements RemoveNthNodeFromEndOfList {
    @Override
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // advance the 'fast' pointer to 'nth' node
        ListNode fast = head;
        int i = 1;
        while (i < n && fast != null) {
            fast = fast.next;
            i++;
        }
        // boundary condition check
        if (fast == null) {
            return head;
        }
        // advance both pointers until 'fast' reaches the end
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode prev = newhead;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            prev = prev.next;
        }
        // remove the 'n-th' node
        prev.next = prev.next.next;
        return newhead.next;
    }
}
