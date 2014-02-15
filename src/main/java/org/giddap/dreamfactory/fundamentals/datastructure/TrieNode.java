package org.giddap.dreamfactory.fundamentals.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class TrieNode {
    private final Character key;
    private boolean leafNode;
    private Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();

    public TrieNode(final Character key) {
        this.key = key;
    }

    public Character getKey() {
        return key;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public boolean isLeafNode() {
        return leafNode;
    }

    public void setLeafNode(boolean leafNode) {
        this.leafNode = leafNode;
    }
}
