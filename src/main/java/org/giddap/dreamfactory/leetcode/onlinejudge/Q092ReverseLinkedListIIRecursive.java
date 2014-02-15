package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.ListNode;

/**
 *
 */
public class Q092ReverseLinkedListIIRecursive {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (m == n) {
            return head;
        }
        return reverse(head, 1, m, n);
    }

    private ListNode oldReverseTailNode;
    private ListNode tailHead;

    public ListNode reverse(ListNode node, int seq, int m, int n) {
        if (node == null) {
            return null;
        }

        ListNode oldNext = reverse(node.next, seq + 1, m, n);

        if (seq < m || seq > n) {
            node.next = oldNext;
            return node;
        } else if (seq == n) {
            tailHead = oldNext;
            oldReverseTailNode = node;
            node.next = null;
            return node;
        } else if (seq == m) {
            oldNext.next = node;
            node.next = tailHead;
            return oldReverseTailNode;
        } else {
            oldNext.next = node;
            node.next = null;
            return node;
        }
    }
}
