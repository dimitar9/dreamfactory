package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 */
public class BinaryTreeLevelOrderTraversalIIIterativeImpl implements BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> curr = new LinkedList<>();
        curr.offer(root);

        Queue<TreeNode> next = new LinkedList<>();

        ArrayList<Integer> numbers = new ArrayList<>();
        while (!curr.isEmpty()) {
            TreeNode node = curr.poll();
            numbers.add(node.val);

            if (node.left != null) {
                next.offer(node.left);
            }

            if (node.right != null) {
                next.offer(node.right);
            }

            if (curr.isEmpty()) {
                ret.add(0, numbers);
                numbers = new ArrayList<>();
                curr = next;
                next = new LinkedList<>();
            }
        }
        return ret;
    }
}
