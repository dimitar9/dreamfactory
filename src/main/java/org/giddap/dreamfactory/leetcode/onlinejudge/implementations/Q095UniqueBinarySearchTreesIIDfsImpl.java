package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q095UniqueBinarySearchTreesII;

import java.util.ArrayList;


public class Q095UniqueBinarySearchTreesIIDfsImpl implements Q095UniqueBinarySearchTreesII {
    @Override
    public ArrayList<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    public ArrayList<TreeNode> generateTrees(int start, int end) {
        ArrayList<TreeNode> unique = new ArrayList<TreeNode>();
        if (start > end) {
            unique.add(null);
            return unique;
        }
        for (int i = start; i <= end; i++) {
            for (TreeNode left : generateTrees(start, i - 1)) {
                for (TreeNode right : generateTrees(i + 1, end)) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    unique.add(root);
                }
            }
        }
        return unique;
    }
}
