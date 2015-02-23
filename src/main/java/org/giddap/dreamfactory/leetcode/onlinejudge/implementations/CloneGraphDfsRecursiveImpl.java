package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.UndirectedGraphNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.CloneGraph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraphDfsRecursiveImpl implements CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return doClone(node, new HashMap<>());
    }

    private UndirectedGraphNode doClone(
            final UndirectedGraphNode node,
            final Map<UndirectedGraphNode, UndirectedGraphNode> visited) {
        if (node == null) {
            return null;
        }

        UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
        visited.put(node, cloneNode);

        for (UndirectedGraphNode neighbor : node.neighbors) {
            UndirectedGraphNode cloneNeighbor = null;
            if (visited.containsKey(neighbor)) {
                cloneNeighbor = visited.get(neighbor);
            } else {
                cloneNeighbor = doClone(neighbor, visited);
            }
            cloneNode.neighbors.add(cloneNeighbor);
        }
        return cloneNode;
    }
}
