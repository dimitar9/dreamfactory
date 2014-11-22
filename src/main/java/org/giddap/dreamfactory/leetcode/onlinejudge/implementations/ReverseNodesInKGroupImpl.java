package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ReverseNodesInKGroup;

public class ReverseNodesInKGroupImpl implements ReverseNodesInKGroup {
    public ListNode reverseKGroup2(ListNode head, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if (null == head) {
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (null != curr) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    @Override
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        if (k == 0 || k == 1) {
            return head;
        }

        ListNode current = head;
        // Calculate the total number of nodes
        int count = 0;
        while (null != current && count < k) {
            count++;
            current = current.next;
        }

        // Don't reverse if count is less than k
        if (count < k) {
            return head;
        }

        // Reverse k nodes
        current = head;
        int index = 0;
        ListNode prev = null;
        while (index < k && current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            index++;
        }

        // Reverse remaining nodes, if any
        if (current != null) {
            head.next = reverseKGroup(current, k);
        }

        return prev;
    }

    public ListNode reverseRecursively(ListNode curr) {
        if (curr == null) return null; // first question

        if (curr.next == null) return curr; // second question

        // third question - we grab the second element (which will   // be the last after we reverse it)

        ListNode secondElem = curr.next;

        // unlink list from the rest or you will get a cycle
        curr.next = null;

        // then we reverse everything from the second element on
        ListNode reverseRest = reverseRecursively(secondElem);

        // then we join the two lists
        secondElem.next = curr;

        return reverseRest;
    }

    public ListNode tailReverseRecursively(ListNode rest, ListNode done) {
        if (rest == null)
            return done;

        ListNode current = rest;
        rest = rest.next;
        current.next = done;

        return tailReverseRecursively(rest, current);
    }
}
