package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.UniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.List;


public class UniqueBinarySearchTreesIIDfsImpl implements UniqueBinarySearchTreesII {
    @Override
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> unique = new ArrayList<TreeNode>();
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