package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * <a href="http://oj.leetcode.com/problems/decode-ways/">Decode Ways</a>
 * <p/>
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * <p/>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * <p/>
 * <pre>
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 *
 * The number of ways decoding "12" is 2.
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/266/decode-ways">leetcode discussion</a>
 * @see <a href="http://blog.sina.com.cn/s/blog_b9285de20101h8l1.html">peking2's blog</a>
 * @see <a href="http://www.mitbbs.com/article_t/JobHunting/32302219.html">mitbbs post</a>
 */
public interface DecodeWays {
    int numDecodings(String s);
}
