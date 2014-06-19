package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.SymmetricTreeIterativeImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SymmetricTreeTest {
    //    private SymmetricTree solution = new SymmetricTreeRecursiveImpl();
    private SymmetricTree solution = new SymmetricTreeIterativeImpl();

    @Test
    public void small01() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(2);
        tn1.left = tn2;
        tn1.right = tn3;

        assertTrue(solution.isSymmetric(tn1));
    }

    @Test
    public void small02() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(3);
        tn1.left = tn2;
        tn1.right = tn3;

        assertFalse(solution.isSymmetric(tn1));
    }

    @Test
    public void small03() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(2);
        TreeNode tn4 = new TreeNode(3);
        TreeNode tn5 = new TreeNode(3);
        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = tn4;
        tn3.right = tn5;

        assertTrue(solution.isSymmetric(tn1));
    }

    @Test
    public void small04() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(2);
        TreeNode tn4 = new TreeNode(3);
        TreeNode tn5 = new TreeNode(1);
        tn1.left = tn2;
        tn1.right = tn3;

        tn2.left = tn4;
        tn3.right = tn5;

        assertFalse(solution.isSymmetric(tn1));
    }

    @Test
    public void small05() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(2);
        TreeNode tn4 = new TreeNode(3);
        TreeNode tn5 = new TreeNode(3);
        tn1.left = tn2;
        tn1.right = tn3;

        tn2.right = tn4;
        tn3.right = tn5;

        assertFalse(solution.isSymmetric(tn1));
    }

    @Test
    public void small06() {
        TreeNode tn1 = new TreeNode(1);

        assertTrue(solution.isSymmetric(tn1));
    }

//    9,76,76,-4,#,#,-4,26,-61,-61,-21
//
//    @Test
//    public void small07() {
//        TreeNode tn1 = new TreeNode(9);
//        TreeNode tn2 = new TreeNode(76);
//        TreeNode tn3 = new TreeNode(76);
//        TreeNode tn4 = new TreeNode(-4);
//        TreeNode tn7 = new TreeNode(-4);
//        TreeNode tn8 = new TreeNode(26);
//        TreeNode tn9 = new TreeNode(-61);
//        TreeNode tn10 = new TreeNode(-61);
//        TreeNode tn11 = new TreeNode(-21);
//
//        tn1.left = tn2;
//        tn1.right = tn3;
//
//        tn2.left = tn4;
//        tn3.right = tn7;
//
//        tn4.left = tn8;
//        tn4.right = tn9;
//
//        tn
//
//        assertFalse(solution.isSymmetric(tn1));
//    }
}

