package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PalindromePartitioningDfsImpl;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PalindromePartitioningTest {
    //    private Q131PalindromePartitioning solution = new Q131PalindromePartitioningRecursiveDP();
    private PalindromePartitioning solution = new PalindromePartitioningDfsImpl();

    @Test
    public void small01() {
        ArrayList<String> partitionListOne = Lists.newArrayList("a", "a", "b");
        ArrayList<String> partitionListTwo = Lists.newArrayList("aa", "b");
        ArrayList<ArrayList<String>> expected = Lists.newArrayList(partitionListOne, partitionListTwo);

        ArrayList<ArrayList<String>> actual = solution.partition("aab");

        assertEquals(expected, actual);
    }

    @Test
    public void small02() {
        ArrayList<String> partitionListOne = Lists.newArrayList("e", "f", "e");
        ArrayList<String> partitionListTwo = Lists.newArrayList("efe");
        ArrayList<ArrayList<String>> expected = Lists.newArrayList(partitionListOne, partitionListTwo);

        ArrayList<ArrayList<String>> actual = solution.partition("efe");

        assertEquals(expected, actual);
    }
}
