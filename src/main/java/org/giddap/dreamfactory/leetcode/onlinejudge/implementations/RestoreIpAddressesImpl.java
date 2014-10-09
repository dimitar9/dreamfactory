package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RestoreIpAddresses;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddressesImpl implements RestoreIpAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<String>();
        compute(ret, new ArrayList<String>(), s);
        return ret;
    }

    public void compute(List<String> ret, List<String> segs, String suffix) {
        final int numOfSegs = segs.size();
        final int len = suffix.length();

        if (numOfSegs == 4) {
            if (len == 0) {
                StringBuilder sb = new StringBuilder(segs.get(0));
                for (int i = 1; i < numOfSegs; i++) {
                    sb.append(".");
                    sb.append(segs.get(i));
                }
                ret.add(sb.toString());
            }
            return;
        }

        if (len == 0) {
            return;
        }

        for (int i = 1; i <= 3 && suffix.length() >= i; i++) {
            String prefix = suffix.substring(0, i);

            if (prefix.startsWith("0") && prefix.length() > 1) {
                continue;
            }

            int prefixNumber = Integer.parseInt(prefix);
            if (prefixNumber <= 255) {
                segs.add("" + prefixNumber);
                compute(ret, segs, suffix.substring(i));
                segs.remove(segs.size() - 1);
            }
        }
    }
}
