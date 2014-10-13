package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PermutationsIIDfsImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PermutationsIISwapImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PermutationsIITest {
    private PermutationsII solution2 = new PermutationsIIDfsImpl();
    private PermutationsII solution = new PermutationsIISwapImpl();

    @Test
    public void small01() {
        int[] input = {1};
        List<List<Integer>> actual = solution.permuteUnique(input);

        ArrayList<Integer> one = Lists.newArrayList(1);
        Set<ArrayList<Integer>> expected = Sets.newHashSet();
        expected.add(one);

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, Sets.newHashSet(actual));
    }

    @Test
    public void small02() {
        int[] input = {1, 1};

        List<List<Integer>> actual = solution.permuteUnique(input);

        ArrayList<Integer> one = Lists.newArrayList(1, 1);
        Set<ArrayList<Integer>> expected = Sets.newHashSet();
        expected.add(one);

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, Sets.newHashSet(actual));
    }

    @Test
    public void small03() {
        int[] input = {1, 2};

        List<List<Integer>> actual = solution.permuteUnique(input);

        Set<ArrayList<Integer>> expected = Sets.newHashSet(Lists.newArrayList(1, 2), Lists.newArrayList(2, 1));

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, Sets.newHashSet(actual));
    }

    @Test
    public void small04() {
        int[] input = {2, 1, 1};

        List<List<Integer>> actual = solution.permuteUnique(input);

        Set<ArrayList<Integer>> expected = Sets.newHashSet(
                Lists.newArrayList(1, 1, 2), Lists.newArrayList(1, 2, 1), Lists.newArrayList(2, 1, 1));

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, Sets.newHashSet(actual));
    }

    @Test
    public void small05() {
        int[] input = {0, 0, 0};

        List<List<Integer>> actual = solution.permuteUnique(input);

        Set<ArrayList<Integer>> expected = Sets.newHashSet(
            Lists.newArrayList(0, 0, 0),
            Lists.newArrayList(0, 0, 0)
        );

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, Sets.newHashSet(actual));
    }

    @Test
    public void small06() {
        int[] input = {1, 2, 1, 2};

        List<List<Integer>> actual = solution.permuteUnique(input);

        Set<ArrayList<Integer>> expected = Sets.newHashSet(
                Lists.newArrayList(1, 1, 2, 2), Lists.newArrayList(1, 2, 1, 2),
                Lists.newArrayList(1, 2, 2, 1), Lists.newArrayList(2, 1, 1, 2),
                Lists.newArrayList(2, 1, 2, 1), Lists.newArrayList(2, 2, 1, 1));

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, Sets.newHashSet(actual));
    }

    @Test
    public void small07() {
        int[] input = {0, 1, 0, 0, 9};

        List<List<Integer>> actual = solution.permuteUnique(input);

        Set<ArrayList<Integer>> expected = Sets.newHashSet(
                Lists.newArrayList(0, 0, 0, 1, 9),
                Lists.newArrayList(0, 0, 0, 9, 1),
                Lists.newArrayList(0, 0, 1, 0, 9),
                Lists.newArrayList(0, 0, 1, 9, 0),
                Lists.newArrayList(0, 0, 9, 0, 1),
                Lists.newArrayList(0, 0, 9, 1, 0),
                Lists.newArrayList(0, 1, 0, 0, 9),
                Lists.newArrayList(0, 1, 0, 9, 0),
                Lists.newArrayList(0, 1, 9, 0, 0),
                Lists.newArrayList(0, 9, 0, 0, 1),
                Lists.newArrayList(0, 9, 0, 1, 0),
                Lists.newArrayList(0, 9, 1, 0, 0),
                Lists.newArrayList(1, 0, 0, 0, 9),
                Lists.newArrayList(1, 0, 0, 9, 0),
                Lists.newArrayList(1, 0, 9, 0, 0),
                Lists.newArrayList(1, 9, 0, 0, 0),
                Lists.newArrayList(9, 0, 0, 0, 1),
                Lists.newArrayList(9, 0, 0, 1, 0),
                Lists.newArrayList(9, 0, 1, 0, 0),
                Lists.newArrayList(9, 1, 0, 0, 0)
        );

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, Sets.newHashSet(actual));
    }

    @Test
    public void small08() {
        int[] input = {0, 0, 0, 1};

        List<List<Integer>> actual = solution.permuteUnique(input);

        Set<ArrayList<Integer>> expected = Sets.newHashSet(
                Lists.newArrayList(0, 0, 0, 1),
                Lists.newArrayList(0, 0, 1, 0),
                Lists.newArrayList(0, 1, 0, 0),
                Lists.newArrayList(1, 0, 0, 0)
        );

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, Sets.newHashSet(actual));
    }
}