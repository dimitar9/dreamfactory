package org.giddap.dreamfactory.cc150;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q0103IsPermutationTest {
    private Q0103IsPermutation solution = new Q0103IsPermutation();

    @Test
    public void differentLengths() {
        assertFalse(solution.isPermutation("abc", "abcd"));
    }

    @Test
    public void withWhiteSpaces() {
        assertTrue(solution.isPermutation("abc def  zzz", "zzz def  abc"));
    }
}
