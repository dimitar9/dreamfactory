package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q113PathSumII;

import java.util.ArrayList;

public class Q113PathSumIIDfsImpl implements Q113PathSumII {
    @Override
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        calculdatePathSum(ret, new ArrayList<Integer>(), root, sum);
        return ret;
    }

    private void calculdatePathSum(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> path,
                                   TreeNode node, int remainingSum) {
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
        path.remove(path.size() - 1);


        path.add(node.val);
        calculdatePathSum(ret, path, node.right, remainingSum);
        path.remove(path.size() - 1);

    }
}
