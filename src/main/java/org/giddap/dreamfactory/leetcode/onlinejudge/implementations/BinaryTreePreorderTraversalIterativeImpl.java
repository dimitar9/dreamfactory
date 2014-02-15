package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 */
public class BinaryTreePreorderTraversalIterativeImpl implements BinaryTreePreorderTraversal {
    @Override
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (root == null) {
            return ret;
        }
        Stack<TreeNode> frontier = new Stack<TreeNode>();
        frontier.push(root);
        while (!frontier.isEmpty()) {
            TreeNode curr = frontier.pop();
            ret.add(curr.val);

            if (curr.right != null) {
                frontier.push(curr.right);
            }

            if (curr.left != null) {
                frontier.push(curr.left);
            }
        }
        return ret;
    }
}
