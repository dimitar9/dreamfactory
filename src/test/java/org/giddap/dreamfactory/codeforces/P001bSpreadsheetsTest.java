package org.giddap.dreamfactory.codeforces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class P001bSpreadsheetsTest {
    private P001bSpreadsheets problem = new P001bSpreadsheets();

    @Test
    public void small01() {
        String input = "R23C55";
        assertEquals("BC23", problem.solve(input));
    }

    @Test
    public void small02() {
        String input = "BC23";
        assertEquals("R23C55", problem.solve(input));
    }

    @Test
    public void small03() {
        String input = "R228C494";
        assertEquals("RZ228", problem.solve(input));
    }

    @Test
    public void small04() {
        String input = "R98C688";
        assertEquals("ZL98", problem.solve(input));
    }
}
