package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;
import java.util.List;

/**
 * http://oj.leetcode.com/problems/restore-ip-addresses/
 * <p/>
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * <p/>
 * For example:
 * Given "25525511135",
 * <p/>
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/268/restore-ip-addresses
 */
public interface RestoreIpAddresses {
    List<String> restoreIpAddresses(String s);
}
