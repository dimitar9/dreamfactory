package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.ZigZagConversionIterativeImpl;
import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {
    private ZigZagConversion converter = new ZigZagConversionIterativeImpl();

    @Test
    public void small01() {
        final String actual = converter.convert("PAYPALISHIRING", 2);
        Assert.assertEquals("PYAIHRNAPLSIIG", actual);
    }

    @Test
    public void small02() {
        final String actual = converter.convert("PAYPALISHIRING", 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", actual);
    }

    @Test
    public void small03() {
        final String actual = converter.convert("PAYPALISHIRING", 4);
        Assert.assertEquals("PINALSIGYAHRPI", actual);
    }
}
