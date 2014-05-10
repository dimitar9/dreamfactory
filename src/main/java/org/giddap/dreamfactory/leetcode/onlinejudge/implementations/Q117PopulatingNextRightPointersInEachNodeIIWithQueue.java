package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeLinkNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * http://leetcode.com/onlinejudge#question_117
 * <p/>
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * <p/>
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * <p/>
 * Note:
 * <p/>
 * You may only use constant extra space.
 * For example,
 * Given the following binary tree,
 * <p/>
 * 1
 * /  \
 * 2    3
 * / \    \
 * 4   5    7
 * After calling your function, the tree should look like:
 * <p/>
 * 1 -> NULL
 * /  \
 * 2 -> 3 -> NULL
 * / \    \
 * 4-> 5 -> 7 -> NULL
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/282/populating-next-right-pointers-in-each-node-ii
 * http://gongxuns.blogspot.com/2012/12/leetcodepopulating-next-right-pointers_12.html
 * http://fisherlei.blogspot.com/2012/12/leetcode-populating-next-right-pointers_29.html
 */
public class Q117PopulatingNextRightPointersInEachNodeIIWithQueue {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) {
            return;
        }

        Queue<TreeLinkNode> nodes = new LinkedList<TreeLinkNode>();
        nodes.offer(root);
        int levelCounter = 1;

        while (!nodes.isEmpty()) {
            while (levelCounter > 0) {
                TreeLinkNode curr = nodes.poll();
                levelCounter--;

                TreeLinkNode peer = nodes.peek();
                if (levelCounter > 0 && peer != null) {
                    curr.next = peer;
                }

                if (curr.left != null) {
                    nodes.offer(curr.left);
                }

                if (curr.right != null) {
                    nodes.offer(curr.right);
                }
            }
            levelCounter = nodes.size();
        }

    }
}
