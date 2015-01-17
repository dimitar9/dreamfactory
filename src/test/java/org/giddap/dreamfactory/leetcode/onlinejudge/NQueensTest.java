package org.giddap.dreamfactory.leetcode.onlinejudge;

import com.google.common.collect.Sets;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.NQueensBacktrackingImpl;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class NQueensTest {
    private NQueens solution = new NQueensBacktrackingImpl();

    /**
     * Submission Result: Wrong Answer
     * <p/>
     * Input:	4
     * Output:	[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."],["..Q.","Q...","...Q",".Q.."],[".Q..","...Q","Q...","..Q."],[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."],["..Q.","Q...","...Q",".Q.."],[".Q..","...Q","Q...","..Q."]]
     * Expected:	[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
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
        assertEquals(0, solution.solveNQueens(3).size());
    }

    @Test
    public void small04() {
        assertEquals(1, solution.solveNQueens(1).size());
    }
}
