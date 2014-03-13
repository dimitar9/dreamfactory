package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 弼馬溫注解：
 * Use 'curr' and 'prev' to track the movement: up or down, with a stack.
 */
public class BinaryTreePostorderTraversalIterativeWithStackImpl implements
        BinaryTreePostorderTraversal {
    @Override
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (root == null) {
            return ret;
        }
        Stack<TreeNode> frontier = new Stack<TreeNode>();
        frontier.push(root);
        TreeNode prev = null;
        while (!frontier.isEmpty()) {
            TreeNode curr = frontier.peek();
            if (prev == null || prev.left == curr || prev.right == curr) {
                if (curr.left != null) {
                    frontier.push(curr.left);
                } else if (curr.right != null) {
                    frontier.push(curr.right);
                } else {
                    ret.add(curr.val);
                    frontier.pop();
                }
            } else if (prev == curr.left) {
                if (curr.right != null) {
                    frontier.push(curr.right);
                } else {
                    ret.add(curr.val);
                    frontier.pop();
                }
            } else if (prev == curr.right) {
                ret.add(curr.val);
                frontier.pop();
            }
            prev = curr;
        }
        return ret;
    }
}
