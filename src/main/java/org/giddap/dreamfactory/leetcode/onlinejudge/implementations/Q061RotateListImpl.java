package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q061RotateList;

public class Q061RotateListImpl implements Q061RotateList {
    @Override
    public ListNode rotateRight(ListNode head, int n) {
        if (n == 0 || head == null) {
            return head;
        }
        ListNode newhead = new ListNode(0);
        newhead.next = head;

        int i = 1;
        int len = 0;
        ListNode fast = head;
        while (i < n) {
            fast = fast.next;
            if (fast == null) {
                fast = head;
                len = i;
            }
            i++;
        }

        ListNode slow = newhead;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if (slow != newhead) {
            newhead.next = slow.next;
            slow.next = null;
            fast.next = head;
        }

        return newhead.next;
    }
}
