package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.commons.TreeLinkNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PopulatingNextRightPointersInEachNodeII;

public class PopulatingNextRightPointersInEachNodeIIIterativeImpl implements PopulatingNextRightPointersInEachNodeII {
    @Override
    public void connect(TreeLinkNode root) {
        TreeLinkNode levelStart = root;
        while (levelStart != null) {
            TreeLinkNode prev = null;
            TreeLinkNode curr = levelStart;
            levelStart = null;
            while (curr != null) {
                if (curr.left != null) {
                    if (prev != null) {
                        prev.next = curr.left;
                    }
                    prev = curr.left;
                    if (levelStart == null) {
                        levelStart = curr.left;
                    }
                }

                if (curr.right != null) {
                    if (prev != null) {
                        prev.next = curr.right;
                    }
                    prev = curr.right;
                    if (levelStart == null) {
                        levelStart = curr.right;
                    }
                }
                curr = curr.next;
            }
        }
    }
}
