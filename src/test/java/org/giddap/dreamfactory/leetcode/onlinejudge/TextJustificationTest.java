package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.TextJustificationImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TextJustificationTest {
    private TextJustification solution = new TextJustificationImpl();

    @Test
    public void small01() {
        String[] input = new String[]{"a", "b", "c", "d", "e"};
        int lineWidth = 1;

        List<String> expected = Lists.newArrayList("a", "b", "c", "d", "e");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small02() {
        String[] input = new String[]{};
        int lineWidth = 2;

        List<String> expected = Lists.newArrayList("  ");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small03() {
        String[] input = new String[]{"a", "b", "c", "d", "e"};
        int lineWidth = 3;

        List<String> expected = Lists.newArrayList("a b", "c d", "e  ");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small04() {
        String[] input = new String[]{"Listen", "to", "many,", "speak", "to", "a", "few."};
        int lineWidth = 6;

        List<String> expected = Lists.newArrayList("Listen", "to    ", "many, ", "speak ", "to   a", "few.  ");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small05() {
        String[] input = new String[]{"Here", "is", "an", "example", "of", "text", "justification."};
        int lineWidth = 16;

        List<String> expected = Lists.newArrayList("Here    is    an", "example  of text", "justification.  ");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }

    @Test
    public void small06() {
        String[] input = new String[]{"Here", "is", "an", "example", "of", "text", "justification."};
        int lineWidth = 14;

        List<String> expected = Lists.newArrayList("Here   is   an", "example     of", "text          ", "justification.");

        assertEquals(expected, solution.fullJustify(input, lineWidth));
    }
}
