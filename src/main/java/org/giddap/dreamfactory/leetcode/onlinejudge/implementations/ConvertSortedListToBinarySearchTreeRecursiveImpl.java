package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ConvertSortedListToBinarySearchTree;


public class ConvertSortedListToBinarySearchTreeRecursiveImpl implements ConvertSortedListToBinarySearchTree {
    @Override
    public TreeNode sortedListToBST(ListNode head) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int len = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            len++;
        }

        return build(head, 0, len - 1);
    }

    private TreeNode build(ListNode node, int left, int right) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if (node == null || left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        int i = 0;
        ListNode curr = node;
        while (i < mid) {
            curr = curr.next;
            i++;
        }

        TreeNode root = new TreeNode(curr.val);
        root.left = build(node, 0, mid - left - 1);
        root.right = build(curr.next, 0, right - mid - 1);

        return root;
    }
}