/*
Test cases
Input	 Output	 Expected
{}	true	true
{1}	true	true
{1,2}	false	false
{1,#,2}	false	false
{1,2,3}	false	false
{1,2,2}	true	true
{1,2,2,#,3,#,3}	false	false
{1,2,2,#,3,3}	true	true
{1,2,2,3,#,3}	false	false
{1,2,2,3,#,#,3}	true	true
{2,3,3,4,5,5}	false	false
{2,3,3,4,5,#,4}	false	false
{2,3,3,4,#,5,4}	false	false
{2,3,3,#,5,5,4}	false	false
{2,3,3,4,5,4,5}	false	false
{2,3,3,4,5,5,4}	true	true
{3,4,#,5}	false	false
{2,3,3,4,5,5,4,#,#,8,9,9,8}	true	true
{2,3,3,4,5,5,4,#,#,8,9,#,#,9,8}	false	false
{2,3,3,4,5,5,4,6,#,8,9,9,8,#,6}	true	true
{2,3,3,4,5,5,4,6,#,8,9,9,8,6}	false	false
{2,3,3,4,5,5,4,#,7,8,9,9,8,7}	true	true
{2,3,3,4,5,5,4,#,7,8,9,9,8,#,7}	false	false
{2,3,3,4,5,5,4,6,7,8,9,9,8,7,6}	true	true
{2,3,3,4,5,5,4,6,7,8,9,6,7,8,9}	false	false
{2,3,3,4,5,5,4,6,7,8,9,8,9,6,7}	false	false
{3,4,4,5,#,#,5,6,#,#,6}	true	true
{2,3,3,4,#,#,4,#,5,5,#,#,6,6,#,7,8,8,7,9,0,0,1,1,0,0,9}	true	true
{4,-57,-57,#,67,67,#,#,-97,-97}	true	true
{4,63,63,3,64,3,64,39,-45,-57,84,-45,39,-57,84}	false	false
{9,-42,-42,#,76,76,#,#,13,#,13}	false	false
{7,-57,-57,-44,#,#,-44,#,74,74}	true	true
{9,-33,-33,34,#,#,34,40,#,#,40}	true	true
{7,-50,-50,97,12,12,-45,#,-17,-55,16,16,-70,-17}	false	false
{6,-59,-59,27,-21,-21,27,#,-81,5,60,60,5,#,-81}	false	false
{9,6,6,78,#,78,#,61,65,65,-8}	false	false
{2,-58,-58,-48,48,48,-48,97,-12,-8,1,53,-8,97,-12}	false	false
{6,14,14,#,-99,-99,#,28,-13,-13,28}	true	true
{6,-52,-52,19,25,25,19,#,87,78,-16,-16,78,#,-90}	false	false
{3,-37,-37,#,-86,-86,#,-44,#,-44}	false	false
{3,-70,-70,#,53,53,#,-60,-98,-60,-98}	false	false
{9,25,25,#,-95,-95,#,-100,#,#,-15}	false	false
{9,0,0,#,8,8,#,-89,-38,-38,-89}	true	true
{3,64,64,66,#,#,-51,85,#,-6}	false	false
{5,16,16,54,-22,54,-22,-94,14,40,86,14,-94,86,40}	false	false
{7,-64,-64,-6,-90,-90,-6,88,-44,68,-65,-76,68,-44,88}	false	false
{9,76,76,-4,#,#,-4,26,-61,-61,-21}	false	false
{7,13,13,21,-48,-48,21,32,#,#,-13,-13,#,32}	false	false
{2,-4,-4,#,-79,#,-79,-37,#,-37}	false	false
{2,97,97,#,47,80,#,-7,#,#,-7}	false	false
{7,86,86,-62,#,-62,#,-22,-70,-70,-22}	false	false
{8,-93,-93,#,-77,#,-14,-52,#,-52}	false	false
{7,-89,-89,5,#,#,5,#,-56,#,-56}	false	false
{5,96,96,#,-26,-26,#,4,#,#,4}	true	true
{3,-45,-45,-22,81,-22,81,96,#,46,#,#,96,#,46}	false	false
{6,-78,-78,-15,-86,-86,-15,-43,66,-78,-48,-48,-78,-43,66}	false	false
{0,95,95,#,59,59,#,-56,-82,-82,-56}	true	true
{4,91,91,#,89,89,#,-98,-65,-54,-75}	false	false
{2,8,8,4,#,#,4,#,-37,#,-37}	false	false
{9,73,73,-92,41,41,-92,51,#,#,43,#,43,#,51}	false	false
{2,-75,-75,95,-61,-61,95,75,9,-73,-11,-11,-73,8,75}	false	false
{6,30,30,-91,-70,-70,-91,#,33,99,#,#,99,33}	true	true
{1,90,90,-2,#,-2,#,69,#,#,69}	false	false
{7,62,62,-48,#,#,-48,-65,#,-65}	false	false
{2,-68,-68,-59,23,23,-59,98,-18,#,21,21,#,-18,98}	true	true
{5,43,43,97,79,79,97,-1,47,72,#,#,72,47,-1}	true	true
{0,-43,-43,-42,#,#,-42,#,-47,-47}	true	true
{5,-14,-14,-88,6,6,-88,-8,#,-87,-48,-48,-87,-8}	false	false
{1,-49,-49,-43,29,29,-43,#,-2,-85,79,-85,-87,-2}	false	false
{3,89,89,-35,#,#,-35,#,-29,-29}	true	true
{0,-3,-3,-93,97,97,-93,-77,#,-96,#,-96,#,#,-77}	false	false
{2,61,61,85,#,85,#,15,-41,-41,15}	false	false
{7,11,11,-11,75,75,-11,23,60,9,#,#,9,60,23}	true	true
{2,-69,-69,#,98,98,#,55,-8,-8,55}	true	true
{5,32,32,-79,#,#,-79,69,60,60,69}	true	true
{8,83,83,#,-80,#,-80,13,#,#,13}	false	false
{5,74,74,-39,#,7,#,#,45,#,45}	false	false
{0,-87,-87,#,34,#,34,-6,#,#,-6}	false	false
{6,-4,-4,-53,#,#,-53,#,17,15,#,-93,-50,-50,-93}	false	false
{6,-91,-91,-61,98,98,-61,41,19,26,#,#,26,19,41,#,-51,-50,#,33,83,83,33,#,-50,#,-51}	false	false
{2,-29,-29,-38,-25,-25,-38,-97,#,26,#,#,26,#,-97,-96,#,24,#,24,#,#,-96}	false	false
{2,28,28,-84,#,#,-84,-22,#,-22,#,49,#,49}	false	false
{3,-35,-35,46,14,14,46,-78,40,#,-85,-85,#,40,-78,50,-12,-32,-64,78,-4,-4,78,-64,-32,50,-12}	false	false
{8,-97,-97,#,54,54,#,#,94,94,#,34,-98,-98,34}	true	true
{9,94,94,26,4,4,26,92,#,7,42,42,7,#,92,#,23,-87,-92,-3,#,-3,#,-92,-87,23}	false	false
{8,40,40,-34,#,#,-34,-42,#,#,-42,#,33,33}	true	true
{7,10,10,#,22,22,#,-8,35,35,-8,#,57,-66,26,26,-66,57}	true	true
{3,67,67,18,#,#,18,-1,-64,-64,-1,#,61,-20,#,#,-20,#,61}	false	false
{7,-83,-83,31,#,31,#,#,12,12,#,-90,78,86,-90}	false	false
{3,-25,-25,#,-99,-99,#,-75,#,-75,#,11,#,#,11}	false	false
{3,66,66,-57,#,#,-57,54,-12,-65,78,-38,-60,-22,21,21,-22,-60,-38}	false	false
{0,-23,-23,92,#,#,92,#,-79,-79,#,78,#,#,78}	true	true
{8,82,82,56,-89,-89,56,#,-31,-60,-94,-94,-60,-31,#,-44,-55,#,-67,36,#,#,36,#,-67,-55,-44}	false	false
{4,-82,-82,27,-98,-98,27,#,96,#,65,#,65,#,96,#,-96,#,-94,-94,#,-96}	false	false
{9,-51,-51,-5,22,22,-5,80,76,41,80,80,41,76,80,50,-23,#,-52,#,31,-25,#,#,-25,31,#,-52,#,6,50}	false	false
{7,82,82,-79,98,98,-79,-79,#,-28,-24,-28,-24,#,-79,#,97,65,-4,#,3,-4,65,3,#,97}	false	false
{1,29,29,2,#,#,2,24,#,#,24,-27,-77,-77,-27}	true	true
{5,45,45,89,#,#,89,99,-92,-92,99,9,#,#,-10,-10,#,#,9}	true	true
{2,82,82,#,46,46,#,#,-15,#,-15,-3,94,-3,94}	false	false
{3,46,46,#,60,60,#,#,89,89,#,-93,17,17,-93}	true	true
{9,-78,-78,68,45,45,68,-74,78,66,#,#,66,-74,78,#,-28,24,78,#,60,60,#,-28,#,96,78}	false	false
{2,44,44,46,64,64,46,-34,#,#,-84,#,-84,#,-34,#,50,95,50,50,-29,50}	false	false
{7,-36,-36,70,#,#,70,#,23,23,#,-38,82,82,-38}	true	true
{9,71,71,#,79,79,#,-76,-43,-43,-76,#,-52,21,#,#,84,-52}	false	false
{5,-35,-35,-8,0,0,-8,#,-11,33,62,33,62,#,-11,#,-64,60,-20,#,-38,-20,60,-38,#,-64}	false	false
{9,-12,-12,32,10,10,32,#,-79,95,88,88,95,-79,#,-90,#,56,#,#,50,50,#,#,56,#,-90}	true	true
{2,-89,-89,-1,-70,-70,-1,#,84,#,-75,#,-75,84,#,57,67,81,#,#,81,67,57}	false	false
{1,30,-29,-60,#,-60,#,98,77,77,98,#,-34,42,#,#,42,-34}	false	false
{7,34,34,#,-4,-4,#,#,-76,-76,#,35,60,-37,35}	false	false
{1,91,-21,-84,#,-84,#,93,43,93,43,35,#,53,#,#,35,#,-27}	false	false
{4,-45,-45,59,#,#,59,-14,28,28,-14,#,-3,#,94,94,#,-3}	true	true
{7,27,27,#,29,29,#,54,#,54,#,-73,-17,-17,-73}	false	false
{4,-36,-36,-73,79,79,-73,#,34,6,68,68,6,34,#,-87,#,-65,89,-97,97,97,-97,-65,89,-87}	false	false
{9,-94,-94,#,40,40,#,53,#,#,53,-16,#,#,-16}	true	true
{0,46,46,55,32,32,55,-10,47,-28,-95,-95,-28,47,-10,#,37,26,#,78,-38,82,-47,82,-47,78,-38,#,26,37}	false	false
{0,-99,-99,1,#,#,1,#,79,79,#,11,35,35,11}	true	true
{3,74,74,#,-5,#,-5,14,-41,14,-41,-11,5,12,-9,5,-11,-9,12}	false	false
{2,19,19,-20,#,-20,#,-45,#,-45,#,2,69,69,2}	false	false
{0,71,71,7,62,62,7,-70,-26,#,-84,-84,#,-26,-70,23,55,7,#,85,#,85,#,7,#,55,23}	false	false
{7,5,5,-88,#,#,-88,94,#,94,#,#,-30,-30}	false	false
{5,-22,-22,-30,#,#,-30,-61,#,#,-61,86,25,25,86}	true	true
{8,-90,-90,#,-71,-71,#,-36,94,94,-36,#,-38,-76,#,#,-76,-38}	true	true
{4,-81,-81,#,77,77,#,-2,-62,-62,-2,98,-91,#,2,2,#,-91,98}	true	true
{4,4,10,#,-53,-53,#,73,-84,-84,73,-42,#,-84,46,46,-84,#,-42}	false	false
{1,19,19,-27,#,#,-27,#,-46,-46,#,80,79,79,80}	true	true
{3,23,23,89,12,12,89,-22,#,#,-69,-69,#,#,-22,15,#,#,-44,-44,#,#,15}	true	true
{3,-48,-48,-40,-80,-80,-40,#,55,#,-2,-2,#,#,55,-21,#,-87,25,25,-87,-21}	false	false
{8,-42,17,-85,95,95,-85,46,43,-76,#,#,-76,43,46,#,11,44,#,#,61,61,#,44,#,11}	false	false
{9,77,77,#,87,#,87,31,39,39,31,-63,#,#,63,63,#,#,-63,-12,#,#,-16,#,-16,#,-12}	false	false
{8,30,30,-20,-56,-56,-20,-43,-40,-80,#,#,-80,-40,-43,97,18,-3,-16,-96,#,#,-96,-16,-3,18,97,#,28,-94,-3,7,-80,21,-10,-87,#,#,-87,-10,21,-80,7,-3,-94,28}	true	true
{5,-54,-54,54,#,#,54,26,-62,-62,26,62,73,95,91,91,95,73,62,#,-17,#,-82,-92,94,-77,99,99,-77,94,-92,-82,#,-17}	true	true
{7,10,10,-16,-92,-92,-16,-46,#,59,-12,-12,59,#,-46,-56,-52,#,-73,#,-39,#,-39,-73,#,-52,-56,#,-61,94,85,-20,56,-83,59,59,-83,56,-20,85,94,-61}	false	false
{2,75,75,35,#,#,35,-5,#,#,-5,#,-26,-26,#,54,#,#,54}	true	true
{0,88,88,#,44,44,#,39,-97,-97,39,#,-13,39,#,#,39,-13,#,-24,#,86,#,#,86,-24}	false	false
{0,-18,-18,#,-37,-37,#,-49,#,-49,#,#,47,47,#,-62,#,#,-62}	false	false
{5,48,48,41,-23,-23,41,-52,-89,-21,#,#,-21,-89,-52,54,#,#,-86,89,20,20,89,-86,#,#,54,14,48,61,-100,-15,#,-86,#,-86,#,#,-15,-100,61,14,48}	false	false
{5,-34,-34,-68,#,#,-68,94,#,94,#,46,-45,-45,46,#,-77,-56,#,#,-56,-77}	false	false
{1,64,64,18,#,#,18,#,73,73,#,#,-61,-61,#,#,-77,-77}	true	true
{7,-97,-97,-79,-63,-63,-79,#,-69,62,#,#,62,-69,#,#,74,#,53,53,#,74,#,-98,67,77,94,77,94,67,-98}	false	false
{2,90,90,-79,#,#,-79,#,47,47,#,50,#,#,50,-31,-42,-42,-31}	true	true
{1,50,50,-12,#,#,-12,#,3,3,#,-28,-64,-64,-28,#,-37,36,#,#,36,-37}	true	true
{8,25,25,47,#,#,47,-56,#,#,-56,47,-10,-10,47,-65,#,#,63,63,#,#,-65}	true	true
{8,-68,-68,-33,#,#,-33,-63,#,#,-63,#,14,14,#,#,-39,-39}	true	true
{8,6,6,#,78,#,78,-17,#,-17,#,16,#,#,16,#,-13,-13}	false	false
{9,-43,-43,#,53,53,#,#,1,1,#,#,-37,-37,#,28,#,#,61}	false	false
{5,18,18,10,#,#,10,45,#,45,#,43,#,#,43,#,19,19}	false	false
{2,-86,-86,89,-98,-98,89,-69,73,-39,#,#,-39,73,-69,34,65,16,#,53,#,#,53,#,16,65,34,#,-53,-73,#,#,88,83,#,#,83,88,#,#,-73,-53}	true	true
{0,-37,-37,80,-71,-71,80,-93,9,26,#,#,26,9,-93,32,43,-8,-50,76,76,76,76,-50,-8,43,32,-99,89,#,-96,#,-45,57,#,-87,#,-90,#,#,-90,#,-87,#,57,-45,#,-96,#,89,-99}	true	true
{4,73,-99,-92,#,#,-92,#,-6,-6,#,#,-9,-9,#,-79,#,#,-79}	false	false
{2,-66,-66,#,23,#,23,-90,55,-90,55,#,94,63,-48,94,#,-48,63,#,-47,-91,#,#,-26,-47,#,-26,#,#,-91}	false	false
{6,-98,-98,25,96,96,25,-13,8,-78,#,#,-78,8,-13,-67,#,17,#,#,77,77,#,#,17,#,-67,-14,93,#,70,#,72,72,#,70,#,93,-14}	true	true
{7,-18,-18,20,-86,-86,20,-34,#,-90,-67,29,-90,#,-34,74,#,84,34,-25,#,#,-25,34,84,#,74,-8,#,62,#,-37,-60,#,19,19,#,-60,-37,#,62,#,-8}	false	false
{5,89,89,76,#,#,76,#,-54,-54,#,26,#,#,26,-94,20,20,-94}	true	true
{4,95,95,-23,#,-23,#,66,#,#,66,-51,#,#,-51,-62,#,#,-62}	false	false
{4,92,92,76,#,#,76,-65,#,#,-65,59,-12,-12,59,-7,#,65,-16,-16,65,-7}	false	false
{3,27,27,48,-84,-84,48,-8,#,9,51,51,9,#,-8,-31,#,#,49,-64,-98,-98,-64,49,#,#,-31,4,#,-33,#,60,-1,-55,36,36,-55,-1,60,#,-33,#,4}	true	true
{3,29,29,-69,82,82,-69,-50,-97,-41,#,#,-41,-97,-50,53,50,#,-100,-2,67,67,-2,-100,#,50,53,#,89,#,-99,37,#,-83,-64,#,-42,-42,#,-64,-83,#,37,-99,#,89}	true	true
{1,25,25,25,#,#,25,-38,#,#,-38,#,96,96,#,#,-45,-45}	true	true
{6,30,30,#,59,59,#,-75,-60,-60,-75,94,#,66,77,77,66,#,94,63,#,80,#,84,-10,-10,84,80,#,#,63}	false	false
{5,-52,-52,#,-74,-74,#,#,-80,-80,#,35,-6,-6,35,#,76,-26,-97,-26,-97,76}	false	false
{8,-83,-83,#,-42,-42,#,7,#,#,7,#,33,33,#,5,#,#,5}	true	true
{0,-13,-13,1,#,#,1,#,91,91,#,99,78,78,99,#,-91,#,-64,-64,#,-91}	true	true
{5,-83,-83,#,-68,-68,#,2,#,#,2,89,#,#,89,-10,#,#,-10}	true	true
{2,80,-67,-58,#,#,-58,#,-25,-25,#,-66,68,68,-66,#,89,-69,#,-69,#,89}	false	false
{3,-44,-44,-93,-13,-13,-93,-80,#,#,18,18,#,#,-80,70,91,93,14,14,93,91,70,#,64,-75,66,#,66,-11,#,#,-11,66,#,66,-75,64}	true	true
{1,-58,-58,86,-68,-68,86,#,-89,#,51,51,#,-89,#,30,#,#,-35,-35,#,#,30,69,-13,#,6,6,#,-13,69}	true	true
{7,85,58,85,#,#,85,65,-58,-58,65,46,13,#,54,54,#,46,13,#,-31,33,#,#,-3,-3,#,-31,#,#,33}	false	false
{4,-13,-13,-76,#,#,-76,90,98,98,90,-12,-29,#,5,5,#,-29,-12,#,58,#,56,-98,#,-98,#,56,#,58}	false	false
{6,-41,-41,#,-65,-65,#,77,#,#,77,-34,-53,-53,-34,-76,#,-97,#,-97,#,#,-76}	false	false
{2,-73,-73,-38,-24,-24,-38,#,-66,-48,5,5,-48,#,-66,-55,#,-1,#,#,64,64,#,#,-1,#,-55,-19,-90,3,#,-75,-26,-26,-75,#,3,-90,-19}	false	false
{8,45,45,56,-61,-61,56,#,-68,-4,-87,-87,-4,-68,#,-15,#,-88,#,58,-1,-1,58,#,-88,#,-15,#,36,#,89,#,14,36,#,#,36,14,#,#,-62,36}	false	false
{2,47,47,-66,97,97,-66,#,87,#,-37,-37,#,87,#,#,-79,#,62,62,#,-79,#,-27,-14,-2,71,71,-2,-14,-27}	true	true
{5,-33,-33,-45,#,#,-45,#,-72,-72,#,1,#,#,1,#,40,40}	true	true
{9,15,15,#,96,96,#,#,-69,-69,#,64,-35,-35,64,97,#,#,-28,-53,#,97}	false	false
{5,86,86,#,-45,-45,#,38,#,#,38,#,-36,#,-36,#,93,93}	false	false
{9,19,19,60,-48,-48,60,#,-65,90,61,61,90,-65,#,#,-90,-94,-42,-94,#,-94,#,-42,-94,-90,#,-42,96,99,#,25,#,0,-90,-90,0,25,#,#,99,96,-42}	false	false
{6,-60,-60,-70,#,#,-70,-64,-65,-65,-64,87,#,#,-58,-58,#,87,#,97,22,-6,#,#,-6,22,97}	false	false
{4,90,90,#,-70,-70,#,#,-40,-40,#,-52,#,#,-52,87,#,#,87}	true	true
{9,14,14,74,#,#,74,#,12,12,#,63,#,#,63,-8,#,#,-8,-53,#,#,-53,#,-96,-96,#,-65,#,#,-65,98,#,#,98,50,#,#,50,#,91,91,#,41,-30,-30,41,#,86,#,-36,-36,#,86,#,-78,#,9,#,#,9,#,-78,47,#,48,-79,-79,48,#,47,-100,-86,#,47,#,67,67,#,47,#,-86,-100,-28,11,#,56,#,30,#,64,64,#,30,#,56,#,11,-28,43,54,#,-50,44,-58,63,#,#,-43,-43,#,#,63,-58,44,-50,#,54,43}	true	true
{1,74,74,68,-76,-76,68,-32,#,#,-85,#,-85,#,-32,#,-69,53,-80,-80,53,-69,#,#,96,-73,#,62,#,#,62,#,-73,96,#,76,#,#,-49,#,-14,-14,#,-49,#,#,76,11,#,-93,#,#,98,98,#,#,-93,11,#,43,#,-60,-75,-58,46,46,-58,-75,-60,#,43,69,#,#,15,#,-12,#,-69,-54,#,#,-54,-69,#,-12,#,15,#,#,69,-35,#,31,#,#,-57,#,99,-85,#,#,-85,99,#,-57,#,#,31,#,-35,#,78,#,-88,-87,18,58,#,71,15,15,71,#,58,18,-87,-88,#,78,#,-99,-3,#,-17,#,-38,-86,#,#,45,#,-76,#,-30,-30,#,-76,#,45,#,#,-86,-38,#,-17,#,-3,-99,24,#,54,#,#,62,-83,#,1,#,20,#,#,42,-12,#,#,-12,42,#,#,20,#,1,#,-83,62,#,#,54,#,24,94,#,#,75,-81,#,-69,#,81,38,#,52,56,#,95,94,94,95,#,56,52,#,38,81,#,-69,#,-81,75,#,#,94,#,95,-95,#,-13,#,32,#,80,#,-50,#,#,-68,#,51,#,5,-13,#,#,-13,5,#,51,#,-68,#,#,-50,#,80,#,32,#,-13,#,-95,95,#,#,12,#,77,13,#,#,-90,#,-92,#,59,20,#,-11,-12,-98,#,-47,#,#,-47,#,-98,-12,-11,#,20,59,#,-92,#,-90,#,#,13,77,#,12}	false	false
{2,23,23,#,-46,-46,#,-21,-31,-31,-21,-76,#,9,21,21,9,#,-76,88,57,#,77,#,-15,-15,#,77,#,57,88,#,28,66,25,#,-44,-31,#,#,-31,-44,#,66,25,28,#,-90,21,#,-9,-75,#,11,#,#,-42,-42,#,#,11,-9,#,#,-75,21,-90,#,-100,#,63,-20,#,#,62,#,-73,#,-16,-16,#,-73,#,#,-20,62,#,63,#,-100,#,#,42,-14,#,-30,21,-7,#,#,-30,13,#,#,13,-30,#,21,-30,#,-7,#,-14,42,#,74,#,#,-31,#,56,7,#,#,85,-91,#,#,-57,-57,#,#,-91,#,7,56,#,85,#,-31,#,#,74,-54,-31,54,#,#,38,#,84,#,-20,#,40,-72,64,64,-72,40,#,84,#,38,#,-20,#,#,54,-31,-54,85,#,#,-99,-35,#,#,-91,-88,-52,-88,20,#,-65,-21,#,50,15,15,50,#,-21,-65,#,-52,-88,-91,#,20,-88,#,-35,-99,#,#,85,94,91,#,42,-45,94,#,-95,#,33,-80,#,-1,#,-13,#,-59,-33,68,-5,#,-29,#,91,91,#,-29,#,-5,68,-33,-59,#,-80,33,#,-95,#,#,-13,#,-1,94,-45,42,#,91,94,#,-56,-53,-17,#,-41,-39,-80,#,-37,4,-45,#,-83,95,4,-98,24,#,-81,82,#,#,-42,58,#,#,50,#,84,22,#,#,22,84,#,50,#,#,58,-42,#,#,82,4,95,-83,#,-45,4,-81,#,24,-98,-37,#,-80,-39,-41,#,-17,-53,-56,#,#,-59,#,46,-26,77,61,#,-97,#,44,-66,#,18,81,#,-19,-51,#,-35,-76,-21,#,-61,#,-42,10,#,#,-56,#,-11,#,-17,20,#,#,-68,4,-43,-6,2,2,-6,-43,4,-68,#,#,20,-17,#,-11,#,-61,#,-21,-76,-35,#,-51,-19,#,81,-56,#,#,10,-42,#,18,#,-66,44,#,-97,#,61,77,-26,46,#,-59}	false	false
{6,97,97,#,79,79,#,#,-60,-60,#,-30,#,#,-30,-90,#,#,-90,#,-29,-29,#,-73,75,75,-73,-15,#,#,-36,-36,#,#,-15,27,#,#,23,23,#,#,27,82,#,80,#,#,80,#,82,38,#,-8,93,93,-8,#,38,18,#,-15,#,#,39,39,#,#,-15,#,18,#,-17,#,95,94,#,#,94,95,#,-17,#,51,#,88,#,95,#,#,95,#,88,#,51,#,-71,#,63,#,-62,-62,#,63,#,-71}	true	true
{6,82,82,#,53,53,#,-58,#,#,-58,#,-85,-85,#,-9,#,#,-9,#,48,48,#,33,#,#,33,81,#,#,81,5,#,#,5,61,#,#,61,#,9,9,#,91,#,#,91,72,7,7,72,89,#,94,#,#,94,#,89,-27,#,-30,36,36,-30,#,-27,50,36,#,-80,34,#,#,34,-80,#,36,50,18,#,#,91,77,#,#,95,95,#,#,77,91,#,#,18,-19,65,#,94,#,-53,#,-29,-29,#,-53,#,94,#,65,-19,-62,-15,-35,#,#,-19,43,#,-21,#,#,-21,#,43,-19,#,#,-35,-15,-62,86,#,#,-70,#,19,#,55,-79,#,#,-96,-96,#,#,-79,55,#,19,#,-70,#,#,86,49,#,25,#,-19,#,#,8,30,#,82,-47,-47,82,#,30,8,#,#,-19,#,25,#,49}	true	true
{3,81,81,#,67,67,#,-87,#,#,-87,#,-85,-85,#,14,#,#,14,#,-16,-16,#,#,77,77,#,-4,#,#,-4,-85,21,21,-85,-24,71,37,#,#,37,71,-24,11,37,97,#,28,#,#,28,#,97,37,11,#,-24,99,#,-99,#,#,95,95,#,#,-99,#,99,-24,#,30,34,#,41,-26,-91,#,55,55,#,-91,-26,41,#,34,30,17,#,-61,#,-80,#,-8,38,#,19,#,25,25,#,19,#,-1,-8,#,-80,#,-61,17,#,-48,#,#,74,#,-15,#,14,#,-74,27,26,14,#,#,14,26,27,-74,#,14,#,-15,#,74,#,#,-48,-42,#,#,-11,21,10,-69,-82,65,#,85,#,-11,#,93,#,#,93,#,-11,#,85,#,65,-82,-69,10,21,-11,#,#,-42,#,-5,#,36,91,#,#,88,#,-39,-75,#,#,-58,#,43,34,#,#,-10,-10,#,#,34,43,#,-58,#,#,-75,-39,#,88,#,#,91,36,#,-5,#,37,#,-34,52,34,#,#,-30,#,-38,87,-26,-78,-25,50,#,-94,-59,-7,#,#,-7,-59,-94,#,50,-25,-78,-26,87,-38,#,-30,#,#,34,52,-34,#,37,60,89,-88,#,-28,#,#,37,-1,#,5,#,#,-23,-4,#,-14,#,6,#,#,-63,#,-55,-80,-13,93,#,#,93,-13,-80,-55,#,-63,#,#,6,#,-14,#,-4,-23,#,#,5,#,-1,37,#,#,-28,#,-88,89,60,89,#,#,58,-7,63,0,-83,40,#,#,-1,38,-61,#,-73,-33,#,60,#,96,-83,#,-77,#,-27,52,85,#,-37,-7,38,38,-7,-37,#,85,52,-27,#,-77,#,-83,96,#,60,#,-33,-73,#,-61,38,-1,#,#,40,-83,0,63,-7,58,#,#,89,#,-65,-13,-28,70,#,-66,71,#,59,50,#,#,2,-39,#,#,77,#,-27,#,-36,-69,#,-44,#,50,#,#,64,#,47,#,-7,#,-40,#,97,#,32,34,#,-94,12,12,-94,#,34,32,#,97,#,-40,#,-7,#,47,#,64,#,#,50,#,-44,#,-69,-36,#,-27,#,77,#,#,-39,2,#,#,50,59,#,-66,71,#,70,-28,-13,-65}	false	false
{0,-23,-23,17,#,#,17,-81,#,#,-81,-94,61,61,-94,14,#,#,-37,-37,#,#,14,#,11,-40,#,#,-40,#,11,-63,#,#,72,72,#,#,-63,9,29,#,-95,-95,#,29,9,-11,#,95,#,77,#,#,77,#,95,#,-11,#,95,-19,#,#,-5,-5,#,#,-19,95,#,-85,#,#,-75,-47,#,#,-47,-75,#,#,-85,80,#,-99,#,-44,#,#,-44,#,-99,#,80,-16,14,12,#,-2,-51,-51,-2,#,12,14,-16,#,-68,87,22,-34,#,73,#,-82,#,#,-82,#,73,#,-34,22,87,-68,#,26,#,#,51,56,91,-84,-62,-4,#,#,-63,-63,#,#,-4,-62,-84,91,56,51,#,#,26}	false	false
{9,23,23,#,25,25,#,#,45,45,#,#,81,81,#,#,-44,-44,#,#,97,97,#,-100,#,#,-100,#,-36,-36,#,#,-1,-1,#,#,-8,-8,#,-39,#,#,-39,#,-22,-22,#,#,49,49,#,-72,#,#,-72,#,57,57,#,#,-41,-41,#,-43,#,#,-43}	true	true
{9,96,96,94,58,58,94,#,-75,-89,#,#,-89,-75,#,#,79,-57,#,#,-57,79,#,#,-90,-54,#,#,-54,-90,#,#,86,-76,89,89,-76,86,#,-5,#,76,#,1,#,#,1,#,76,#,-5,-39,#,#,79,24,#,#,24,79,#,#,-39,#,76,95,32,91,#,#,91,32,95,76,#,#,-56,39,-36,31,23,82,#,#,82,23,31,-36,39,-56,#,#,-77,88,#,-16,-29,#,-87,#,-77,66,-73,-73,66,-77,#,-87,#,-29,-16,#,88,#,-77,#,-46,88,#,-39,48,-46,#,-84,74,-78,#,-49,#,78,-80,-80,78,#,-49,#,-78,74,-84,#,-46,48,-39,#,88,-46,#,#,77,34,-83,#,33,-51,#,-43,18,#,7,-12,39,27,#,-76,60,-73,#,63,#,#,63,#,-73,60,-76,#,27,39,-12,7,#,18,-43,#,-51,33,#,-83,34,#,77,62,#,#,72,#,-6,#,40,2,#,#,-18,-38,#,-76,#,-45,#,69,#,83,#,#,31,86,#,#,7,#,-43,-43,#,7,#,#,86,31,#,#,83,#,69,#,-45,#,-76,-38,#,-18,#,#,2,40,#,-6,#,72,#,#,62,#,77,#,76,15,#,1,#,#,43,90,#,-36,#,61,#,97,96,#,51,74,50,#,91,#,-48,#,84,-39,#,#,-39,84,#,-48,#,91,#,50,74,51,#,96,97,#,61,#,-36,#,90,43,#,#,1,#,15,76,#,77,#,#,-7,-23,49,-8,#,45,#,73,86,#,-14,-97,#,-74,#,-20,55,23,#,#,84,-79,#,25,91,37,#,#,-83,-38,#,#,-31,-31,#,#,-38,-83,#,#,37,91,25,#,-79,84,#,#,23,55,-20,#,-74,#,-97,-14,#,86,73,45,#,#,-8,49,-23,-7,#,#,89,#,-16,#,-63,#,-81,1,-23,#,-72,#,-59,-6,#,#,-12,-34,64,19,#,#,-93,#,8,#,39,-95,#,24,90,46,#,-71,#,75,10,#,65,-72,#,#,-72,65,#,10,75,#,-71,#,46,90,24,#,-95,39,#,8,#,-93,#,#,19,64,-34,-12,#,#,-6,-59,#,-72,#,-23,1,-81,#,-63,#,-16,#,89,#,-58,#,35,-57,72,#,#,44,-47,#,#,-90,-75,#,#,9,88,#,26,#,#,-49,#,73,#,30,#,-64,62,#,#,31,39,79,-92,#,-89,#,41,#,-63,94,#,65,#,16,-76,#,-57,-28,-28,-57,#,-76,16,#,65,#,94,-63,#,41,#,-89,#,-92,79,39,31,#,#,62,-64,#,30,#,73,#,-49,#,#,26,#,88,9,#,#,-75,-90,#,#,81,44,#,#,72,-57,35,#,-58,#,6,75,#,-56,#,80,-58,-10,#,#,63,#,2,-14,#,#,-55,#,-71,68,-34,#,1,-14,#,#,64,56,-41,10,#,34,#,-8,#,-40,-98,#,-10,#,-91,-40,#,-89,2,53,#,#,-13,8,#,#,83,75,-27,82,#,#,82,-27,75,#,83,#,8,-13,#,#,53,2,-89,#,-40,-91,#,-10,#,-98,-40,#,-8,#,34,#,10,-41,56,64,#,#,-14,1,#,-34,68,-71,#,-55,#,#,-14,2,#,63,#,#,-10,-58,80,#,-56,#,75,6,#,#,-73,68,#,#,94,-42,#,#,26,38,63,79,-36,#,-97,#,18,14,#,#,-82,#,64,77,-60,#,-31,#,88,65,#,-51,#,#,-87,#,60,86,#,-31,#,#,-33,-24,#,#,-18,91,#,-9,-41,32,#,-53,#,#,-87,-68,#,#,-71,30,-52,-60,#,#,26,-78,82,82,-78,26,#,#,-60,-52,30,-71,#,#,-68,-87,#,#,-53,#,32,-41,-9,#,91,-18,#,#,-24,-33,#,#,-31,#,86,60,#,-87,#,#,-51,#,65,88,#,-31,#,-60,77,64,#,-82,#,#,14,18,#,-97,#,-36,79,63,38,26,#,#,-42,94,#,#,68,-73}	false	false
{2,99,99,0,#,#,0,-11,#,#,-11,-44,-9,-9,-44,#,-77,-61,#,#,-61,-77,#,-90,#,0,73,73,0,#,-90,#,61,-19,#,#,-8,-8,#,#,-19,#,61,22,-50,36,#,14,-59,-59,14,#,36,-50,22,-5,#,#,68,#,48,29,-80,-48,-44,-44,-48,-80,29,48,#,68,#,#,-5,38,#,-73,#,22,#,#,-79,11,#,#,28,26,#,#,26,28,#,#,11,-79,#,#,22,#,-73,#,38,60,#,17,61,#,-62,#,16,43,#,91,-64,-21,#,#,-21,-64,91,#,43,16,#,-62,#,61,17,60,#,78,#,99,#,#,48,#,-82,-44,#,40,#,#,68,#,87,#,-76,-76,#,87,#,68,#,#,40,#,-44,-82,#,48,#,#,99,#,78,70,#,#,-50,-39,#,-8,84,#,-68,31,#,50,#,#,19,-65,-69,-69,-65,19,#,#,50,#,31,-68,#,84,-8,#,-39,-50,#,#,70,55,#,#,45,-71,#,-68,-32,#,58,14,#,-41,#,#,-48,#,-88,-89,-33,#,-13,-13,#,-33,-89,-88,#,-48,#,#,-41,#,14,58,#,-32,-68,#,-34,45,#,#,55,-38,#,-13,#,-31,#,-49,#,-68,#,-86,53,#,38,#,88,7,#,-72,#,#,-30,-55,-27,79,57,57,79,-27,21,-30,#,#,-72,#,7,88,#,38,#,53,-86,#,-68,#,-49,#,-31,#,-13,#,-38,99,-63,-57,-73,#,-3,-45,-92,-58,#,-76,#,-96,#,48,#,91,#,86,#,-97,#,#,73,#,-65,40,-10,#,53,#,-5,-5,#,53,#,-10,40,-65,#,73,#,#,-97,#,86,#,91,#,48,#,-96,#,-76,#,-58,-92,-45,-3,#,-73,-57,-63,99,-44,-47,28,-14,-40,3,35,#,#,84,#,11,-86,24,-72,66,80,#,#,-100,#,-75,#,76,7,-5,-19,-10,-54,#,-53,#,85,-21,-100,47,-59,#,-22,#,#,-22,#,-59,47,-100,-21,85,#,-53,#,-54,-10,-19,-5,7,76,#,-75,#,-100,#,#,80,66,-72,24,-86,11,#,84,#,#,35,3,-40,-14,28,-47,-44,#,-52,68,#,#,14,-18,#,-3,29,#,-16,11,#,-5,#,-67,20,50,#,#,-92,#,-23,-64,#,#,91,-81,#,-60,#,#,73,76,#,#,-46,-14,48,#,-40,-22,#,-31,#,-79,-98,-55,#,76,-89,#,-72,69,#,65,#,#,65,#,-40,#,-72,-89,76,#,-55,-98,-79,#,-31,#,-22,-40,#,48,-14,-46,#,#,76,73,#,#,-60,#,-81,91,#,#,-64,-23,#,-92,#,#,50,20,-67,#,-5,#,11,-16,#,29,-3,#,-18,14,#,#,68,-52,#,-38,#,58,77,2,-99,#,-23,-96,#,-34,#,-4,-46,55,#,#,-98,#,45,92,#,-90,-15,21,#,#,-9,-56,76,-35,56,-81,#,4,#,-61,#,#,-77,-74,-43,-54,14,#,87,-100,-86,3,#,95,-29,91,#,46,-62,#,33,-72,#,#,59,77,#,#,-53,-4,#,#,-4,-53,#,#,77,59,#,#,-72,33,#,-62,46,#,91,-29,95,#,3,-86,-100,87,#,14,-54,-43,-74,-77,#,#,-61,#,4,#,-81,56,-35,76,-56,-9,#,#,21,-15,-90,#,92,45,#,-98,#,#,55,-46,-4,#,-34,#,-96,-23,#,-99,2,77,58,#,-38,#,-90,#,71,#,85,#,-86,#,-89,78,#,#,-57,20,#,#,72,#,17,#,75,77,#,#,7,#,9,#,-49,15,#,#,94,90,#,-77,#,58,-68,#,20,#,82,#,71,#,53,#,-73,-32,#,46,-30,#,74,#,45,0,-50,33,#,#,-52,#,-24,94,#,#,93,27,#,#,-74,44,#,20,#,-100,-37,76,#,22,85,38,#,-72,#,-51,#,#,-51,#,-72,#,38,85,22,#,76,-37,-100,#,20,44,#,-74,#,#,27,93,#,#,94,-24,#,-52,#,#,33,-50,0,45,#,74,#,-30,46,#,-32,-73,#,53,#,#,71,82,#,20,#,-68,58,#,-77,#,90,94,#,#,15,-49,#,9,#,7,#,#,77,75,#,17,#,72,#,#,20,-57,#,#,78,-89,#,#,-86,#,85,71,#,-90}	false	false
{37,-34,-48,#,-100,-100,48,#,#,#,#,-54,#,-71,-22,#,#,#,8}	false	false
{-64,12,18,-4,-53,#,76,#,-51,#,#,-93,3,#,-31,47,#,3,53,-81,33,4,#,-51,-44,-60,11,#,#,#,#,78,#,-35,-64,26,-81,-31,27,60,74,#,#,8,-38,47,12,-24,#,-59,-49,-11,-51,67,#,#,#,#,#,#,#,-67,#,-37,-19,10,-55,72,#,#,#,-70,17,-4,#,#,#,#,#,#,#,3,80,44,-88,-91,#,48,-90,-30,#,#,90,-34,37,#,#,73,-38,-31,-85,-31,-96,#,#,-18,67,34,72,#,-17,-77,#,56,-65,-88,-53,#,#,#,-33,86,#,81,-42,#,#,98,-40,70,-26,24,#,#,#,#,92,72,-27,#,#,#,#,#,#,-67,#,#,#,#,#,#,#,-54,-66,-36,#,-72,#,#,43,#,#,#,-92,-1,-98,#,#,#,#,#,#,#,39,-84,#,#,#,#,#,#,#,#,#,#,#,#,#,-93,#,#,#,98}	false	false
*/