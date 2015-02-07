package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeInorderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Time: O(n); Space: O(n)
 * 1) Create an empty stack S.
 * 2) Initialize current node as root
 * 3) Push the current node to S and set current = current->left until current is NULL
 * 4) If current is NULL and stack is not empty then
 *   a) Pop the top item from stack.
 *   b) Print the popped item, set current = popped_item->right
 *   c) Go to step 3.
 * 5) If current is NULL and stack is empty then we are done.
 */
public class BinaryTreeInorderTraversalWithStackOnlyIterativeImpl
        implements BinaryTreeInorderTraversal {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        TreeNode node = root;
        Deque<TreeNode> nodes = new ArrayDeque<>();

        while (!nodes.isEmpty() || node != null) {
            if (node != null) {
                nodes.push(node);
                node = node.left;
            } else {
                node = nodes.pop();
                ret.add(node.val);
                node = node.right;
            }
        }
        return ret;
    }
}