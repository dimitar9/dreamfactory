package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q068TextJustificationImpl;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Q068TextJustificationTest {
    private Q068TextJustification solution = new Q068TextJustificationImpl();

    @Test
    public void small01() {
        String[] input = new String[]{"a", "b", "c", "d", "e"};
        int lineWidth = 1;

        ArrayList<String> expected = Lists.newArrayList("a", "b", "c", "d", "e");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small02() {
        String[] input = new String[]{};
        int lineWidth = 2;

        ArrayList<String> expected = Lists.newArrayList("  ");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small03() {
        String[] input = new String[]{"a", "b", "c", "d", "e"};
        int lineWidth = 3;

        ArrayList<String> expected = Lists.newArrayList("a b", "c d", "e  ");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small04() {
        String[] input = new String[]{"Listen", "to", "many,", "speak", "to", "a", "few."};
        int lineWidth = 6;

        ArrayList<String> expected = Lists.newArrayList("Listen", "to    ", "many, ", "speak ", "to   a", "few.  ");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small05() {
        String[] input = new String[]{"Here", "is", "an", "example", "of", "text", "justification."};
        int lineWidth = 16;

        ArrayList<String> expected = Lists.newArrayList("Here    is    an", "example  of text", "justification.  ");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small06() {
        String[] input = new String[]{"Here", "is", "an", "example", "of", "text", "justification."};
        int lineWidth = 14;

        ArrayList<String> expected = Lists.newArrayList("Here   is   an", "example     of", "text          ", "justification.");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }
}
