package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

/**
 * http://leetcode.com/onlinejudge#question_25
 * <p/>
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * <p/>
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * <p/>
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * <p/>
 * Only constant memory is allowed.
 * <p/>
 * For example,
 * Given this linked list: 1->2->3->4->5
 * <p/>
 * For k = 2, you should return: 2->1->4->3->5
 * <p/>
 * For k = 3, you should return: 3->2->1->4->5
 * <p/>
 * Good article:
 * http://crackinterviewtoday.wordpress.com/2010/03/28/k-reverse-linked-list/
 * http://mattcb.blogspot.com/2012/11/reverse-nodes-in-k-group.html
 */
public class Q025ReverseNodesInKGroup {
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
