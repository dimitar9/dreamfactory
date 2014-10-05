package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.NQueensBacktrackingImpl02;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class NQueensTest {
    private NQueens solution = new NQueensBacktrackingImpl02();

    /**
     * Submission Result: Wrong Answer

     Input:	4
     Output:	[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."],["..Q.","Q...","...Q",".Q.."],[".Q..","...Q","Q...","..Q."],[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."],["..Q.","Q...","...Q",".Q.."],[".Q..","...Q","Q...","..Q."]]
     Expected:	[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
     */
    @Test
    public void small01() {
        List<String[]> actual = solution.solveNQueens(4);

        Set<String[]> expected = Sets.newHashSet(
                new String[]{".Q..", "...Q", "Q...", "..Q."},
                new String[]{"..Q.", "Q...", "...Q", ".Q.."});

        assertEquals(expected.size(), actual.size());

        Set<String> actuals = new HashSet<>();
        for (String[] one : actual) {
            StringBuilder sb = new StringBuilder();
            for (String a : one) {
                sb.append(a);
            }
            actuals.add(sb.toString());
        }

        Set<String> expects = new HashSet<>();
        for (String[] one : actual) {
            StringBuilder sb = new StringBuilder();
            for (String a : one) {
                sb.append(a);
            }
            expects.add(sb.toString());
        }

        assertEquals(expects, actuals);
    }

    @Test
    public void small02() {
        assertEquals(0, solution.solveNQueens(2).size());
    }

    @Test
    public void small03() {
        List<String[]> actual = solution.solveNQueens(5);

        Set<String[]> expected = Sets.newHashSet(
                new String[]{".Q..", "...Q", "Q...", "..Q."},
                new String[]{"..Q.", "Q...", "...Q", ".Q.."});

        assertEquals(expected.size(), actual.size());
        for (String[] one : actual) {
            for (String[] two : expected) {
                assertEquals(two.length, one.length);
                for (int i = 0; i < two.length; i++) {
                    assertEquals(one[i], two[i]);
                }

            }
        }
    }
}
