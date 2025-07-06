// 75. Sort Colors
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.

public class Solution75{
   public static void main(String x[]){
      Solution obj = new Solution();
      int a[] = {2,0,2,1,1,0};
      obj.sortColors(a);
      for(int i = 0 ; i< a.length;i++){
         System.out.println(a[i]);
      }
   }
}

class Solution {
   public void sortColors(int[] nums) {
       int zeroCount  = 0;
       int oneCount = 0;
      //  int twoCount = 0;

       for(int e : nums){
           if(e == 0) zeroCount++;
           else if(e == 1) oneCount++;
       }
       for(int i = 0 ;i<nums.length;i++){
           if(zeroCount > 0){
               nums[i] = 0;
               zeroCount--;
           }else if(oneCount > 0 ){
               nums[i] = 1;
               oneCount--;
           }else{
               nums[i] =2 ;
           }
       }
       
   }
}