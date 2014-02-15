package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q108ConvertSortedArrayToBinarySearchTree;

public class Q108ConvertSortedArrayToBinarySearchTreeRecursiveImpl implements Q108ConvertSortedArrayToBinarySearchTree {
    @Override
    public TreeNode sortedArrayToBST(int[] num) {
        return construct(num, 0, num.length - 1);
    }

    private TreeNode construct(int[] num, int lowIdx, int highIdx) {
        if (lowIdx > highIdx) {
            return null;
        } else {
            int midIdx = lowIdx + (highIdx - lowIdx) / 2;
            TreeNode root = new TreeNode(num[midIdx]);
            root.left = construct(num, lowIdx, midIdx - 1);
            root.right = construct(num, midIdx + 1, highIdx);
            return root;
        }
    }
}
