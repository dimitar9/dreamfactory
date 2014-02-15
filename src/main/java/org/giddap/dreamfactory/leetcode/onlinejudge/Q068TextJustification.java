package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * <a href="http://leetcode.com/onlinejudge#question_68">Text Justification</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * <p/>
 * Given an array of words and a length L, format the text such that each
 * line has exactly L characters and is fully (left and right) justified.
 * <p/>
 * You should pack your words in a greedy approach; that is, pack as many
 * words as you can in each line. Pad extra spaces ' ' when necessary so
 * that each line has exactly L characters.
 * <p/>
 * Extra spaces between words should be distributed as evenly as possible.
 * If the number of spaces on a line do not divide evenly between words,
 * the empty slots on the left will be assigned more spaces than the slots
 * on the right.
 * <p/>
 * For the last line of text, it should be left justified and no extra space
 * is inserted between words.
 * <p/>
 * For example,
 * words: ["This", "is", "an", "example", "of", "text", "justification."]
 * L: 16.
 * <p/>
 * Return the formatted lines as:
 * <p/>
 * [
 * "This    is    an",
 * "example  of text",
 * "justification.  "
 * ]
 * Note: Each word is guaranteed not to exceed L in length.
 * <p/>
 * Corner Cases:
 * A line other than the last line might contain only one word. What should
 * you do in this case?
 * In this case, that line should be left-justified.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/244/text-justification">Leetcode discussion</a>
 */
public interface Q068TextJustification {
    ArrayList<String> fullJustify(String[] words, int L);
}
