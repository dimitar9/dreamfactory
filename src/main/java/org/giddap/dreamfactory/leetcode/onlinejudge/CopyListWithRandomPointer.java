package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.RandomListNode;

/**
 * https://oj.leetcode.com/problems/copy-list-with-random-pointer/
 * <p/>
 * A linked list is given such that each node contains an additional
 * random pointer which could point to any node in the list or null.
 * <p/>
 * Return a deep copy of the list.
 */
public interface CopyListWithRandomPointer {
    RandomListNode copyRandomList(RandomListNode head);
}
