package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ValidateBinarySearchTree;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidateBinarySearchTreeIterativeImpl implements ValidateBinarySearchTree {
    @Override
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> nodes = new Stack<TreeNode>();
        Set<TreeNode> visited = new HashSet<TreeNode>();

        int prevVal = Integer.MIN_VALUE;
        TreeNode currNode = root;

        while (currNode != null) {
            if (!visited.contains(currNode) && currNode.left != null) {
                nodes.push(currNode);
                visited.add(currNode);
                currNode = currNode.left;
            } else {
                if (currNode.val <= prevVal) {
                    return false;
                }
                prevVal = currNode.val;
                if (currNode.right != null) {
                    currNode = currNode.right;
                } else {
                    if (!nodes.isEmpty()) {
                        currNode = nodes.pop();
                    } else {
                        currNode = null;
                    }
                }
            }
        }
        return true;
    }
}
