package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.RandomListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class CopyListWithRandomPointerRecursiveImpl implements CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        return deepcopy(head, new HashMap<RandomListNode, RandomListNode>());
    }

    private RandomListNode deepcopy(RandomListNode node, Map<RandomListNode, RandomListNode> visited) {
        if (node == null) {
            return null;
        }
        RandomListNode newnode = new RandomListNode(node.label);
        visited.put(node, newnode);

        RandomListNode n = node.next;
        if (n != null) {
            if (visited.containsKey(n)) {
                newnode.next = visited.get(n);
            } else {
                newnode.next = deepcopy(n, visited);
            }
        }

        RandomListNode r = node.random;
        if (r != null) {
            if (visited.containsKey(r)) {
                newnode.random = visited.get(r);
            } else {
                newnode.random = deepcopy(r, visited);
            }
        }

        return newnode;
    }
}
