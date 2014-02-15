package org.giddap.dreamfactory.commons;

/**
 * Common data structure to represent a node in a tree.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}
