package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

/**
 * https://oj.leetcode.com/problems/reverse-nodes-in-k-group/
 * <p/>
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * <p/>
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * <p/>
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * <p/>
 * Only constant memory is allowed.
 * <pre>
 * For example,
 * Given this linked list: 1->2->3->4->5
 *
 * For k = 2, you should return: 2->1->4->3->5
 *
 * For k = 3, you should return: 3->2->1->4->5
 * </pre>
 * Good article:
 * http://crackinterviewtoday.wordpress.com/2010/03/28/k-reverse-linked-list/
 * http://mattcb.blogspot.com/2012/11/reverse-nodes-in-k-group.html
 */
public interface ReverseNodesInKGroup {
    ListNode reverseKGroup(ListNode head, int k);
}
