package org.giddap.dreamfactory.cc150;

import org.giddap.dreamfactory.commons.ListNode;

public class Q0202FindNthNodeFromTheEnd {
    public ListNode findKthNodeFromEnd(ListNode root, int k) {

        ListNode fast = root;
        int i = 1;
        while (i < k) {
            fast = fast.next;
            i++;
            if (fast == null) {
                fast = root;
            }
        }

        ListNode slow = root;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode findKthNodeFromEndRecursively(ListNode root, int k) {
        findKthNodeFromEndRecursivelyHelper(root, k);
        return kthNodeFromTheEnd;
    }

    private ListNode kthNodeFromTheEnd = null;

    private int findKthNodeFromEndRecursivelyHelper(ListNode node, int k) {
        if (node == null) {
            return 0;
        }

        if (node.next == null) {
            return 1;
        }

        int orderFromTheEnd = 1 + findKthNodeFromEndRecursivelyHelper(node.next, k);
        if (orderFromTheEnd == k) {
            kthNodeFromTheEnd = node;
        }

        return orderFromTheEnd;
    }
}
