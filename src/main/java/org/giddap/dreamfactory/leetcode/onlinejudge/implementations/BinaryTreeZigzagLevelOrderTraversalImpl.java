package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeZigzagLevelOrderTraversal;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversalImpl implements BinaryTreeZigzagLevelOrderTraversal {

    @Override
    public List<List<Integer>> zigzagLevelOrder(final TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Deque<TreeNode> curr = new ArrayDeque<TreeNode>();
        curr.offerFirst(root);
        Deque<TreeNode> next = new ArrayDeque<TreeNode>();

        ArrayList<Integer> row = new ArrayList<Integer>();
        boolean fromLeftToRight = true;

        while (!curr.isEmpty()) {
            TreeNode node = curr.pollFirst();
            row.add(node.val);

            if (fromLeftToRight) {
                if (node.left != null) {
                    next.offerFirst(node.left);
                }

                if (node.right != null) {
                    next.offerFirst(node.right);
                }
            } else {
                if (node.right != null) {
                    next.offerFirst(node.right);
                }

                if (node.left != null) {
                    next.offerFirst(node.left);
                }
            }

            if (curr.isEmpty()) {
                fromLeftToRight = !fromLeftToRight;

                ret.add(row);
                row = new ArrayList<Integer>();

                curr = next;
                next = new ArrayDeque<TreeNode>();
            }
        }
        return ret;
    }
}
