package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q102BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q102BinaryTreeLevelOrderTraversalIterativeBfsImpl implements Q102BinaryTreeLevelOrderTraversal {
    @Override
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> frontier = new LinkedList<TreeNode>();
        frontier.offer(root);
        int levelNodeCount = 1;

        ArrayList<Integer> levelNodeValues = new ArrayList<Integer>();
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
                levelNodeValues = new ArrayList<Integer>();
            }
        }
        return ret;
    }
}
