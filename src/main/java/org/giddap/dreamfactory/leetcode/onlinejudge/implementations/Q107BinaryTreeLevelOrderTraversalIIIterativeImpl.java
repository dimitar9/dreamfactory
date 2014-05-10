package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q107BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class Q107BinaryTreeLevelOrderTraversalIIIterativeImpl implements Q107BinaryTreeLevelOrderTraversalII {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> curr = new LinkedList<TreeNode>();
        curr.offer(root);

        Queue<TreeNode> next = new LinkedList<TreeNode>();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
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
                numbers = new ArrayList<Integer>();
                curr = next;
                next = new LinkedList<TreeNode>();
            }
        }
        return ret;
    }
}
