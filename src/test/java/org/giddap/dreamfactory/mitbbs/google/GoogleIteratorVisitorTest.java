package org.giddap.dreamfactory.mitbbs.google;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class GoogleIteratorVisitorTest {

    @Test
    public void small01() {
        List<List<Integer>> lists = Lists.newArrayList();
        lists.add(Lists.newArrayList(1, 2, 3));
        lists.add(Lists.newArrayList(4));
        lists.add(new ArrayList<Integer>());
        lists.add(Lists.newArrayList(5, 6));
        lists.add(new ArrayList<Integer>());
        lists.add(new ArrayList<Integer>());
        lists.add(Lists.newArrayList(7));

        GoogleIteratorVisitor<Integer> solution = new GoogleIteratorVisitor<Integer>(lists);

        int i = 1;
        while (solution.hasNext()) {
            assertEquals(i++, solution.next().intValue());
        }
        assertTrue(i == 8);
    }
}
