package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Use one queue and one counter.
 * Time: O(n); Space: O(n)
 */
public class BinaryTreeLevelOrderTraversalIterativeBfsWithOneQueueImpl implements BinaryTreeLevelOrderTraversal {
    @Override
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> frontier = new LinkedList<>();
        frontier.offer(root);
        int levelNodeCount = 1;

        ArrayList<Integer> levelNodeValues = new ArrayList<>();
        while (!frontier.isEmpty()) {
            TreeNode node = frontier.poll();
            levelNodeValues.add(node.val);
            levelNodeCount--;

            if (node.left != null) {
                frontier.offer(node.left);
            }

            if (node.right != null) {
                frontier.offer(node.right);
            }

            if (levelNodeCount == 0) {
                levelNodeCount = frontier.size();
                ret.add(levelNodeValues);
                levelNodeValues = new ArrayList<>();
            }
        }
        return ret;
    }
}
