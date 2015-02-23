package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.UndirectedGraphNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.CloneGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * BFS approach to clone the graph
 */
public class CloneGraphBfsIterativeImpl implements CloneGraph {
    @Override
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        UndirectedGraphNode clonedRoot = new UndirectedGraphNode(node.label);

        Map<UndirectedGraphNode, UndirectedGraphNode> clonedNodes =
                new HashMap<>();
        clonedNodes.put(node, clonedRoot);

        Queue<UndirectedGraphNode> explore = new LinkedList<>();
        explore.offer(node);

        while(!explore.isEmpty()) {
            UndirectedGraphNode curr = explore.poll();
            UndirectedGraphNode cloned = clonedNodes.get(curr);

            for (UndirectedGraphNode one : curr.neighbors) {
                UndirectedGraphNode clonedOne = null;
                if (clonedNodes.containsKey(one)) {
                    clonedOne = clonedNodes.get(one);
                } else {
                    clonedOne = new UndirectedGraphNode(one.label);
                    clonedNodes.put(one, clonedOne);
                    explore.offer(one);
                }
                cloned.neighbors.add(clonedOne);
            }
        }
        return clonedNodes.get(node);
    }
}
