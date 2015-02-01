package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.RemoveDuplicatesFromSortedListII;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Use two pointers.
 * <ul>
 * <li>Pointer 'prev': 'prev.next' always point to the current node</li>
 * <li>Pointer 'curr': always point to the current node</li>
 * </ul>
 * </li>
 * <li>
 * Time complexity: O(n) on both operations.
 * </li>
 * <li>
 * Space complexity: O(1).
 * </li>
 * </ul>
 */
public class RemoveDuplicatesFromSortedListIIImpl implements RemoveDuplicatesFromSortedListII {
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newhead = new ListNode(Integer.MAX_VALUE);
        newhead.next = head;

        ListNode prev = newhead;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            while (next != null && curr.val == next.val) {
                next = next.next;
            }
            if (next == null || next != curr.next) {
                prev.next = next;
            } else {
                prev = curr;
            }
            curr = next;
        }
        return newhead.next;
    }
}
