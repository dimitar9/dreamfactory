package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 */
public class BinaryTreeLevelOrderTraversalIterativeBfsWithTwoQueueImpl {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> curr = new LinkedList<TreeNode>();
        curr.offer(root);
        Queue<TreeNode> next = new LinkedList<TreeNode>();

        List<Integer> level = new ArrayList<Integer>();
        while (!curr.isEmpty()) {
            TreeNode node = curr.poll();
            level.add(node.val);

            if (node.left != null) {
                next.offer(node.left);
            }

            if (node.right != null) {
                next.offer(node.right);
            }

            if (curr.isEmpty()) {
                curr = next;
                next = new LinkedList<TreeNode>();

                ret.add(level);
                level = new ArrayList<Integer>();
            }
        }
        return ret;
    }
}
