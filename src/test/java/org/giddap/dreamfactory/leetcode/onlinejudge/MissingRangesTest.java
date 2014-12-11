package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.MissingRangesImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by peng on 12/10/14.
 */
public class MissingRangesTest {
    private MissingRanges solution = new MissingRangesImpl();

    @Test
    public void small01() {
        List<String> actual = solution.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99);
        List<String> expected = Lists.newArrayList("2", "4->49", "51->74", "76->99");
        assertEquals(expected.size(), actual.size());
        assertEquals(expected, actual);
    }
}
