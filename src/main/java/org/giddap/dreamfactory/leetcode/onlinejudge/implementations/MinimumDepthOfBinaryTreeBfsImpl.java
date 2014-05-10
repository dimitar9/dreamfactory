package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.MinimumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Notes:
 * <ul>
 * <li>BFS and DFS have the same time complexity of O(n) in worst case.</li>
 * <li>BFS, however, will be more efficient on average cases as the
 * program would stop on the first leaf node found.</li>
 * <li>We need to use BFS lever-by-level traversal to count the levels.</li>
 * </ul>
 */
public class MinimumDepthOfBinaryTreeBfsImpl implements MinimumDepthOfBinaryTree {
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> currLevel = new LinkedList<TreeNode>();
        Queue<TreeNode> nextLevle = new LinkedList<TreeNode>();
        currLevel.offer(root);
        int depth = 1;
        while (!currLevel.isEmpty()) {
            TreeNode node = currLevel.poll();
            if (node.left == null && node.right == null) {
                break;
            }
            if (node.left != null) {
                nextLevle.offer(node.left);
            }
            if (node.right != null) {
                nextLevle.offer(node.right);
            }
            if (currLevel.isEmpty()) {
                currLevel = nextLevle;
                nextLevle = new LinkedList<TreeNode>();
                depth++;
            }
        }
        return depth;
    }
}
