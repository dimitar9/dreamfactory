package org.giddap.dreamfactory.leetcode.onlinejudge;


import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordBreakIIDfsImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordBreakIIDpImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class WordBreakIITest {
    private WordBreakII solution2 = new WordBreakIIDfsImpl();
    private WordBreakII solution = new WordBreakIIDpImpl();

    @Test
    public void small01() {
        List<String> actual = solution.wordBreak("abc", Sets.newHashSet("a", "bc"));
        List<String> expected = Lists.newArrayList("a bc");
        assertEquals(expected, actual);
    }

    @Test
    public void small02() {
        List<String> actual = solution.wordBreak("a", Sets.newHashSet("a"));
        List<String> expected = Lists.newArrayList("a");
        assertEquals(expected, actual);
    }

    @Test
    public void large01() {
        List<String> actual = solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", Sets.newHashSet("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"));
    }
}
