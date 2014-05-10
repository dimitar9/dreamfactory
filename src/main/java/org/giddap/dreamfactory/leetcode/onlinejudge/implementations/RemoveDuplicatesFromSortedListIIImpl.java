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
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode curr = head;
        ListNode prev = newhead;

        while (curr != null) {
            ListNode explorer = curr.next;
            while (explorer != null && explorer.val == curr.val) {
                explorer = explorer.next;
            }
            if (explorer == curr.next) { // no duplicates
                prev = curr;
            }
            prev.next = explorer;
            curr = explorer;
        }
        return newhead.next;
    }
}
