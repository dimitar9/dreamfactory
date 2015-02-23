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

        Queue<UndirectedGraphNode> frontier = new LinkedList<UndirectedGraphNode>();
        frontier.offer(node);
        Map<UndirectedGraphNode, UndirectedGraphNode> visited =
                new HashMap<>();
        UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
        visited.put(node, cloneNode);

        while (!frontier.isEmpty()) {
            UndirectedGraphNode curr = frontier.poll();
            cloneNode = visited.get(curr);

            for (UndirectedGraphNode neighbor : curr.neighbors) {
                UndirectedGraphNode cloneNeighbor;
                if (visited.containsKey(neighbor)) {
                    cloneNeighbor = visited.get(neighbor);
                } else {
                    cloneNeighbor = new UndirectedGraphNode(neighbor.label);
                    visited.put(neighbor, cloneNeighbor);
                    frontier.offer(neighbor);
                }
                cloneNode.neighbors.add(cloneNeighbor);
            }
        }
        return visited.get(node);
    }
}
