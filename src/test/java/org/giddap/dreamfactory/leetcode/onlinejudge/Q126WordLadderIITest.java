package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class Q126WordLadderIITest {
    private Q126WordLadderII solution = new Q126WordLadderII();

    @Test
    public void small01() {
        HashSet<String> dict = new HashSet<String>();
        dict.add("a");
        dict.add("b");
        dict.add("c");

        ArrayList<ArrayList<String>> expected = new ArrayList<ArrayList<String>>();
        expected.add(Lists.newArrayList("a", "c"));

        assertEquals(expected, solution.findLadders("a", "c", dict));
    }

    @Test
    public void small02() {
        HashSet<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dog");
        dict.add("dot");

        ArrayList<ArrayList<String>> expected = new ArrayList<ArrayList<String>>();
        expected.add(Lists.newArrayList("hot", "dot", "dog"));

        assertEquals(expected, solution.findLadders("hot", "dog", dict));
    }

    @Test
    public void small03() {
        HashSet<String> dict = Sets.newHashSet("ted", "tex", "red", "tax", "tad", "den", "rex", "pee");

        ArrayList<ArrayList<String>> expected = new ArrayList<ArrayList<String>>();
        expected.add(Lists.newArrayList("red", "ted", "tad", "tax"));
        expected.add(Lists.newArrayList("red", "ted", "tex", "tax"));
        expected.add(Lists.newArrayList("red", "rex", "tex", "tax"));

        assertEquals(expected, solution.findLadders("red", "tax", dict));
    }
}
