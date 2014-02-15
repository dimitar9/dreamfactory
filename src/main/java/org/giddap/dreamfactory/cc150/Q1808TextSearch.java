package org.giddap.dreamfactory.cc150;

import org.giddap.dreamfactory.fundamentals.datastructure.Trie;

import java.util.HashSet;
import java.util.Set;

/**
 * http://hawstein.com/posts/20.8.html
 * http://stevedaskam.wordpress.com/2009/05/28/trie-structures/
 * https://code.google.com/p/radixtree/source/browse/trunk/RadixTree/src/ds/tree/RadixTreeImpl.java
 * http://marknelson.us/1996/08/01/suffix-trees/
 * http://www.geeksforgeeks.org/longest-prefix-matching-a-trie-based-solution-in-java/
 * http://whiteboxcomputing.com/java/prefix_tree/
 */
public class Q1808TextSearch {
    public Set<String> searchTexts(final String article, final Set<String> words) {
        Trie suffixes = new Trie();

        // build the suffix trie
        for (int i = article.length() - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                suffixes.insert(article.substring(j));
            }
        }

        Set<String> matching = new HashSet<String>();
        for (String word : words) {
            String matchedPrefix = suffixes.searchLongestMatchingPrefix(word);
            if (word.equals(matchedPrefix)) {
                matching.add(word);
            }
        }

        return matching;
    }
}
