package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q002AddTwoNumbers;

public class Q002AddTwoNumbersImpl implements Q002AddTwoNumbers {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode newHead = new ListNode(0);
        ListNode prev = newHead;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;

            prev.next = node;
            prev = node;
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            prev.next = node;
        }

        return newHead.next;
    }
}

