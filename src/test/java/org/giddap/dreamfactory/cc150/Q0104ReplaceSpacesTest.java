package org.giddap.dreamfactory.cc150;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class Q0104ReplaceSpacesTest {
    private Q0104ReplaceSpaces solution = new Q0104ReplaceSpaces();

    @Test
    public void small01() {
        String word = "hello word                  ";
        String expected = "hello%20word";
        assertEquals(expected, solution.replaceSpaces(word.toCharArray(), 10));
    }

    @Test
    public void small02() {
        String word = "he  llo word                  ";
        String expected = "he%20%20llo%20word";
        assertEquals(expected, solution.replaceSpaces(word.toCharArray(), 12));
    }
}
