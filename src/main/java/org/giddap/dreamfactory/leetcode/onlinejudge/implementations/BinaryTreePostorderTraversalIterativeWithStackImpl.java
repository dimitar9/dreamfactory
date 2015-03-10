package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreePostorderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 弼馬溫注解：
 * The algorithm has following steps, which is slight different from the previous question:
 * (1) Push the root node into the stack.
 * (2) while the stack is not empty, do:
 * if
 *      the top node is a leaf node (no left&right children), pop it.
 *      or if the top node has been visited, pop it.
 *          (here we use a sign head to show the latest popped node, if the top node's child = the latest popped node,
 *          either left or right, it must has been visited.)
 * else
 *      b. push the right child of the top node (if exists)
 *      c. push the left child of the top node (if exists)
 */
public class BinaryTreePostorderTraversalIterativeWithStackImpl implements
        BinaryTreePostorderTraversal {
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Deque<TreeNode> frontier = new ArrayDeque<>();
        frontier.push(root);
        TreeNode prev = root;
        while (!frontier.isEmpty()) {
            TreeNode curr = frontier.peek();
            if ((curr.left == null && curr.right == null) || curr.left == prev || curr.right == prev) {
                ret.add(curr.val);
                frontier.pop();
                prev = curr;
            } else {
                if (curr.right != null) {
                    frontier.push(curr.right);
                }
                if (curr.left != null) {
                    frontier.push(curr.left);
                }
            }
        }
        return ret;
    }
}
