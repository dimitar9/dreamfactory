package org.giddap.dreamfactory.cc150;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q0101AllUniqueCharactersTest {
    private Q0101AllUniqueCharacters solution;

    @Before
    public void setup() {
        solution = new Q0101AllUniqueCharacters();
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullInput() {
        solution.hasAllUniqueCharacters(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void blankInput() {
        solution.hasAllUniqueCharacters("");
    }

    @Test
    public void uniqueChars() {
        assertTrue(solution.hasAllUniqueCharacters("tqhawer"));
    }

    @Test
    public void repeatedChars() {
        assertFalse(solution.hasAllUniqueCharacters("tqhawerw"));
    }
}
