package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q030SubstringWithConcatenationOfAllWordsImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class Q030SubstringWithConcatenationOfAllWordsTest {
    Q030SubstringWithConcatenationOfAllWords solution = new Q030SubstringWithConcatenationOfAllWordsImpl();

    @Test
    public void small01() {
        final String text = "barfoothefoobarman";
        final String[] words = {"foo", "bar"};

        List<Integer> expectedIndexes = Lists.newArrayList(0, 9);

        List<Integer> actualIndexes = solution.findSubstring(text, words);

        assertEquals(expectedIndexes, actualIndexes);
    }

    @Test
    public void small02() {
        final String text = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        final String[] words = {"fooo", "barr", "wing", "ding", "wing"};

        List<Integer> expectedIndexes = Lists.newArrayList(13);

        List<Integer> actualIndexes = solution.findSubstring(text, words);

        assertEquals(expectedIndexes.size(), actualIndexes.size());
        assertEquals(Sets.newHashSet(expectedIndexes), Sets.newHashSet(actualIndexes));
    }
}
