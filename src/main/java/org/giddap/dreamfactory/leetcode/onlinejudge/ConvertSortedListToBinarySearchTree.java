package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;
import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * http://leetcode.com/onlinejudge#question_109
 * <p/>
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p/>
 * Links:
 * http://leetcode.com/2010/11/convert-sorted-list-to-balanced-binary.html
 * http://discuss.leetcode.com/questions/112/convert-sorted-list-to-binary-search-tree
 */
public interface ConvertSortedListToBinarySearchTree {
    TreeNode sortedListToBST(ListNode head);
}
