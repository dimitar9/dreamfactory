package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PathSumII;

import java.util.ArrayList;
import java.util.List;

/**
 * DFS with backtracking.
 */
public class PathSumIIDfsImpl implements PathSumII {
    @Override
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<>();
        calculdatePathSum(ret, new ArrayList<Integer>(), root, sum);
        return ret;
    }

    private void calculdatePathSum(List<List<Integer>> ret, List<Integer> path, TreeNode node, int remainingSum) {
        if (node == null) {
            return;
        }

        remainingSum -= node.val;

        if (node.left == null && node.right == null) {
            if (remainingSum == 0) {
                ArrayList<Integer> one = new ArrayList<Integer>(path);
                one.add(node.val);
                ret.add(one);
            }
            return;
        }

        path.add(node.val);
        calculdatePathSum(ret, path, node.left, remainingSum);
        calculdatePathSum(ret, path, node.right, remainingSum);
        path.remove(path.size() - 1);
    }
}
