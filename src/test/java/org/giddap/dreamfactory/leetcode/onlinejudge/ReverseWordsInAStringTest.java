package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.ReverseWordsInAStringImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsInAStringTest {
    private ReverseWordsInAString solution = new ReverseWordsInAStringImpl();

    @Test
    public void small01() {
        assertEquals(0, solution.reverseWords(" ").length());
    }

    @Test
    public void small02() {
        assertEquals("e d c b a", solution.reverseWords("   a   b  c d   e  "));
    }
}
