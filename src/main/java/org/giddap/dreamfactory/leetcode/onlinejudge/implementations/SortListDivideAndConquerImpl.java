package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.SortList;

/**
 *
 */
public class SortListDivideAndConquerImpl implements SortList {
    @Override
    public ListNode sortList(ListNode head) {
        int i = 1;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            curr = curr.next;
            i++;
        }
        return sort(head, i);
    }

    private ListNode sort(ListNode head, int numOfNodes) {
        if (head == null || numOfNodes == 1) {
            return head;
        }

        int midIdx = (numOfNodes + 1) / 2;

        ListNode leftEnd = head;
        int i = 1;
        while (i < midIdx) {
            leftEnd = leftEnd.next;
            i++;
        }
        ListNode rightHead = leftEnd.next;
        leftEnd.next = null;

        ListNode leftHead = sort(head, midIdx);
        rightHead = sort(rightHead, numOfNodes - midIdx);

        ListNode newHead = new ListNode(-1);
        ListNode curr = newHead;
        while (leftHead != null && rightHead != null) {
            if (leftHead.val < rightHead.val) {
                curr.next = leftHead;
                leftHead = leftHead.next;
            } else {
                curr.next = rightHead;
                rightHead = rightHead.next;
            }
            curr = curr.next;
            curr.next = null;
        }
        if (leftHead == null) {
            curr.next = rightHead;
        } else {
            curr.next = leftHead;
        }

        return newHead.next;
    }
}
