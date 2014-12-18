package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalIIRecursiveImpl implements BinaryTreeLevelOrderTraversalII {
    @Override
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        List<List<Integer>> ret = new ArrayList<>();
        calculate(root, ret, 1);
        Collections.reverse(ret);
        return ret;
    }

    private void calculate(TreeNode root, List<List<Integer>> ret, int level) {
        if (root == null) {
            return;
        }

        if (ret.size() < level) {
            ret.add(new ArrayList<Integer>());
        }

        List<Integer> curr = ret.get(level - 1);

        curr.add(root.val);

        calculate(root.left, ret, level + 1);
        calculate(root.right, ret, level + 1);
    }
}
