package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.MergeKSortedLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedListsImpl implements MergeKSortedLists {
    @Override
    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists == null || lists.isEmpty()) {
            return null;
        }
        Comparator<ListNode> comp = new Comparator<ListNode>() {
            public int compare(ListNode n1, ListNode n2) {
                return n1.val - n2.val;
            }
        };
        PriorityQueue<ListNode> heads = new PriorityQueue<>(lists.size(), comp);
        for (ListNode head : lists) {
            if (head != null) {
                heads.offer(head);
            }
        }
        ListNode newhead = new ListNode(0);
        ListNode prev = newhead;
        while(!heads.isEmpty()) {
            ListNode curr = heads.poll();
            ListNode next = curr.next;
            if (next != null) {
                heads.offer(next);
            }
            curr.next = null;
            prev.next = curr;
            prev = curr;
        }
        return newhead.next;
    }
}
