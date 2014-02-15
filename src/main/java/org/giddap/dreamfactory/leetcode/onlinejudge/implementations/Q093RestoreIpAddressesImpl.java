package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q093RestoreIpAddresses;

import java.util.ArrayList;

public class Q093RestoreIpAddressesImpl implements Q093RestoreIpAddresses {

    public ArrayList<String> restoreIpAddresses(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<String> ret = new ArrayList<String>();
        if (s.length() == 0 || s.length() > 12) {
            return ret;
        }
        restore(s, ret, new ArrayList<Integer>());
        return ret;
    }

    private void restore(String line, ArrayList<String> ret, ArrayList<Integer> segments) {
        if (line.length() == 0) {
            if (segments.size() == 4) {
                StringBuilder ip = new StringBuilder();
                ip.append(segments.get(0));
                for (int i = 1; i < segments.size(); i++) {
                    ip.append(".");
                    ip.append(segments.get(i));
                }
                ret.add(ip.toString());
            }
            return;
        }

        if (line.startsWith("0")) {
            segments.add(0);
            restore(line.substring(1), ret, segments);
            segments.remove(segments.size() - 1);
            return;
        }

        for (int i = 0; i < Math.min(line.length(), 3); i++) {
            String one = line.substring(0, i + 1);
            int val = Integer.parseInt(one);
            if (val <= 255 && segments.size() < 4) {
                segments.add(val);
                restore(line.substring(i + 1), ret, segments);
                segments.remove(segments.size() - 1);
            }
        }
    }

//    @Override
//    public ArrayList<String> restoreIpAddresses(String s) {
//        // Start typing your Java solution below
//        // DO NOT write main() function
//        ArrayList<String> ret = new ArrayList<String>();
//        if (s.length() == 0) {
//            return ret;
//        }
//        buildIpAddresses(ret, new ArrayList<Integer>(), s);
//        return ret;
//    }
//
//    private void buildIpAddresses(ArrayList<String> ret, ArrayList<Integer> prefix, String suffix) {
//        if (prefix.size() == 4) {
//            if (suffix.length() == 0) {
//                StringBuilder sb = new StringBuilder();
//                sb.append(prefix.get(0));
//                for (int i = 1; i < prefix.size(); i++) {
//                    sb.append(".");
//                    sb.append(prefix.get(i));
//                }
//                ret.add(sb.toString());
//            } else {
//                return;
//            }
//        }
//
//        if (suffix.startsWith("0")) {
//            prefix.add(0);
//            buildIpAddresses(ret, prefix, suffix.substring(1));
//        } else {
//            for (int i = 0; i < Math.min(3, suffix.length()); i++) {
//                String segment = suffix.substring(0, i + 1);
//                int segValue = Integer.parseInt(segment);
//                if (segValue <= 255) {
//                    prefix.add(segValue);
//                    buildIpAddresses(ret, new ArrayList<Integer>(prefix), suffix.substring(i + 1));
//                    prefix.remove(prefix.size() - 1);
//                }
//            }
//        }
//
//    }
}
