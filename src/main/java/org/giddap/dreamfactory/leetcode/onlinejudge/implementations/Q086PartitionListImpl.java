package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q086PartitionList;

public class Q086PartitionListImpl implements Q086PartitionList {

    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode bigHead = new ListNode(0);
        bigHead.next = head;
        ListNode prev = bigHead;

        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;

        ListNode node = head;
        while (node != null) {
            if (node.val < x) {
                prev.next = node.next;
                smallTail.next = node;
                smallTail = node;
            } else {
                prev = node;
            }
            node = node.next;
        }

        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}
