package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RestoreIpAddresses;

import java.util.ArrayList;
import java.util.List;

/**
 * NP
 * Partition the string into 4 segments (ignore more segments):
 * (1) 1 to 3 chars
 * (2) less than 256
 * (3) '0' or does not start with '0'
 */
public class RestoreIpAddressesImpl implements RestoreIpAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<>();
        build(ret, new ArrayList<Integer>(), s);
        return ret;
    }

    private void build(List<String> ret, List<Integer> one, String suffix) {
        if (suffix.length() == 0) {
            if (one.size() == 4) {
                StringBuilder hello = new StringBuilder();
                hello.append(one.get(0));
                for (int i = 1; i < one.size(); i++) {
                    hello.append(".");
                    hello.append(one.get(i));
                }
                ret.add(hello.toString());
            }
        } else {
            if (one.size() >= 4) {
                return;
            } else {
                for (int i = 1; i <= Math.min(3, suffix.length()); i++) {
                    String prefix = suffix.substring(0, i);
                    if (prefix.startsWith("0") && prefix.length() > 1) {
                        continue;
                    }
                    int num = Integer.parseInt(prefix);
                    if (num <= 255) {
                        one.add(num);
                        build(ret, one, suffix.substring(i));
                        one.remove(one.size() - 1);
                    }
                }
            }
        }
    }
}
