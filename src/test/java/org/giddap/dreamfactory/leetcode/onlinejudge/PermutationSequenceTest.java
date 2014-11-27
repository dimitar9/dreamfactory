package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PermutationSequenceImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PermutationSequenceIterativeImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermutationSequenceTest {
    private PermutationSequence solution2 = new PermutationSequenceIterativeImpl();
    private PermutationSequence solution = new PermutationSequenceImpl();

    @Test
    public void small01() {
        assertEquals("213", solution.getPermutation(3, 3));
    }

    @Test
    public void small02() {
        assertEquals("4321", solution.getPermutation(4, 24));
    }
}
