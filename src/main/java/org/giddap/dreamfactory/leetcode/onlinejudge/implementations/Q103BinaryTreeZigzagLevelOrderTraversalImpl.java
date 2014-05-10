package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q103BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Q103BinaryTreeZigzagLevelOrderTraversalImpl implements Q103BinaryTreeZigzagLevelOrderTraversal {

    @Override
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(final TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> frontier = new LinkedList<TreeNode>();
        frontier.offer(root);
        int levelNodeCount = 1;

        ArrayList<Integer> levelNumbers = new ArrayList<Integer>();
        boolean fromLeftToRight = true;

        while (!frontier.isEmpty()) {
            TreeNode node = frontier.poll();
            levelNodeCount--;
            levelNumbers.add(node.val);

            if (node.left != null) {
                frontier.offer(node.left);
            }

            if (node.right != null) {
                frontier.offer(node.right);
            }

            if (levelNodeCount == 0) {
                if (!fromLeftToRight) {
                    Collections.reverse(levelNumbers);
                    fromLeftToRight = true;
                } else {
                    fromLeftToRight = false;
                }
                ret.add(new ArrayList<Integer>(levelNumbers));
                levelNodeCount = frontier.size();
                levelNumbers = new ArrayList<Integer>();
            }
        }
        return ret;
    }
}
