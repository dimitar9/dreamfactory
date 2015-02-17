package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeLinkNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PopulatingNextRightPointersInEachNode;

public class PopulatingNextRightPointersInEachNodeRecursiveImpl implements PopulatingNextRightPointersInEachNode {
    @Override
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            root.left.next = root.right;
        }

        if (root.right != null) {
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }

        connect(root.left);
        connect(root.right);
    }
}
