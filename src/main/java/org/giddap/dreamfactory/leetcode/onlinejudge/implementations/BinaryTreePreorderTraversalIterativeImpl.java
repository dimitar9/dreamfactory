package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreePreorderTraversal;

import java.util.*;

/**
 *
 */
public class BinaryTreePreorderTraversalIterativeImpl implements BinaryTreePreorderTraversal {
    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Deque<TreeNode> frontier = new ArrayDeque<>();
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
