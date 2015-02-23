package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PalindromePartitioningDfsDpImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PalindromePartitioningDfsImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PalindromePartitioningTest {
    private PalindromePartitioning solution1 =
            new PalindromePartitioningDfsImpl();
    private PalindromePartitioning solution =
            new PalindromePartitioningDfsDpImpl();

    @Test
    public void small01() {
        List<String> partitionListOne = Lists.newArrayList("a", "a", "b");
        List<String> partitionListTwo = Lists.newArrayList("aa", "b");
        List<List<String>> expected =
                Lists.newArrayList(partitionListOne, partitionListTwo);

        List<List<String>> actual = solution.partition("aab");

        assertEquals(expected, actual);
    }

    @Test
    public void small02() {
        List<String> partitionListOne = Lists.newArrayList("e", "f", "e");
        List<String> partitionListTwo = Lists.newArrayList("efe");
        List<List<String>> expected =
                Lists.newArrayList(partitionListOne, partitionListTwo);

        List<List<String>> actual = solution.partition("efe");

        assertEquals(expected, actual);
    }
}
