package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.RotateImageImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateImageTest {
    private RotateImage solution = new RotateImageImpl();

    @Test
    public void small01() {
        int[][] input = new int[2][2];
        input[0] = new int[]{1, 2};
        input[1] = new int[]{3, 4};

        int[][] expected = new int[2][2];
        expected[0] = new int[]{3, 1};
        expected[1] = new int[]{4, 2};

        solution.rotate(input);
        assertEquals(expected, input);
    }

    @Test
    public void large01() {
        int[][] input = new int[4][4];
        input[0] = new int[]{1, 2, 3, 4};
        input[1] = new int[]{5, 6, 7, 8};
        input[2] = new int[]{9, 10, 11, 12};
        input[3] = new int[]{13, 14, 15, 16};

        int[][] expected = new int[4][4];
        expected[0] = new int[]{13, 9, 5, 1};
        expected[1] = new int[]{14, 10, 6, 2};
        expected[2] = new int[]{15, 11, 7, 3};
        expected[3] = new int[]{16, 12, 8, 4};

        solution.rotate(input);
        assertEquals(expected, input);
    }

}

/*
Test cases
Input	 Output	 Expected
[[1]]	[[1]]	[[1]]
[[1,2],[3,4]]	[[3,1],[4,2]]	[[3,1],[4,2]]
[[1,2,3],[4,5,6],[7,8,9]]	[[7,4,1],[8,5,2],[9,6,3]]	[[7,4,1],[8,5,2],[9,6,3]]
[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]	[[13,9,5,1],[14,10,6,2],[15,11,7,3],[16,12,8,4]]	[[13,9,5,1],[14,10,6,2],[15,11,7,3],[16,12,8,4]]
[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]	[[21,16,11,6,1],[22,17,12,7,2],[23,18,13,8,3],[24,19,14,9,4],[25,20,15,10,5]]	[[21,16,11,6,1],[22,17,12,7,2],[23,18,13,8,3],[24,19,14,9,4],[25,20,15,10,5]]
[[2,29,20,26,16,28],[12,27,9,25,13,21],[32,33,32,2,28,14],[13,14,32,27,22,26],[33,1,20,7,21,7],[4,24,1,6,32,34]]	[[4,33,13,32,12,2],[24,1,14,33,27,29],[1,20,32,32,9,20],[6,7,27,2,25,26],[32,21,22,28,13,16],[34,7,26,14,21,28]]	[[4,33,13,32,12,2],[24,1,14,33,27,29],[1,20,32,32,9,20],[6,7,27,2,25,26],[32,21,22,28,13,16],[34,7,26,14,21,28]]
[[43,39,3,33,37,20,14],[9,18,9,-1,40,22,38],[14,42,3,23,12,14,32],[18,31,45,11,8,-1,31],[28,44,14,23,40,24,13],[29,45,33,45,20,0,45],[12,23,35,32,22,39,8]]	[[12,29,28,18,14,9,43],[23,45,44,31,42,18,39],[35,33,14,45,3,9,3],[32,45,23,11,23,-1,33],[22,20,40,8,12,40,37],[39,0,24,-1,14,22,20],[8,45,13,31,32,38,14]]	[[12,29,28,18,14,9,43],[23,45,44,31,42,18,39],[35,33,14,45,3,9,3],[32,45,23,11,23,-1,33],[22,20,40,8,12,40,37],[39,0,24,-1,14,22,20],[8,45,13,31,32,38,14]]
[[24,4,38,2,21,18,33,40],[24,37,25,62,37,15,35,36],[42,23,13,58,17,26,19,8],[32,48,9,58,36,18,40,61],[23,16,0,46,35,34,23,60],[9,49,60,47,1,32,20,45],[56,34,40,11,61,60,20,30],[45,30,25,18,49,3,16,10]]	[[45,56,9,23,32,42,24,24],[30,34,49,16,48,23,37,4],[25,40,60,0,9,13,25,38],[18,11,47,46,58,58,62,2],[49,61,1,35,36,17,37,21],[3,60,32,34,18,26,15,18],[16,20,20,23,40,19,35,33],[10,30,45,60,61,8,36,40]]	[[45,56,9,23,32,42,24,24],[30,34,49,16,48,23,37,4],[25,40,60,0,9,13,25,38],[18,11,47,46,58,58,62,2],[49,61,1,35,36,17,37,21],[3,60,32,34,18,26,15,18],[16,20,20,23,40,19,35,33],[10,30,45,60,61,8,36,40]]
[[16,49,27,12,54,13,2,69,8],[17,33,47,50,41,8,17,10,31],[29,30,20,39,59,25,21,79,35],[24,42,75,71,75,60,18,7,35],[48,26,24,58,60,75,25,30,36],[50,49,48,1,14,14,22,71,75],[48,28,9,3,69,68,15,61,63],[76,-1,6,31,49,50,73,43,30],[68,69,62,24,39,47,8,57,78]]	[[68,76,48,50,48,24,29,17,16],[69,-1,28,49,26,42,30,33,49],[62,6,9,48,24,75,20,47,27],[24,31,3,1,58,71,39,50,12],[39,49,69,14,60,75,59,41,54],[47,50,68,14,75,60,25,8,13],[8,73,15,22,25,18,21,17,2],[57,43,61,71,30,7,79,10,69],[78,30,63,75,36,35,35,31,8]]	[[68,76,48,50,48,24,29,17,16],[69,-1,28,49,26,42,30,33,49],[62,6,9,48,24,75,20,47,27],[24,31,3,1,58,71,39,50,12],[39,49,69,14,60,75,59,41,54],[47,50,68,14,75,60,25,8,13],[8,73,15,22,25,18,21,17,2],[57,43,61,71,30,7,79,10,69],[78,30,63,75,36,35,35,31,8]]
[[11,76,11,53,87,98,35,12,48,53],[33,6,96,29,39,67,16,52,88,54],[2,86,15,80,18,42,59,47,81,21],[74,93,51,86,47,39,85,36,4,34],[42,38,93,39,20,85,7,37,39,48],[92,42,36,9,75,7,4,35,55,86],[10,30,32,14,17,32,54,55,69,59],[42,13,50,37,5,71,23,66,62,15],[15,55,58,4,17,86,12,74,23,20],[13,86,51,46,1,21,80,8,77,2]]	[[13,15,42,10,92,42,74,2,33,11],[86,55,13,30,42,38,93,86,6,76],[51,58,50,32,36,93,51,15,96,11],[46,4,37,14,9,39,86,80,29,53],[1,17,5,17,75,20,47,18,39,87],[21,86,71,32,7,85,39,42,67,98],[80,12,23,54,4,7,85,59,16,35],[8,74,66,55,35,37,36,47,52,12],[77,23,62,69,55,39,4,81,88,48],[2,20,15,59,86,48,34,21,54,53]]	[[13,15,42,10,92,42,74,2,33,11],[86,55,13,30,42,38,93,86,6,76],[51,58,50,32,36,93,51,15,96,11],[46,4,37,14,9,39,86,80,29,53],[1,17,5,17,75,20,47,18,39,87],[21,86,71,32,7,85,39,42,67,98],[80,12,23,54,4,7,85,59,16,35],[8,74,66,55,35,37,36,47,52,12],[77,23,62,69,55,39,4,81,88,48],[2,20,15,59,86,48,34,21,54,53]]
[[105,113,49,43,87,45,-1,108,77,17,105],[118,92,111,92,21,43,90,14,102,102,15],[17,98,108,55,32,33,75,99,48,60,92],[99,14,90,55,14,110,43,33,5,41,36],[117,44,89,71,15,104,53,28,31,102,37],[19,68,70,53,23,50,12,84,53,112,99],[55,78,25,45,1,90,51,44,6,79,89],[6,31,15,112,116,44,54,99,83,74,47],[64,38,72,25,51,67,80,75,78,46,33],[104,92,36,74,54,112,112,44,112,29,76],[8,21,104,84,107,83,78,61,41,23,100]]	[[8,104,64,6,55,19,117,99,17,118,105],[21,92,38,31,78,68,44,14,98,92,113],[104,36,72,15,25,70,89,90,108,111,49],[84,74,25,112,45,53,71,55,55,92,43],[107,54,51,116,1,23,15,14,32,21,87],[83,112,67,44,90,50,104,110,33,43,45],[78,112,80,54,51,12,53,43,75,90,-1],[61,44,75,99,44,84,28,33,99,14,108],[41,112,78,83,6,53,31,5,48,102,77],[23,29,46,74,79,112,102,41,60,102,17],[100,76,33,47,89,99,37,36,92,15,105]]	[[8,104,64,6,55,19,117,99,17,118,105],[21,92,38,31,78,68,44,14,98,92,113],[104,36,72,15,25,70,89,90,108,111,49],[84,74,25,112,45,53,71,55,55,92,43],[107,54,51,116,1,23,15,14,32,21,87],[83,112,67,44,90,50,104,110,33,43,45],[78,112,80,54,51,12,53,43,75,90,-1],[61,44,75,99,44,84,28,33,99,14,108],[41,112,78,83,6,53,31,5,48,102,77],[23,29,46,74,79,112,102,41,60,102,17],[100,76,33,47,89,99,37,36,92,15,105]]
[[126,96,126,0,42,128,3,0,111,-1,66,37],[123,57,130,22,-1,12,53,40,106,57,51,20],[112,104,80,12,137,116,88,136,85,71,137,129],[56,13,2,41,13,70,79,137,0,83,32,16],[96,103,74,75,17,142,112,2,104,49,15,98],[22,105,91,109,49,102,111,123,116,114,21,131],[57,117,141,59,57,31,92,26,135,23,102,25],[39,72,44,0,122,61,115,18,39,79,128,89],[38,112,69,12,83,91,16,14,82,14,90,140],[62,39,40,70,80,-1,112,120,88,14,137,84],[76,109,103,116,45,104,78,101,73,21,130,29],[129,3,44,68,18,135,66,98,32,107,25,129]]	[[129,76,62,38,39,57,22,96,56,112,123,126],[3,109,39,112,72,117,105,103,13,104,57,96],[44,103,40,69,44,141,91,74,2,80,130,126],[68,116,70,12,0,59,109,75,41,12,22,0],[18,45,80,83,122,57,49,17,13,137,-1,42],[135,104,-1,91,61,31,102,142,70,116,12,128],[66,78,112,16,115,92,111,112,79,88,53,3],[98,101,120,14,18,26,123,2,137,136,40,0],[32,73,88,82,39,135,116,104,0,85,106,111],[107,21,14,14,79,23,114,49,83,71,57,-1],[25,130,137,90,128,102,21,15,32,137,51,66],[129,29,84,140,89,25,131,98,16,129,20,37]]	[[129,76,62,38,39,57,22,96,56,112,123,126],[3,109,39,112,72,117,105,103,13,104,57,96],[44,103,40,69,44,141,91,74,2,80,130,126],[68,116,70,12,0,59,109,75,41,12,22,0],[18,45,80,83,122,57,49,17,13,137,-1,42],[135,104,-1,91,61,31,102,142,70,116,12,128],[66,78,112,16,115,92,111,112,79,88,53,3],[98,101,120,14,18,26,123,2,137,136,40,0],[32,73,88,82,39,135,116,104,0,85,106,111],[107,21,14,14,79,23,114,49,83,71,57,-1],[25,130,137,90,128,102,21,15,32,137,51,66],[129,29,84,140,89,25,131,98,16,129,20,37]]
[[97,49,34,40,59,5,57,22,26,156,17,91,153],[89,108,147,96,57,-1,116,99,64,111,136,46,136],[112,83,131,5,126,89,83,161,130,143,167,47,25],[53,35,43,146,20,162,86,-1,90,145,27,66,104],[92,10,100,-1,6,72,83,167,79,70,88,22,63],[50,167,91,126,52,145,162,125,123,42,119,70,70],[41,47,98,109,11,51,148,113,51,14,17,163,13],[125,65,102,149,158,12,7,81,139,60,58,161,17],[42,35,137,113,106,39,20,65,8,32,145,157,5],[28,31,24,51,46,150,146,149,159,136,22,167,49],[162,88,136,156,106,10,51,104,152,18,3,4,84],[12,66,61,29,72,118,61,125,29,136,136,7,146],[127,3,0,155,81,22,75,78,10,41,117,91,5]]	[[127,12,162,28,42,125,41,50,92,53,112,89,97],[3,66,88,31,35,65,47,167,10,35,83,108,49],[0,61,136,24,137,102,98,91,100,43,131,147,34],[155,29,156,51,113,149,109,126,-1,146,5,96,40],[81,72,106,46,106,158,11,52,6,20,126,57,59],[22,118,10,150,39,12,51,145,72,162,89,-1,5],[75,61,51,146,20,7,148,162,83,86,83,116,57],[78,125,104,149,65,81,113,125,167,-1,161,99,22],[10,29,152,159,8,139,51,123,79,90,130,64,26],[41,136,18,136,32,60,14,42,70,145,143,111,156],[117,136,3,22,145,58,17,119,88,27,167,136,17],[91,7,4,167,157,161,163,70,22,66,47,46,91],[5,146,84,49,5,17,13,70,63,104,25,136,153]]	[[127,12,162,28,42,125,41,50,92,53,112,89,97],[3,66,88,31,35,65,47,167,10,35,83,108,49],[0,61,136,24,137,102,98,91,100,43,131,147,34],[155,29,156,51,113,149,109,126,-1,146,5,96,40],[81,72,106,46,106,158,11,52,6,20,126,57,59],[22,118,10,150,39,12,51,145,72,162,89,-1,5],[75,61,51,146,20,7,148,162,83,86,83,116,57],[78,125,104,149,65,81,113,125,167,-1,161,99,22],[10,29,152,159,8,139,51,123,79,90,130,64,26],[41,136,18,136,32,60,14,42,70,145,143,111,156],[117,136,3,22,145,58,17,119,88,27,167,136,17],[91,7,4,167,157,161,163,70,22,66,47,46,91],[5,146,84,49,5,17,13,70,63,104,25,136,153]]
[[10,151,33,143,165,11,13,28,69,159,194,16,108,53],[8,67,159,59,114,13,24,121,16,13,71,122,158,187],[85,160,147,52,116,181,1,86,194,167,71,24,131,26],[41,1,81,7,69,1,67,184,15,49,66,32,19,94],[111,134,87,154,100,39,11,21,177,13,65,132,138,93],[114,74,121,112,76,7,120,147,9,189,92,25,-1,116],[15,19,15,127,154,59,42,59,55,55,38,190,25,60],[83,164,154,2,0,80,116,77,44,41,181,10,187,35],[189,187,108,161,163,80,49,123,141,93,139,1,149,134],[148,131,-1,37,57,111,40,58,148,157,92,194,156,35],[161,104,71,111,97,180,77,21,65,128,145,163,178,46],[122,88,181,75,24,138,113,82,54,155,97,7,73,191],[158,186,31,81,96,59,193,150,44,76,172,66,161,79],[35,144,126,158,37,112,38,18,55,109,58,66,69,156]]	[[35,158,122,161,148,189,83,15,114,111,41,85,8,10],[144,186,88,104,131,187,164,19,74,134,1,160,67,151],[126,31,181,71,-1,108,154,15,121,87,81,147,159,33],[158,81,75,111,37,161,2,127,112,154,7,52,59,143],[37,96,24,97,57,163,0,154,76,100,69,116,114,165],[112,59,138,180,111,80,80,59,7,39,1,181,13,11],[38,193,113,77,40,49,116,42,120,11,67,1,24,13],[18,150,82,21,58,123,77,59,147,21,184,86,121,28],[55,44,54,65,148,141,44,55,9,177,15,194,16,69],[109,76,155,128,157,93,41,55,189,13,49,167,13,159],[58,172,97,145,92,139,181,38,92,65,66,71,71,194],[66,66,7,163,194,1,10,190,25,132,32,24,122,16],[69,161,73,178,156,149,187,25,-1,138,19,131,158,108],[156,79,191,46,35,134,35,60,116,93,94,26,187,53]]	[[35,158,122,161,148,189,83,15,114,111,41,85,8,10],[144,186,88,104,131,187,164,19,74,134,1,160,67,151],[126,31,181,71,-1,108,154,15,121,87,81,147,159,33],[158,81,75,111,37,161,2,127,112,154,7,52,59,143],[37,96,24,97,57,163,0,154,76,100,69,116,114,165],[112,59,138,180,111,80,80,59,7,39,1,181,13,11],[38,193,113,77,40,49,116,42,120,11,67,1,24,13],[18,150,82,21,58,123,77,59,147,21,184,86,121,28],[55,44,54,65,148,141,44,55,9,177,15,194,16,69],[109,76,155,128,157,93,41,55,189,13,49,167,13,159],[58,172,97,145,92,139,181,38,92,65,66,71,71,194],[66,66,7,163,194,1,10,190,25,132,32,24,122,16],[69,161,73,178,156,149,187,25,-1,138,19,131,158,108],[156,79,191,46,35,134,35,60,116,93,94,26,187,53]]
[[88,122,47,25,25,106,88,149,145,8,173,197,98,124,152],[175,206,145,53,141,2,157,103,216,35,206,18,95,69,16],[90,159,140,138,12,166,72,101,144,218,111,145,192,37,45],[172,214,27,93,95,222,97,80,153,141,117,187,212,40,33],[4,131,20,145,97,85,140,170,187,112,165,126,33,185,165],[131,133,207,160,54,130,210,152,211,139,69,156,102,57,198],[188,115,105,209,88,204,70,4,202,86,169,195,213,203,156],[206,111,117,16,99,173,147,85,153,187,52,51,119,207,109],[93,172,52,27,209,142,59,108,147,37,195,93,9,11,124],[218,46,63,164,63,163,165,39,76,94,2,181,146,174,165],[84,96,165,137,124,150,55,184,34,31,49,57,177,111,70],[129,158,169,194,150,8,185,91,100,90,13,155,47,213,106],[40,73,30,206,38,155,185,147,167,220,6,44,106,184,157],[4,141,143,174,111,69,10,125,161,112,216,2,95,91,216],[29,185,117,60,167,157,216,128,80,211,177,139,32,111,151]]	[[29,4,40,129,84,218,93,206,188,131,4,172,90,175,88],[185,141,73,158,96,46,172,111,115,133,131,214,159,206,122],[117,143,30,169,165,63,52,117,105,207,20,27,140,145,47],[60,174,206,194,137,164,27,16,209,160,145,93,138,53,25],[167,111,38,150,124,63,209,99,88,54,97,95,12,141,25],[157,69,155,8,150,163,142,173,204,130,85,222,166,2,106],[216,10,185,185,55,165,59,147,70,210,140,97,72,157,88],[128,125,147,91,184,39,108,85,4,152,170,80,101,103,149],[80,161,167,100,34,76,147,153,202,211,187,153,144,216,145],[211,112,220,90,31,94,37,187,86,139,112,141,218,35,8],[177,216,6,13,49,2,195,52,169,69,165,117,111,206,173],[139,2,44,155,57,181,93,51,195,156,126,187,145,18,197],[32,95,106,47,177,146,9,119,213,102,33,212,192,95,98],[111,91,184,213,111,174,11,207,203,57,185,40,37,69,124],[151,216,157,106,70,165,124,109,156,198,165,33,45,16,152]]	[[29,4,40,129,84,218,93,206,188,131,4,172,90,175,88],[185,141,73,158,96,46,172,111,115,133,131,214,159,206,122],[117,143,30,169,165,63,52,117,105,207,20,27,140,145,47],[60,174,206,194,137,164,27,16,209,160,145,93,138,53,25],[167,111,38,150,124,63,209,99,88,54,97,95,12,141,25],[157,69,155,8,150,163,142,173,204,130,85,222,166,2,106],[216,10,185,185,55,165,59,147,70,210,140,97,72,157,88],[128,125,147,91,184,39,108,85,4,152,170,80,101,103,149],[80,161,167,100,34,76,147,153,202,211,187,153,144,216,145],[211,112,220,90,31,94,37,187,86,139,112,141,218,35,8],[177,216,6,13,49,2,195,52,169,69,165,117,111,206,173],[139,2,44,155,57,181,93,51,195,156,126,187,145,18,197],[32,95,106,47,177,146,9,119,213,102,33,212,192,95,98],[111,91,184,213,111,174,11,207,203,57,185,40,37,69,124],[151,216,157,106,70,165,124,109,156,198,165,33,45,16,152]]
[[201,219,221,161,16,152,209,204,194,167,75,35,69,97,23,80],[159,213,129,135,97,86,102,218,244,177,36,217,72,89,24,18],[53,247,180,70,144,134,20,83,46,96,119,116,194,143,197,99],[102,72,235,200,159,82,163,149,4,201,111,77,35,137,96,90],[129,21,161,18,156,182,102,203,24,222,65,219,110,7,63,213],[80,43,158,241,127,67,135,132,13,247,211,49,129,52,140,3],[75,47,22,232,230,125,181,-1,92,247,220,204,-1,28,162,81],[73,66,67,201,134,203,78,148,195,34,198,70,88,84,74,164],[132,98,141,107,224,67,108,62,59,73,11,60,102,174,142,176],[241,210,122,120,158,202,13,98,237,213,169,70,42,245,235,175],[88,122,27,57,190,136,120,251,210,132,56,58,52,199,235,38],[154,103,160,57,50,174,156,32,132,71,104,175,61,84,95,150],[207,124,208,143,5,74,139,217,207,196,20,4,140,0,44,39],[104,205,97,155,124,254,189,2,70,38,178,132,123,19,27,76],[144,237,220,150,56,104,112,8,45,133,14,186,135,59,226,240],[9,68,141,134,67,75,137,139,114,61,16,238,81,45,59,226]]	[[9,144,104,207,154,88,241,132,73,75,80,129,102,53,159,201],[68,237,205,124,103,122,210,98,66,47,43,21,72,247,213,219],[141,220,97,208,160,27,122,141,67,22,158,161,235,180,129,221],[134,150,155,143,57,57,120,107,201,232,241,18,200,70,135,161],[67,56,124,5,50,190,158,224,134,230,127,156,159,144,97,16],[75,104,254,74,174,136,202,67,203,125,67,182,82,134,86,152],[137,112,189,139,156,120,13,108,78,181,135,102,163,20,102,209],[139,8,2,217,32,251,98,62,148,-1,132,203,149,83,218,204],[114,45,70,207,132,210,237,59,195,92,13,24,4,46,244,194],[61,133,38,196,71,132,213,73,34,247,247,222,201,96,177,167],[16,14,178,20,104,56,169,11,198,220,211,65,111,119,36,75],[238,186,132,4,175,58,70,60,70,204,49,219,77,116,217,35],[81,135,123,140,61,52,42,102,88,-1,129,110,35,194,72,69],[45,59,19,0,84,199,245,174,84,28,52,7,137,143,89,97],[59,226,27,44,95,235,235,142,74,162,140,63,96,197,24,23],[226,240,76,39,150,38,175,176,164,81,3,213,90,99,18,80]]	[[9,144,104,207,154,88,241,132,73,75,80,129,102,53,159,201],[68,237,205,124,103,122,210,98,66,47,43,21,72,247,213,219],[141,220,97,208,160,27,122,141,67,22,158,161,235,180,129,221],[134,150,155,143,57,57,120,107,201,232,241,18,200,70,135,161],[67,56,124,5,50,190,158,224,134,230,127,156,159,144,97,16],[75,104,254,74,174,136,202,67,203,125,67,182,82,134,86,152],[137,112,189,139,156,120,13,108,78,181,135,102,163,20,102,209],[139,8,2,217,32,251,98,62,148,-1,132,203,149,83,218,204],[114,45,70,207,132,210,237,59,195,92,13,24,4,46,244,194],[61,133,38,196,71,132,213,73,34,247,247,222,201,96,177,167],[16,14,178,20,104,56,169,11,198,220,211,65,111,119,36,75],[238,186,132,4,175,58,70,60,70,204,49,219,77,116,217,35],[81,135,123,140,61,52,42,102,88,-1,129,110,35,194,72,69],[45,59,19,0,84,199,245,174,84,28,52,7,137,143,89,97],[59,226,27,44,95,235,235,142,74,162,140,63,96,197,24,23],[226,240,76,39,150,38,175,176,164,81,3,213,90,99,18,80]]
[[200,137,251,15,178,159,11,65,269,202,77,183,49,78,224,184,163],[169,29,198,172,8,263,51,135,48,200,41,42,115,18,166,176,194],[182,67,65,118,133,258,32,135,154,6,137,13,191,13,183,144,135],[67,154,110,42,213,82,166,179,126,282,121,216,171,27,34,162,16],[153,7,276,109,66,65,116,205,79,232,219,263,88,278,254,166,100],[220,92,183,98,272,233,16,28,85,188,269,120,274,209,197,205,120],[18,273,186,59,190,189,3,44,164,92,34,53,260,58,274,276,165],[8,183,34,25,212,120,137,193,164,123,115,285,40,236,15,25,58],[75,139,248,79,107,48,96,142,102,68,124,12,268,2,21,163,37],[259,87,81,108,282,246,232,32,243,196,269,182,146,251,182,286,212],[185,106,261,282,172,287,274,9,11,254,12,245,129,262,139,141,55],[248,58,225,115,91,180,236,284,286,94,248,180,92,172,1,122,68],[284,219,67,194,229,3,83,165,172,137,139,24,279,118,196,49,55],[24,141,159,261,60,157,279,20,262,83,116,264,130,185,183,61,177],[89,214,104,97,91,277,235,154,225,226,273,134,276,40,82,52,200],[267,113,69,258,58,43,265,98,231,107,208,127,92,97,140,18,202],[238,110,114,185,265,264,46,250,33,246,214,116,222,126,18,48,120]]	[[238,267,89,24,284,248,185,259,75,8,18,220,153,67,182,169,200],[110,113,214,141,219,58,106,87,139,183,273,92,7,154,67,29,137],[114,69,104,159,67,225,261,81,248,34,186,183,276,110,65,198,251],[185,258,97,261,194,115,282,108,79,25,59,98,109,42,118,172,15],[265,58,91,60,229,91,172,282,107,212,190,272,66,213,133,8,178],[264,43,277,157,3,180,287,246,48,120,189,233,65,82,258,263,159],[46,265,235,279,83,236,274,232,96,137,3,16,116,166,32,51,11],[250,98,154,20,165,284,9,32,142,193,44,28,205,179,135,135,65],[33,231,225,262,172,286,11,243,102,164,164,85,79,126,154,48,269],[246,107,226,83,137,94,254,196,68,123,92,188,232,282,6,200,202],[214,208,273,116,139,248,12,269,124,115,34,269,219,121,137,41,77],[116,127,134,264,24,180,245,182,12,285,53,120,263,216,13,42,183],[222,92,276,130,279,92,129,146,268,40,260,274,88,171,191,115,49],[126,97,40,185,118,172,262,251,2,236,58,209,278,27,13,18,78],[18,140,82,183,196,1,139,182,21,15,274,197,254,34,183,166,224],[48,18,52,61,49,122,141,286,163,25,276,205,166,162,144,176,184],[120,202,200,177,55,68,55,212,37,58,165,120,100,16,135,194,163]]	[[238,267,89,24,284,248,185,259,75,8,18,220,153,67,182,169,200],[110,113,214,141,219,58,106,87,139,183,273,92,7,154,67,29,137],[114,69,104,159,67,225,261,81,248,34,186,183,276,110,65,198,251],[185,258,97,261,194,115,282,108,79,25,59,98,109,42,118,172,15],[265,58,91,60,229,91,172,282,107,212,190,272,66,213,133,8,178],[264,43,277,157,3,180,287,246,48,120,189,233,65,82,258,263,159],[46,265,235,279,83,236,274,232,96,137,3,16,116,166,32,51,11],[250,98,154,20,165,284,9,32,142,193,44,28,205,179,135,135,65],[33,231,225,262,172,286,11,243,102,164,164,85,79,126,154,48,269],[246,107,226,83,137,94,254,196,68,123,92,188,232,282,6,200,202],[214,208,273,116,139,248,12,269,124,115,34,269,219,121,137,41,77],[116,127,134,264,24,180,245,182,12,285,53,120,263,216,13,42,183],[222,92,276,130,279,92,129,146,268,40,260,274,88,171,191,115,49],[126,97,40,185,118,172,262,251,2,236,58,209,278,27,13,18,78],[18,140,82,183,196,1,139,182,21,15,274,197,254,34,183,166,224],[48,18,52,61,49,122,141,286,163,25,276,205,166,162,144,176,184],[120,202,200,177,55,68,55,212,37,58,165,120,100,16,135,194,163]]
[[187,218,24,110,182,69,59,269,1,232,167,278,37,54,219,16,158,122],[3,255,202,285,143,205,211,159,311,141,115,143,66,319,54,92,106,237],[178,182,200,180,92,44,135,146,100,47,163,275,171,167,207,50,130,43],[256,18,203,244,176,319,80,244,7,151,29,114,66,208,298,283,81,83],[4,217,230,121,266,70,73,130,255,297,181,62,17,130,97,237,68,274],[249,165,211,257,318,241,65,77,142,56,37,224,140,58,135,47,181,94],[134,271,225,66,246,99,129,280,246,243,211,7,195,137,174,83,88,185],[2,154,263,161,211,317,63,28,68,199,92,266,310,227,215,212,311,154],[4,133,127,251,54,15,260,250,170,127,10,259,313,29,90,269,192,302],[279,272,7,24,164,116,308,151,20,200,56,24,47,61,159,175,5,214],[208,282,141,55,86,168,315,76,199,82,38,84,77,318,33,101,36,214],[218,21,58,255,238,115,281,286,193,117,154,215,8,55,175,166,111,262],[11,119,32,227,218,87,312,296,83,38,74,136,269,293,174,4,226,89],[120,200,68,6,318,239,223,19,296,75,186,84,30,214,221,79,119,116],[168,124,90,268,164,181,81,126,152,256,132,71,38,269,288,107,277,283],[23,193,303,12,269,182,98,316,73,12,73,193,129,242,319,220,203,176],[95,285,303,248,234,128,12,289,75,301,89,45,277,129,239,273,143,201],[132,258,194,206,271,284,93,77,219,105,315,99,282,87,77,278,28,4]]	[[132,95,23,168,120,11,218,208,279,4,2,134,249,4,256,178,3,187],[258,285,193,124,200,119,21,282,272,133,154,271,165,217,18,182,255,218],[194,303,303,90,68,32,58,141,7,127,263,225,211,230,203,200,202,24],[206,248,12,268,6,227,255,55,24,251,161,66,257,121,244,180,285,110],[271,234,269,164,318,218,238,86,164,54,211,246,318,266,176,92,143,182],[284,128,182,181,239,87,115,168,116,15,317,99,241,70,319,44,205,69],[93,12,98,81,223,312,281,315,308,260,63,129,65,73,80,135,211,59],[77,289,316,126,19,296,286,76,151,250,28,280,77,130,244,146,159,269],[219,75,73,152,296,83,193,199,20,170,68,246,142,255,7,100,311,1],[105,301,12,256,75,38,117,82,200,127,199,243,56,297,151,47,141,232],[315,89,73,132,186,74,154,38,56,10,92,211,37,181,29,163,115,167],[99,45,193,71,84,136,215,84,24,259,266,7,224,62,114,275,143,278],[282,277,129,38,30,269,8,77,47,313,310,195,140,17,66,171,66,37],[87,129,242,269,214,293,55,318,61,29,227,137,58,130,208,167,319,54],[77,239,319,288,221,174,175,33,159,90,215,174,135,97,298,207,54,219],[278,273,220,107,79,4,166,101,175,269,212,83,47,237,283,50,92,16],[28,143,203,277,119,226,111,36,5,192,311,88,181,68,81,130,106,158],[4,201,176,283,116,89,262,214,214,302,154,185,94,274,83,43,237,122]]	[[132,95,23,168,120,11,218,208,279,4,2,134,249,4,256,178,3,187],[258,285,193,124,200,119,21,282,272,133,154,271,165,217,18,182,255,218],[194,303,303,90,68,32,58,141,7,127,263,225,211,230,203,200,202,24],[206,248,12,268,6,227,255,55,24,251,161,66,257,121,244,180,285,110],[271,234,269,164,318,218,238,86,164,54,211,246,318,266,176,92,143,182],[284,128,182,181,239,87,115,168,116,15,317,99,241,70,319,44,205,69],[93,12,98,81,223,312,281,315,308,260,63,129,65,73,80,135,211,59],[77,289,316,126,19,296,286,76,151,250,28,280,77,130,244,146,159,269],[219,75,73,152,296,83,193,199,20,170,68,246,142,255,7,100,311,1],[105,301,12,256,75,38,117,82,200,127,199,243,56,297,151,47,141,232],[315,89,73,132,186,74,154,38,56,10,92,211,37,181,29,163,115,167],[99,45,193,71,84,136,215,84,24,259,266,7,224,62,114,275,143,278],[282,277,129,38,30,269,8,77,47,313,310,195,140,17,66,171,66,37],[87,129,242,269,214,293,55,318,61,29,227,137,58,130,208,167,319,54],[77,239,319,288,221,174,175,33,159,90,215,174,135,97,298,207,54,219],[278,273,220,107,79,4,166,101,175,269,212,83,47,237,283,50,92,16],[28,143,203,277,119,226,111,36,5,192,311,88,181,68,81,130,106,158],[4,201,176,283,116,89,262,214,214,302,154,185,94,274,83,43,237,122]]
[[136,345,335,162,138,204,16,93,323,40,355,189,270,146,345,300,311,179,77],[70,223,267,9,125,125,211,304,231,166,148,231,303,133,206,45,212,51,2],[246,14,43,241,144,254,328,129,134,280,249,212,291,52,120,302,119,186,93],[63,57,260,153,289,203,227,136,249,20,128,192,267,83,236,89,228,130,57],[298,206,278,127,359,210,180,59,92,300,246,126,305,245,27,98,174,171,326],[251,1,287,19,194,195,43,11,285,272,82,283,150,289,142,278,289,293,99],[349,25,340,176,92,285,61,120,324,176,233,231,68,175,158,28,9,354,73],[21,219,286,105,83,77,335,226,356,204,159,35,194,125,16,311,218,242,12],[280,207,189,153,78,198,329,237,228,279,172,242,242,332,168,288,55,246,263],[282,243,108,21,219,243,147,176,194,6,59,147,287,207,337,20,226,176,350],[43,345,209,216,227,91,129,35,19,185,283,224,48,106,333,10,326,156,159],[143,351,106,143,78,334,351,55,355,157,172,285,201,157,134,58,325,167,128],[1,187,314,225,51,303,272,325,315,238,121,54,322,52,161,45,131,135,337],[128,70,134,241,296,337,39,70,336,305,178,104,307,6,359,172,359,303,84],[265,198,264,327,253,166,20,355,153,92,70,130,161,141,266,43,77,183,23],[88,99,329,268,144,217,215,143,330,154,26,356,59,225,200,27,58,6,349],[53,160,21,64,232,124,206,78,168,224,262,132,254,302,41,102,86,259,258],[230,170,52,198,166,53,3,6,81,63,314,10,57,55,333,63,288,97,270],[6,206,75,209,339,270,91,322,12,178,161,211,349,332,204,187,138,258,192]]	[[6,230,53,88,265,128,1,143,43,282,280,21,349,251,298,63,246,70,136],[206,170,160,99,198,70,187,351,345,243,207,219,25,1,206,57,14,223,345],[75,52,21,329,264,134,314,106,209,108,189,286,340,287,278,260,43,267,335],[209,198,64,268,327,241,225,143,216,21,153,105,176,19,127,153,241,9,162],[339,166,232,144,253,296,51,78,227,219,78,83,92,194,359,289,144,125,138],[270,53,124,217,166,337,303,334,91,243,198,77,285,195,210,203,254,125,204],[91,3,206,215,20,39,272,351,129,147,329,335,61,43,180,227,328,211,16],[322,6,78,143,355,70,325,55,35,176,237,226,120,11,59,136,129,304,93],[12,81,168,330,153,336,315,355,19,194,228,356,324,285,92,249,134,231,323],[178,63,224,154,92,305,238,157,185,6,279,204,176,272,300,20,280,166,40],[161,314,262,26,70,178,121,172,283,59,172,159,233,82,246,128,249,148,355],[211,10,132,356,130,104,54,285,224,147,242,35,231,283,126,192,212,231,189],[349,57,254,59,161,307,322,201,48,287,242,194,68,150,305,267,291,303,270],[332,55,302,225,141,6,52,157,106,207,332,125,175,289,245,83,52,133,146],[204,333,41,200,266,359,161,134,333,337,168,16,158,142,27,236,120,206,345],[187,63,102,27,43,172,45,58,10,20,288,311,28,278,98,89,302,45,300],[138,288,86,58,77,359,131,325,326,226,55,218,9,289,174,228,119,212,311],[258,97,259,6,183,303,135,167,156,176,246,242,354,293,171,130,186,51,179],[192,270,258,349,23,84,337,128,159,350,263,12,73,99,326,57,93,2,77]]	[[6,230,53,88,265,128,1,143,43,282,280,21,349,251,298,63,246,70,136],[206,170,160,99,198,70,187,351,345,243,207,219,25,1,206,57,14,223,345],[75,52,21,329,264,134,314,106,209,108,189,286,340,287,278,260,43,267,335],[209,198,64,268,327,241,225,143,216,21,153,105,176,19,127,153,241,9,162],[339,166,232,144,253,296,51,78,227,219,78,83,92,194,359,289,144,125,138],[270,53,124,217,166,337,303,334,91,243,198,77,285,195,210,203,254,125,204],[91,3,206,215,20,39,272,351,129,147,329,335,61,43,180,227,328,211,16],[322,6,78,143,355,70,325,55,35,176,237,226,120,11,59,136,129,304,93],[12,81,168,330,153,336,315,355,19,194,228,356,324,285,92,249,134,231,323],[178,63,224,154,92,305,238,157,185,6,279,204,176,272,300,20,280,166,40],[161,314,262,26,70,178,121,172,283,59,172,159,233,82,246,128,249,148,355],[211,10,132,356,130,104,54,285,224,147,242,35,231,283,126,192,212,231,189],[349,57,254,59,161,307,322,201,48,287,242,194,68,150,305,267,291,303,270],[332,55,302,225,141,6,52,157,106,207,332,125,175,289,245,83,52,133,146],[204,333,41,200,266,359,161,134,333,337,168,16,158,142,27,236,120,206,345],[187,63,102,27,43,172,45,58,10,20,288,311,28,278,98,89,302,45,300],[138,288,86,58,77,359,131,325,326,226,55,218,9,289,174,228,119,212,311],[258,97,259,6,183,303,135,167,156,176,246,242,354,293,171,130,186,51,179],[192,270,258,349,23,84,337,128,159,350,263,12,73,99,326,57,93,2,77]]
[[119,251,59,392,342,74,185,114,257,267,361,211,243,272,108,60,350,147,224,212],[207,1,150,349,211,155,116,30,177,71,321,297,324,381,242,219,8,28,334,267],[296,249,79,140,74,140,154,377,288,379,142,48,333,293,350,145,49,67,176,227],[140,50,77,17,385,320,237,394,301,125,262,151,375,294,244,2,35,-1,380,277],[379,123,278,265,17,230,11,67,298,140,247,39,192,325,9,178,198,248,173,100],[374,389,252,302,284,98,305,273,50,286,151,383,10,30,249,28,213,262,48,113],[3,248,105,148,174,116,327,325,365,54,26,292,44,232,195,281,283,101,155,334],[388,259,318,351,243,169,332,57,384,381,123,340,182,230,90,309,299,18,235,217],[25,214,110,70,47,306,305,283,8,13,219,349,226,90,253,70,212,186,80,197],[120,157,139,303,340,182,213,240,153,49,58,180,216,121,203,265,28,109,101,389],[124,321,291,351,365,145,374,178,332,7,377,5,165,69,309,106,204,75,299,358],[77,310,139,294,32,344,112,61,6,215,3,131,89,295,35,55,393,362,187,278],[371,165,284,89,187,146,197,392,174,49,351,252,361,44,100,394,341,213,9,348],[381,13,33,72,262,21,80,256,385,268,136,309,386,373,-1,126,121,149,119,296],[200,24,102,114,21,203,109,363,369,71,264,352,86,298,377,301,273,58,158,259],[280,247,121,219,222,121,347,296,224,19,193,25,396,248,140,18,52,202,334,23],[275,200,376,314,51,354,216,325,365,327,137,198,176,259,19,351,334,367,248,159],[387,394,137,385,244,230,356,297,33,292,273,309,45,202,176,49,109,393,328,28],[322,66,227,51,279,247,3,214,215,252,326,156,247,64,142,92,295,51,343,281],[344,169,144,342,373,321,393,35,268,322,64,143,389,293,195,221,93,151,388,310]]	[[344,322,387,275,280,200,381,371,77,124,120,25,388,3,374,379,140,296,207,119],[169,66,394,200,247,24,13,165,310,321,157,214,259,248,389,123,50,249,1,251],[144,227,137,376,121,102,33,284,139,291,139,110,318,105,252,278,77,79,150,59],[342,51,385,314,219,114,72,89,294,351,303,70,351,148,302,265,17,140,349,392],[373,279,244,51,222,21,262,187,32,365,340,47,243,174,284,17,385,74,211,342],[321,247,230,354,121,203,21,146,344,145,182,306,169,116,98,230,320,140,155,74],[393,3,356,216,347,109,80,197,112,374,213,305,332,327,305,11,237,154,116,185],[35,214,297,325,296,363,256,392,61,178,240,283,57,325,273,67,394,377,30,114],[268,215,33,365,224,369,385,174,6,332,153,8,384,365,50,298,301,288,177,257],[322,252,292,327,19,71,268,49,215,7,49,13,381,54,286,140,125,379,71,267],[64,326,273,137,193,264,136,351,3,377,58,219,123,26,151,247,262,142,321,361],[143,156,309,198,25,352,309,252,131,5,180,349,340,292,383,39,151,48,297,211],[389,247,45,176,396,86,386,361,89,165,216,226,182,44,10,192,375,333,324,243],[293,64,202,259,248,298,373,44,295,69,121,90,230,232,30,325,294,293,381,272],[195,142,176,19,140,377,-1,100,35,309,203,253,90,195,249,9,244,350,242,108],[221,92,49,351,18,301,126,394,55,106,265,70,309,281,28,178,2,145,219,60],[93,295,109,334,52,273,121,341,393,204,28,212,299,283,213,198,35,49,8,350],[151,51,393,367,202,58,149,213,362,75,109,186,18,101,262,248,-1,67,28,147],[388,343,328,248,334,158,119,9,187,299,101,80,235,155,48,173,380,176,334,224],[310,281,28,159,23,259,296,348,278,358,389,197,217,334,113,100,277,227,267,212]]	[[344,322,387,275,280,200,381,371,77,124,120,25,388,3,374,379,140,296,207,119],[169,66,394,200,247,24,13,165,310,321,157,214,259,248,389,123,50,249,1,251],[144,227,137,376,121,102,33,284,139,291,139,110,318,105,252,278,77,79,150,59],[342,51,385,314,219,114,72,89,294,351,303,70,351,148,302,265,17,140,349,392],[373,279,244,51,222,21,262,187,32,365,340,47,243,174,284,17,385,74,211,342],[321,247,230,354,121,203,21,146,344,145,182,306,169,116,98,230,320,140,155,74],[393,3,356,216,347,109,80,197,112,374,213,305,332,327,305,11,237,154,116,185],[35,214,297,325,296,363,256,392,61,178,240,283,57,325,273,67,394,377,30,114],[268,215,33,365,224,369,385,174,6,332,153,8,384,365,50,298,301,288,177,257],[322,252,292,327,19,71,268,49,215,7,49,13,381,54,286,140,125,379,71,267],[64,326,273,137,193,264,136,351,3,377,58,219,123,26,151,247,262,142,321,361],[143,156,309,198,25,352,309,252,131,5,180,349,340,292,383,39,151,48,297,211],[389,247,45,176,396,86,386,361,89,165,216,226,182,44,10,192,375,333,324,243],[293,64,202,259,248,298,373,44,295,69,121,90,230,232,30,325,294,293,381,272],[195,142,176,19,140,377,-1,100,35,309,203,253,90,195,249,9,244,350,242,108],[221,92,49,351,18,301,126,394,55,106,265,70,309,281,28,178,2,145,219,60],[93,295,109,334,52,273,121,341,393,204,28,212,299,283,213,198,35,49,8,350],[151,51,393,367,202,58,149,213,362,75,109,186,18,101,262,248,-1,67,28,147],[388,343,328,248,334,158,119,9,187,299,101,80,235,155,48,173,380,176,334,224],[310,281,28,159,23,259,296,348,278,358,389,197,217,334,113,100,277,227,267,212]]
*/