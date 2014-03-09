package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 弼馬溫注解：
 */
public class BinaryTreeInorderTraversalWithStackOnlyIterativeImpl implements BinaryTreeInorderTraversal {
    @Override
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> ret = new ArrayList<Integer>();
        TreeNode node = root;
        Stack<TreeNode> nodes = new Stack<TreeNode>();

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