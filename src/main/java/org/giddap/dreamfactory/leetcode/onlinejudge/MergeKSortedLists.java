package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/merge-k-sorted-lists/">Merge k Sorted Lists</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * <p/>
 * Definition for singly-linked list.
 * <pre>
 *  public class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) {
 *          val = x;
 *          next = null;
 *      }
 *  }
 * </pre>
 * <p/>
 *
 * @see <a href="http://gongxuns.blogspot.com/2012/12/leetcode-merge-k-sorted-lists.html">Leetcode discussion</a>
 */
public interface MergeKSortedLists {
    ListNode mergeKLists(ArrayList<ListNode> lists);
}
