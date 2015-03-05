package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.RandomListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Very similar to 'clone graph'.
 */
public class CopyListWithRandomPointerBfsImpl implements CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        Map<RandomListNode, RandomListNode> clones = new HashMap<>();
        Queue<RandomListNode> frontier = new LinkedList<>();
        RandomListNode cHead = new RandomListNode(head.label);
        clones.put(head, cHead);
        frontier.offer(head);
        while(!frontier.isEmpty()) {
            RandomListNode node = frontier.poll();
            RandomListNode cNode = clones.get(node);

            if (node.next != null) {
                if (clones.containsKey(node.next)) {
                    cNode.next = clones.get(node.next);
                } else {
                    RandomListNode cNext = new RandomListNode(node.next.label);
                    clones.put(node.next, cNext);
                    frontier.offer(node.next);
                    cNode.next = cNext;
                }
            }

            if (node.random != null) {
                if (clones.containsKey(node.random)) {
                    cNode.random = clones.get(node.random);
                } else {
                    RandomListNode cRandom = new RandomListNode(node.random.label);
                    clones.put(node.random, cRandom);
                    frontier.offer(node.random);
                    cNode.random = cRandom;
                }

            }
        }
        return cHead;
    }
}
