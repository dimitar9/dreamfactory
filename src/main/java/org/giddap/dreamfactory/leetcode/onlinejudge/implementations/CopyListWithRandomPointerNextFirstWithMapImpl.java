package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.RandomListNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

/**
 * Algorithm:
 * 1. Clone nodes connected by 'next' while at the same time map the cloned ones to the original ones.
 * 2. Build the 'random' links based on the mapping.
 */
public class CopyListWithRandomPointerNextFirstWithMapImpl implements CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null) return null;
        Map<RandomListNode, RandomListNode> hm = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode p = head;
        while (p != null) {
            RandomListNode n = new RandomListNode(p.label);
            hm.put(p, n);
            p = p.next;
        }
        p = head;
        while (p != null) {
            RandomListNode n = hm.get(p);
            n.next = null;
            n.random = null;
            if (p.next != null)
                n.next = hm.get(p.next);
            if (p.random != null)
                n.random = hm.get(p.random);
            p = p.next;
        }
        return hm.get(head);
    }
}
