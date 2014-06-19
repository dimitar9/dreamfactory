package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q046PermutationsSwapImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Q046PermutationsTest {
    private Q046PermutationsSwapImpl solution = new Q046PermutationsSwapImpl();
//    private Q046PermutationsDfsImpl solution = new Q046PermutationsDfsImpl();

    @Test
    public void small01() {
        int[] input = {1};

        ArrayList<ArrayList<Integer>> actual = solution.permute(input);
        List<ArrayList<Integer>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected.size(), actual.size());
        assertEquals(Sets.newHashSet(expected), Sets.newHashSet(actual));
    }

    @Test
    public void small02() {
        int[] input = {1, 2, 3};

        ArrayList<ArrayList<Integer>> actual = solution.permute(input);

        List<ArrayList<Integer>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList(2, 3, 1));
        expected.add(Lists.newArrayList(3, 2, 1));
        expected.add(Lists.newArrayList(3, 1, 2));
        expected.add(Lists.newArrayList(1, 3, 2));
        expected.add(Lists.newArrayList(2, 1, 3));
        expected.add(Lists.newArrayList(1, 2, 3));

        assertEquals(expected.size(), actual.size());
        assertEquals(Sets.newHashSet(expected), Sets.newHashSet(actual));
    }
}
