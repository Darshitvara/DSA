public class Problem152{
   public static void main(String x[]){
      Solution obj = new Solution();
      // int arr[] = {0,2};
      int arr[] = {-3,6,2,-2,9,2,5-1};
      // int arr[] = {2,3,-2,4};
      int result = obj.maxProduct(arr);
      System.out.println(result);
   }
}

class Solution {
   public int maxProduct(int[] nums) {
         int result = Integer.MIN_VALUE ,n = nums.length;
         int prefix = 1, suffix = 1;
         
         for(int i = 0 ; i < nums.length ; i++){

            prefix *= nums[i] ;
            suffix *= nums[n-i-1];

            result = Integer.max( result, Integer.max(prefix, suffix));

            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
         }
         return result;
   }
}