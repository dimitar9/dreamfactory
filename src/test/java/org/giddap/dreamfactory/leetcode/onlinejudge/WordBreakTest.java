package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordBreak2DArrayImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordBreakImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 *
 */
public class WordBreakTest {
    private WordBreak solution = new WordBreak2DArrayImpl();
    private WordBreak solution2 = new WordBreakImpl();

    @Test
    public void small01() {
        assertFalse(solution.wordBreak("aaaaaaa", Sets.newHashSet("aaaa", "aa")));
    }
}
