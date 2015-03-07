package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;
import java.util.Set;

/**
 * http://oj.leetcode.com/problems/word-break-ii/
 * <p>
 * Given a string s and a dictionary of words dict, add spaces in s to
 * construct a sentence where each word is a valid dictionary word.
 * <p>
 * Return all such possible sentences.
 * <pre>
 * For example, given
 * s = "catsanddog",
 * dict = ["cat", "cats", "and", "sand", "dog"].
 *
 * A solution is ["cats and dog", "cat sand dog"].
 * </pre>
 */
public interface WordBreakII {
    List<String> wordBreak(String s, Set<String> dict);
}
