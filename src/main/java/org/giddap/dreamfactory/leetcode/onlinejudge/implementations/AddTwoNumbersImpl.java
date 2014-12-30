package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.AddTwoNumbers;

public class AddTwoNumbersImpl implements AddTwoNumbers {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int c = 0;
        while (l1 != null || l2 != null) {
            int sum = c;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode curr = new ListNode(sum % 10);
            prev.next = curr;
            prev = curr;
            c = sum / 10;
        }
        if (c != 0) {
            ListNode curr = new ListNode(c);
            prev.next = curr;
        }
        return head.next;
    }
}

