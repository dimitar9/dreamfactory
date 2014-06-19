package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
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
        Stack<TreeNode> frontier = new Stack<TreeNode>();
        TreeNode curr = root;
        while (!frontier.isEmpty() || curr != null) {
            if (curr != null) {
                ret.add(curr.val);
                frontier.push(curr);
                curr = curr.left;
            } else {
                TreeNode tmp = frontier.pop();
                curr = tmp.right;
            }
        }
        return ret;
    }
}
