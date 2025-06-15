public class Problem22 {
   public static void main(String x[]) {
      int arr[] = { -4, -2, 1, 4, 8 };
      Solution ob = new Solution();
      int n = ob.findClosestNumber(arr);
      System.out.println(n);
   }
}

class Solution {
   public int findClosestNumber(int[] nums) {
      int closeToZero = 0;
      int dist,minDist = (nums[0] > 0)? nums[0]: nums[0]*(-1);

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] < 0)
            dist= nums[i] * (-1);
         else
            dist= nums[i];
         if (dist< minDist) {
            closeToZero = i;
            minDist = dist;
         }
      }
      return nums[closeToZero];
   }
}