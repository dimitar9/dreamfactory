package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://oj.leetcode.com/problems/reverse-words-in-a-string/
 * <p/>
 * Given an input string, reverse the string word by word.
 * <p/>
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * <p/>
 * click to show clarification.
 * <p/>
 * Clarification:
 * What constitutes a word?
 * A sequence of non-space characters constitutes a word.
 * Could the input string contain leading or trailing spaces?
 * Yes. However, your reversed string should not contain leading or trailing spaces.
 * How about multiple spaces between two words?
 * Reduce them to a single space in the reversed string.
 */
public interface ReverseWordsInAString {
    String reverseWords(String s);
}
