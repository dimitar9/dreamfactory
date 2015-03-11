package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
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
        ListNode newhead = new ListNode(Integer.MIN_VALUE);
        newhead.next = head;
        ListNode prev = newhead;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            // execute insertion sort
            ListNode tmpprev = newhead;
            ListNode tmp = newhead.next;
            while (tmp != curr) {
                if (tmpprev.val <= curr.val && curr.val <= tmp.val) {
                    // found the insertion place
                    tmpprev.next = curr;
                    curr.next = tmp;
                    break;
                }
                tmpprev = tmp;
                tmp = tmp.next;
            }
            if (tmp == curr) {
                prev = curr;
            } else {
                prev.next = next;
            }
            curr = next;
        }
        return newhead.next;
    }
}
