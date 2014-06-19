package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q107BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.Collections;

public class Q107BinaryTreeLevelOrderTraversalIIRecursiveImpl implements Q107BinaryTreeLevelOrderTraversalII {
    @Override
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        calculate(root, ret, 1);
        Collections.reverse(ret);
        return ret;
    }

    private void calculate(TreeNode root, ArrayList<ArrayList<Integer>> ret, int level) {
        if (root == null) {
            return;
        }

        if (ret.size() < level) {
            ret.add(new ArrayList<Integer>());
        }

        ArrayList<Integer> curr = ret.get(level - 1);

        curr.add(root.val);

        calculate(root.left, ret, level + 1);
        calculate(root.right, ret, level + 1);
    }
}
