package org.giddap.dreamfactory.mitbbs.amazon;

import java.util.HashSet;
import java.util.Set;

/**
 * <href a="http://www.mitbbs.com/article_t1/JobHunting/32633319_0_1
 * .html">Repeated String</href>
 * <p/>
 * 弼馬溫注解：
 * <p/>
 * Source: PS
 * <p/>
 * 有一种String,是把一个更短的String重复n次而构成的，那个更短的String长度至少为2，输入
 * 一个String写代码返回T或者F例子：
 * <ul>
 * <li>"abcabcabc": Ture; 因为它把abc重复3次构成</li>
 * <li>"bcdbcdbcde": False; 最后一个是bcde</li>
 * <li>"abcdabcd": True; 因为它是abcd重复2次构成</li>
 * <li>"xyz": False; 因为它不是某一个String重复</li>
 * <li>"aaaaaaaaaa": False; 重复的短String长度应至少为2（这里不能看做aa重复5次)</li>
 * </ul>
 * <p/>
 * 要求算法复杂度为O(n)
 */
public class RepeatedString {
    public boolean isMultiple(String s) {
        final int len = s.length();
        if (len <= 3) {
            return false;
        }

        Set<Character> chars = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        if (chars.size() == 1) {
            return false;
        }

        int leftMid = -1;
        int rightMid = -1;

        if (len % 2 == 0) {
            leftMid = len / 2 - 1;
            rightMid = len / 2;
        } else {
            // odd string being repeated odd times
            leftMid = len / 2 - 1;
            rightMid = len / 2 + 1;
        }

        while (leftMid >= 0 && rightMid < len) {
            if (s.substring(0, leftMid + 1).equals(s.substring(rightMid))) {
                break;
            }
            leftMid--;
            rightMid++;
        }

        if (leftMid < 0 || rightMid >= len) {
            return false;
        }

        String source = s.substring(leftMid + 1, rightMid);
        if (source.length() == 0) {
            return true;
        }

        for (int i = 0; i < len; i += source.length()) {
            if (!s.substring(i, i + source.length()).equals(source)) {
                return false;
            }
        }

        return true;
    }
}
