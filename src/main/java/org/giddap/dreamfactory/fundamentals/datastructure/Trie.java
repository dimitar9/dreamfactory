package org.giddap.dreamfactory.fundamentals.datastructure;

/**
 * http://www.geeksforgeeks.org/longest-prefix-matching-a-trie-based-solution-in-java/
 */
public class Trie {

    private final TrieNode root;

    public Trie() {
        root = new TrieNode(Character.MIN_VALUE);
    }

    public void insert(final String word) {
        TrieNode curr = root;
        for (Character ch : word.toCharArray()) {
            if (curr.getChildren().isEmpty() || !curr.getChildren().containsKey(ch)) {
                TrieNode node = new TrieNode(ch);
                curr.getChildren().put(ch, node);
                curr = node;
            } else {
                if (curr.isLeafNode()) {
                    curr.setLeafNode(false);
                }
                curr = curr.getChildren().get(ch);
            }
        }
        curr.setLeafNode(true);
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String searchLongestMatchingPrefix(final String word) {
        StringBuilder sb = new StringBuilder();
        TrieNode curr = root;
        int i = 0;
        for (; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.getChildren().isEmpty() || !curr.getChildren().containsKey(ch)) {
                break;
            } else {
                curr = curr.getChildren().get(ch);
                sb.append(curr.getKey());
            }
        }
        return word.substring(0, i);
    }
}
