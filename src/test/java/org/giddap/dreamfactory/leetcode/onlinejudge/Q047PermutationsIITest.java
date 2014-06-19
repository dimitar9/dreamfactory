package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q047PermutationsIIDfsImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Q047PermutationsIITest {
    private Q047PermutationsII solution = new Q047PermutationsIIDfsImpl();

    @Test
    public void small01() {
        int[] input = {1};
        Set<ArrayList<Integer>> actual = Sets.newHashSet(solution.permuteUnique(input));

        ArrayList<Integer> one = Lists.newArrayList(1);
        Set<ArrayList<Integer>> expected = Sets.newHashSet();
        expected.add(one);

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, actual);
    }

    @Test
    public void small02() {
        int[] input = {1, 1};
        Set<ArrayList<Integer>> actual = Sets.newHashSet(solution.permuteUnique(input));

        ArrayList<Integer> one = Lists.newArrayList(1, 1);
        Set<ArrayList<Integer>> expected = Sets.newHashSet();
        expected.add(one);

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, actual);
    }

    @Test
    public void small03() {
        int[] input = {1, 2};
        Set<ArrayList<Integer>> actual = Sets.newHashSet(solution.permuteUnique(input));
        Set<ArrayList<Integer>> expected = Sets.newHashSet(Lists.newArrayList(1, 2), Lists.newArrayList(2, 1));

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, actual);
    }

    @Test
    public void small04() {
        int[] input = {2, 1, 1};
        Set<ArrayList<Integer>> actual = Sets.newHashSet(solution.permuteUnique(input));
        Set<ArrayList<Integer>> expected = Sets.newHashSet(
                Lists.newArrayList(1, 1, 2), Lists.newArrayList(1, 2, 1), Lists.newArrayList(2, 1, 1));

        assertTrue(actual.size() == expected.size());
        assertEquals(expected, actual);
    }

    @Test
    public void small05() {
        int[] input = {2, 1, 2, 3, 1};

        ArrayList<ArrayList<Integer>> actual1 = solution.permuteUnique(input);
        ArrayList<ArrayList<Integer>> actual2 = new Q047PermutationsIIDfsImpl().permuteUnique(input);

        Set<ArrayList<Integer>> repeated = new HashSet<ArrayList<Integer>>();
        List<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
        for (ArrayList<Integer> one : actual1) {
            if (repeated.contains(one)) {
                tmp.add(one);
            } else {
                repeated.add(one);
            }
        }

        assertTrue(actual1.size() == actual2.size());
        assertEquals(Sets.newHashSet(actual1), Sets.newHashSet(actual2));

    }

    @Test
    public void small06() {
        int[] input = {1, 2, 1, 2};

        Set<ArrayList<Integer>> actual = Sets.newHashSet(solution.permuteUnique(input));
        Set<ArrayList<Integer>> expected = Sets.newHashSet(
                Lists.newArrayList(1, 1, 2, 2), Lists.newArrayList(1, 2, 1, 2),
                Lists.newArrayList(1, 2, 2, 1), Lists.newArrayList(2, 1, 1, 2),
                Lists.newArrayList(2, 1, 2, 1), Lists.newArrayList(2, 2, 1, 1));

        assertTrue(actual.size() == expected.size());
        assertEquals(Sets.newHashSet(expected), Sets.newHashSet(actual));
    }
}
