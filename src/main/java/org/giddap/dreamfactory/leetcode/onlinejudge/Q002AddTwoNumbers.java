package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.ListNode;

/**
 * <a href="http://oj.leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a
 * single digit.
 * Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/189/add-two-numbers">Leetcode discussion</a>
 */
public interface Q002AddTwoNumbers {
    ListNode addTwoNumbers(ListNode l1, ListNode l2);
}
