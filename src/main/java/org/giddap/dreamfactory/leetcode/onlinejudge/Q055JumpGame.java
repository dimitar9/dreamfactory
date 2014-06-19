package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://leetcode.com/onlinejudge#question_55
 * <p/>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p/>
 * Each element in the array represents your maximum jump length at that position.
 * <p/>
 * Determine if you are able to reach the last index.
 * <p/>
 * For example:
 * A = [2,3,1,1,4], return true.
 * <p/>
 * A = [3,2,1,0,4], return false.
 * <p/>
 * Links:
 * http://janevans.blogspot.com/2013/02/leetcode-jump-game.html
 * http://gongxuns.blogspot.com/2012/12/leetcodejump-game.html
 * http://discuss.leetcode.com/questions/232/jump-game
 * http://blog.unieagle.net/2012/09/29/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Ajump-game%EF%BC%8C%E4%B8%80%E7%BB%B4%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/
 * http://fisherlei.blogspot.com/2012/12/leetcode-jump-game.html
 */
public interface Q055JumpGame {
    boolean canJump(int[] A);
}
