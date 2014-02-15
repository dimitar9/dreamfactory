package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.ListNode;

/**
 * <a href="http://oj.leetcode.com/problems/swap-nodes-in-pairs/">Swap Nodes In Pairs</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p/>
 * <pre>
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * </pre>
 * <p/>
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself
 * can be changed.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/205/swap-nodes-in-pairs">Leetcode discussion</a>
 */
public interface Q024SwapNodesInPairs {
    ListNode swapPairs(ListNode head);
}
