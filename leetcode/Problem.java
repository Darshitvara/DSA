public class Problem {
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

