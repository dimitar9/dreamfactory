package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.UndirectedGraphNode;

/**
 * <a href="http://oj.leetcode.com/problems/clone-graph/">Clone Graph</a>
 * <p/>
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 * <p/>
 * OJ's undirected graph serialization:
 * Nodes are labeled uniquely.
 * <p/>
 * We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * <p/>
 * The graph has a total of three nodes, and therefore contains three parts as separated by #.
 * <p/>
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 * Visually, the graph looks like the following:
 * <p/>
 * <pre>
 *        1
 *       / \
 *      /   \
 *     0 --- 2
 *          / \
 *          \_/
 * </pre>
 */
public interface CloneGraph {
    UndirectedGraphNode cloneGraph(UndirectedGraphNode node);
}
