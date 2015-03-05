package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordBreak2DArrayImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordBreakDpImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordBreakImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordBreakTest {
    private WordBreak solution3 = new WordBreak2DArrayImpl();
    private WordBreak solution2 = new WordBreakImpl();
    private WordBreak solution = new WordBreakDpImpl();

    @Test
    public void small01() {
        assertFalse(solution.wordBreak("aaaaaaa", Sets.newHashSet("aaaa", "aa")));
    }

    @Test
    public void small02() {
        assertTrue(solution.wordBreak("bb", Sets.newHashSet("b")));
    }
}
