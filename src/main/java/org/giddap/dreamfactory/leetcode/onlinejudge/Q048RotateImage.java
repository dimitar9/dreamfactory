package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://leetcode.com/onlinejudge#question_48
 * <p/>
 * You are given an n x n 2D matrix representing an image.
 * <p/>
 * Rotate the image by 90 degrees (clockwise).
 * <p/>
 * Follow up:
 * Could you do this in-place?
 * <p/>
 * Good article:
 * http://discuss.leetcode.com/questions/226/rotate-image
 * http://gongxuns.blogspot.com/2012/12/leetcode-rotate-image.html
 * http://blog.unieagle.net/2012/10/20/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Arotate-image/
 * <p/>
 * 旋转图像，方法就是从外到内一圈一圈的转。
 * 在处理每一圈的旋转时，拿最上面一行的第一个元素到倒数第二个元素，逐个找到其在右边，
 * 下边和左边一行（或列）中对应的元素，交换这一组4个元素的值就可以了。
 * <p/>
 * 这个逻辑很清晰。
 */
public interface Q048RotateImage {
    void rotate(int[][] matrix);
}
