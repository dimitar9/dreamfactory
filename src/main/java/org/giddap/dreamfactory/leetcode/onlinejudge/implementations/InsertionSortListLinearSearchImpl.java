package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.InsertionSortList;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time complexity: O(n*log(n))</li>
 * <li>Space complexity: O(1)</li>
 * <li>Thought Process: multiple pointers with binary search for best
 * efficiency.
 * </li>
 * </ul>
 */
public class InsertionSortListLinearSearchImpl implements InsertionSortList {
    @Override
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newhead = new ListNode(Integer.MIN_VALUE);
        newhead.next = head;

        ListNode curr = head.next;
        ListNode sortedTail = head;
        int sortedCount = 1;

        while (curr != null) {
            if (curr.val >= sortedTail.val) {
                sortedTail = curr;
                curr = curr.next;
            } else {
                sortedTail.next = curr.next;
                curr.next = null;
                ListNode tmp = newhead.next;
                ListNode prev = newhead;

                int i = 1;
                while (i <= sortedCount) {
                    if (curr.val <= tmp.val) {
                        prev.next = curr;
                        curr.next = tmp;
                        break;
                    }
                    tmp = tmp.next;
                    prev = prev.next;
                    i++;
                }
                curr = sortedTail.next;
            }

            sortedCount++;
        }

        return newhead.next;
    }
}
