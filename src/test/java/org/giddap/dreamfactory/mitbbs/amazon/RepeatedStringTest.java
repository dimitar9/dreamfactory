package org.giddap.dreamfactory.mitbbs.amazon;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RepeatedStringTest {
    private RepeatedString solution = new RepeatedString();

    @Test
    public void small01() {
        assertTrue(solution.isMultiple("abcabcabc"));
    }

    @Test
    public void small02() {
        assertFalse(solution.isMultiple("bcdbcdbcde"));
    }

    @Test
    public void small03() {
        assertTrue(solution.isMultiple("abcdabcd"));
    }

    @Test
    public void small04() {
        assertFalse(solution.isMultiple("xyz"));
    }

    @Test
    public void small05() {
        assertFalse(solution.isMultiple("aaaaaaaaaa"));
    }
}
