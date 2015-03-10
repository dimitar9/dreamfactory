package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreePreorderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Use a stack to simulate the recursive traversal.
 */
public class BinaryTreePreorderTraversalStackSimulationImpl implements BinaryTreePreorderTraversal {
    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        if (root == null) {
            return r;
        }
        Deque<TreeNode> f = new ArrayDeque<>();
        f.push(root);
        while (! f.isEmpty()) {
            TreeNode node = f.pop();
            r.add(node.val);
            if (node.right != null) {
                f.push(node.right);
            }
            if (node.left != null) {
                f.push(node.left);
            }
        }
        return r;
    }
}
