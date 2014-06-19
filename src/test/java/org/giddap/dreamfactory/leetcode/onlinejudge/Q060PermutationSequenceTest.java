package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q060PermutationSequenceTest {
    private Q060PermutationSequence solution = new Q060PermutationSequenceIterativeImpl();

    @Test
    public void small01() {
        assertEquals("213", solution.getPermutation(3, 3));
    }

    @Test
    public void small02() {
        assertEquals("4321", solution.getPermutation(4, 24));
    }
}
