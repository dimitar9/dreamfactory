package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeLinkNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q117PopulatingNextRightPointersInEachNodeII;

public class Q117PopulatingNextRightPointersInEachNodeIIRecursiveImpl implements Q117PopulatingNextRightPointersInEachNodeII {
    @Override
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        TreeLinkNode curr = root;
        TreeLinkNode prev = null;
        while (curr != null) {
            if (curr.left != null) {
                if (prev != null) {
                    prev.next = curr.left;
                }
                prev = curr.left;
            }

            if (curr.right != null) {
                if (prev != null) {
                    prev.next = curr.right;
                }
                prev = curr.right;
            }
            curr = curr.next;
        }

        connect(root.left);
        connect(root.right);
    }
}
