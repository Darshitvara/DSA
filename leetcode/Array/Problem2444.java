public class Problem2444 {
   public static void main(String x[]) {
      Solution obj = new Solution();
      // int arr[] = { 1, 1, 1, 1 };
      int arr[] = {1,3,5,2,7,5};
      System.out.println(obj.countSubarrays(arr, 1, 5));
   }
}
class Solution {
   public long countSubarrays(int[] nums, int minK, int maxK) {
      int counter = 0, i, j, min, max;

      for (i = 0; i < nums.length; i++) {
         min = nums[i];
         max = nums[i];
         for (j = i; j < nums.length; j++) {
            if (nums[j] <= min)
               min = nums[j];
            if (nums[j] >= max)
               max = nums[j];
            if (minK == min && max == maxK)
               counter++;
         }
         System.out.println();
      }

      return counter;
   }
}

// class Solution {
// public long countSubarrays(int[] nums, int minK, int maxK) {
// int counter = 0,i,j,k,min,max;

// for(i = 0 ; i< nums.length; i++){
// for(j = i ; j < nums.length; j++){
// // System.out.print(" " + nums[j]);
// min = nums[i];
// max = nums[i];
// for(k = i ; k <= j ; k++){
// if(nums[k] <= min) min = nums[k];
// if(nums[k] >= max) max = nums[k];

// // System.out.print("min : " + min);
// // System.out.print("max : " + max);
// }
// if(minK == min && max == maxK) counter++;
// }
// System.out.println();
// }

// return counter;
// }
// }