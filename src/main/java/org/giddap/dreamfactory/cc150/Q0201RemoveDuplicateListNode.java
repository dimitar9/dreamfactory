package org.giddap.dreamfactory.cc150;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Q0201RemoveDuplicateListNode {
    public ListNode removeDuplicatesWithExtraSpace(ListNode root) {
        Set<Integer> visited = new HashSet<Integer>();

        ListNode newhead = new ListNode(0);
        newhead.next = root;

        ListNode curr = root;
        ListNode prev = newhead;

        while (curr != null) {
            ListNode next = curr.next;
            if (visited.contains(curr.val)) {
                prev.next = next;
            } else {
                visited.add(curr.val);
                prev = curr;
            }
            curr = next;
        }
        return newhead.next;
    }

    public ListNode removeDuplicatesWithoutExtraSpace(ListNode root) {

        ListNode curr = root;
        while (curr != null) {
            ListNode remaining = curr.next;
            ListNode prev = curr;
            while (remaining != null) {
                if (remaining.val == curr.val) {
                    prev.next = remaining.next;
                } else {
                    prev = remaining;
                }
                remaining = remaining.next;
            }
            curr = curr.next;
        }
        return root;
    }
}
