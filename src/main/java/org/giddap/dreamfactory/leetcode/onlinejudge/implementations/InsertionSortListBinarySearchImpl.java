package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.InsertionSortList;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time complexity: O(n^2)</li>
 * <li>Space complexity: O(1)</li>
 * <li>Thought Process: multiple pointers
 * </li>
 * </ul>
 */
public class InsertionSortListBinarySearchImpl implements InsertionSortList {
    @Override
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newhead = new ListNode(Integer.MIN_VALUE);
        newhead.next = head;

        ListNode sortedTail = head;
        ListNode curr = head.next;

        int n = 1;
        while (curr != null) {
            if (curr.val >= sortedTail.val) {
                sortedTail = curr;
            } else {
                ListNode next = curr.next;
                curr.next = null;
                insertWithBinarySearch(newhead, n, curr);
                sortedTail.next = next;
            }
            curr = sortedTail.next;
            n++;
        }

        return newhead.next;
    }

    private void insertWithBinarySearch(ListNode head, int n, ListNode curr) {

        if (n == 1) {
            ListNode realHead = head.next;
            if (realHead.val < curr.val) {
                ListNode next = realHead.next;
                realHead.next = curr;
                curr.next = next;
            } else {
                head.next = curr;
                curr.next = realHead;
            }
            return;
        }

        int mid = (n + 1) / 2;
        int i = 1;
        ListNode prev = head;
        ListNode tmp = head.next;
        while (i < mid) {
            tmp = tmp.next;
            prev = prev.next;
            i++;
        }

        if (tmp.val > curr.val) {
            insertWithBinarySearch(head, mid, curr);
        } else {
            insertWithBinarySearch(tmp, n - mid, curr);
        }
    }
}
