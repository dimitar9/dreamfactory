package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.MergeKSortedLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedListsImpl implements MergeKSortedLists {
    @Override
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (lists.isEmpty()) {
            return null;
        }

        Comparator<ListNode> listNodeComparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode n1, ListNode n2) {
                return n1.val - n2.val;
            }
        };

        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), listNodeComparator);

        for (ListNode head : lists) {
            if (head != null) {
                heap.offer(head);
            }
        }

        ListNode newHead = new ListNode(0);
        ListNode prev = newHead;
        while (!heap.isEmpty()) {
            ListNode curr = heap.poll();
            if (curr.next != null) {
                heap.offer(curr.next);
            }
            prev.next = curr;
            prev = curr;
        }

        return newHead.next;
    }
}
