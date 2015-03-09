package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.LinkedListCycle;

/**
 * Time: O(n); Space: O(1)
 * <p/>
 * Floyd's algorithm to detect a cycle in a linked list.
 * <p/>
 * A key observation is the hare will not pass by the tortoise until they reach
 * the same node.
 */
public class LinkedListCycleImpl implements LinkedListCycle {
    @Override
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode t = head;
        ListNode h = head;
        while (t != null && t.next != null) {
            t = t.next.next;
            h = h.next;
            if (t == h) {
                return true;
            }
        }
        return false;
    }
}
