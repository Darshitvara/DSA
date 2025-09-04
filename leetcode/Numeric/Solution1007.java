package Numeric;
// 1007. Minimum Domino Rotations For Equal Row
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// In a row of dominoes, tops[i] and bottoms[i] represent the top and bottom halves of the ith domino. (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)

// We may rotate the ith domino, so that tops[i] and bottoms[i] swap values.

// Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same.

// If it cannot be done, return -1.

 

// Example 1:


// Input: tops = [2,1,2,4,2,2], bottoms = [5,2,6,2,3,2]
// Output: 2
// Explanation: 
// The first figure represents the dominoes as given by tops and bottoms: before we do any rotations.
// If we rotate the second and fourth dominoes, we can make every value in the top row equal to 2, as indicated by the second figure.
// Example 2:

// Input: tops = [3,5,1,2,3], bottoms = [3,6,3,3,4]
// Output: -1
// Explanation: 
// In this case, it is not possible to rotate the dominoes to make one row of values equal.
 

// Constraints:

// 2 <= tops.length <= 2 * 104
// bottoms.length == tops.length
// 1 <= tops[i], bottoms[i] <= 6

public class Problem1007 {
   public static void main(String x[]) {
      Solution obj = new Solution();
      int tops[] = { 2, 1, 2, 4, 2, 2 };
      int bots[] = { 5, 2, 6, 2, 3, 2 };
      // int tops[] = { 1, 1, 1, 1, 1, 1 };
      // int bots[] = { 1, 1, 1, 1, 1, 1 };
      int result = obj.minDominoRotations(tops, bots);
      System.out.println(result);
   }

}

// class Solution {
//    public int minDominoRotations(int[] tops, int[] bottoms) {
//       int rotations;
//       for (int i = 0; i < tops.length; i++) {
//          int flag = 1;
//          rotations = 0;
//          for (int j = 0; j < tops.length; j++) {
//             if (tops[i] == tops[j]) {
//             } else if (tops[i] == bottoms[j]) {
//                rotations++;
//             } else {
//                flag = 0;
//                break;
//             }
//          }
//          if (flag == 1) {
//             return rotations;
//          }
//       }
//       return -1;
//    }
// }

 class Solution {
   public int minDominoRotations(int[] tops, int[] bottoms) {
       int result = Math.min(
           check(tops[0], tops, bottoms),
           check(bottoms[0], tops, bottoms)
       );
       return result == Integer.MAX_VALUE ? -1 : result;
   }

   private int check(int target, int[] tops, int[] bottoms) {
       int topRotations = 0;
       int bottomRotations = 0;

       for (int i = 0; i < tops.length; i++) {
           if (tops[i] != target && bottoms[i] != target) {
               return Integer.MAX_VALUE; // Not possible
           } else if (tops[i] != target) {
               topRotations++;
           } else if (bottoms[i] != target) {
               bottomRotations++;
           }
       }

       return Math.min(topRotations, bottomRotations);
   }
}

