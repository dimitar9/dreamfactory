package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PermutationsSwapImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PermutationsTest {
    private Permutations solution = new PermutationsSwapImpl();
//    private PermutationsDfsImpl solution = new PermutationsDfsImpl();

    @Test
    public void small01() {
        int[] input = {1};

        List<List<Integer>> actual = solution.permute(input);
        List<List<Integer>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected.size(), actual.size());
        assertEquals(Sets.newHashSet(expected), Sets.newHashSet(actual));
    }

    @Test
    public void small02() {
        int[] input = {1, 2, 3};

        List<List<Integer>> actual = solution.permute(input);

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
