package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.UndirectedGraphNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q133CloneGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 */
public class Q133CloneGraphBfsImpl implements Q133CloneGraph {
    @Override
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if (node == null) {
            return null;
        }

        Queue<UndirectedGraphNode> frontier = new LinkedList<UndirectedGraphNode>();
        frontier.offer(node);
        Map<Integer, UndirectedGraphNode> cloned = new HashMap<Integer, UndirectedGraphNode>();
        UndirectedGraphNode tmp = new UndirectedGraphNode(node.label);
        cloned.put(tmp.label, tmp);

        while (!frontier.isEmpty()) {
            UndirectedGraphNode curr = frontier.poll();
            tmp = cloned.get(curr.label);

            for (UndirectedGraphNode neighbor : curr.neighbors) {
                if (!cloned.containsKey(neighbor.label)) {
                    frontier.offer(neighbor);
                    UndirectedGraphNode clonedNeighbor = new UndirectedGraphNode(neighbor.label);
                    cloned.put(neighbor.label, clonedNeighbor);
                }
                tmp.neighbors.add(cloned.get(neighbor.label));
            }
        }
        return cloned.get(node.label);
    }
}
