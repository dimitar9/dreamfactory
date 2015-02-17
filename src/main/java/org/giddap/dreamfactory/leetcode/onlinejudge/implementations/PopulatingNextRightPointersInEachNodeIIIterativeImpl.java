package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeLinkNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PopulatingNextRightPointersInEachNodeII;

/**
 * Similar to the previous problem but need to add additional logic
 * to track the start node for the next level.
 */
public class PopulatingNextRightPointersInEachNodeIIIterativeImpl implements PopulatingNextRightPointersInEachNodeII {
    @Override
    public void connect(TreeLinkNode root) {
        TreeLinkNode first = root;
        while (first != null) {
            TreeLinkNode curr = first;
            first = null;
            TreeLinkNode prev = null;
            while (curr != null) {
                if (curr.left != null) {
                    if (prev != null) {
                        prev.next = curr.left;
                    }
                    prev = curr.left;
                    if (first == null) {
                        first = curr.left;
                    }
                }
                if (curr.right != null) {
                    if (prev != null) {
                        prev.next = curr.right;
                    }
                    prev = curr.right;
                    if (first == null) {
                        first = curr.right;
                    }
                }
                curr = curr.next;
            }
        }
    }
}
