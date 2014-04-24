package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeLinkNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PopulatingNextRightPointersInEachNode;

/**
 * 弼馬溫注解：
 */
public class PopulatingNextRightPointersInEachNodeConstantSpaceImpl
        implements PopulatingNextRightPointersInEachNode {

    @Override
    public void connect(TreeLinkNode root) {
        TreeLinkNode first = root;
        while (first != null) {
            TreeLinkNode curr = first;

            while (curr != null) {
                if (curr.left != null) {
                    curr.left.next = curr.right;
                }
                if (curr.right != null && curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            first = first.left;
        }
    }
}
