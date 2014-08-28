package org.giddap.dreamfactory.codeforces;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class P002aWinnerTest {
    private P002aWinner solution = new P002aWinner();

    @Test
    public void small01() {
        List<String> lines = Lists.newArrayList(
                "mike 3",
                "andrew 5",
                "mike 2");

        assertEquals("andrew", solution.solve(lines));
    }

    @Test
    public void small02() {
        List<String> lines = Lists.newArrayList(
                "andrew 3",
                "andrew 2",
                "mike 5");

        assertEquals("andrew", solution.solve(lines));
    }

    @Test
    public void small03() {
        List<String> lines = Lists.newArrayList(
                "kaxqybeultn -352",
                "mgochgrmeyieyskhuourfg -910",
                "kaxqybeultn 691",
                "mgochgrmeyieyskhuourfg -76",
                "kaxqybeultn -303");

        assertEquals("kaxqybeultn", solution.solve(lines));
    }
}
