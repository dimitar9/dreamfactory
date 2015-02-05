package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/gray-code/">Gray Code</a>
 * <p/>
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * <p/>
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code.
 * A gray code sequence must begin with 0.
 * <p/>
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * <p/>
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * <p/>
 * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
 * <p/>
 * For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/264/gray-code">Leetcode discussion</a>
 * @see <a href="http://en.wikipedia.org/wiki/Gray_code">Gray Code at Wikipedia</a>
 * @see <a href="http://aggregate.org/MAGIC/#Gray%20Code%20Conversion">Faster Gray Code Calculation</a>
 */
public interface GrayCode {
    List<Integer> grayCode(int n);
}
