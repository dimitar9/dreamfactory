package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ConvertSortedArrayToBinarySearchTree;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTreeRecursiveImpl
        implements ConvertSortedArrayToBinarySearchTree {
    @Override
    public TreeNode sortedArrayToBST(int[] num) {
        final int len = num.length;
        if (len == 0) {
            return null;
        }
        final int mid = (len - 1) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(num, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(num, mid + 1, len));
        return root;
    }
}
