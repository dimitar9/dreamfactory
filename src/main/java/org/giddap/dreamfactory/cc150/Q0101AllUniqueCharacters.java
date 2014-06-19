package org.giddap.dreamfactory.cc150;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * No extra space may be used.
 */
public class Q0101AllUniqueCharacters {
    public boolean hasAllUniqueCharacters(final String words) {
        checkArgument(StringUtils.isNotBlank(words), "words must not be blank.");

        // Convert to a char array
        char[] chars = words.toCharArray();

        // Sort the array
        Arrays.sort(chars);

        char previousChar = '0';
        for (char c : chars) {
            if (c == previousChar) {
                // Found a repeating char
                return false;
            }
            // update the previousChar
            previousChar = c;
        }
        return true;
    }
}
