// 53. Maximum Subarray
// Solved
// Medium
// Topics
// Companies
// Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
public class Prblem53{
   public static void main(String x[]){
      Solution obj = new Solution();
      // int arr[] = {2,5,2,6,7,1};
      // int arr[] = {1};
      int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
      int result= obj.maxSubArray(arr);
      System.out.println(result);
   }
}

class Solution {
   public int maxSubArray(int[] nums) {

     int max = Integer.MIN_VALUE, i,sum=0;

     for(i = 0 ;i< nums.length; i++){
      sum += nums[i];

      if(sum > max) max = sum;

      if(sum < 0) sum  = 0;
     }
      return max;
   }
}

// class Solution {
//    public int maxSubArray(int[] nums) {

//       int i=0,j=0;
//       int arr[] = new int[nums.length];
//       int sum = 0;
      
//       for(i = 0 ; i< nums.length;i++){
//          arr[i] = sum + nums[i];
//          sum += nums[i] ;
//       }
      
//       int temp ,max = nums[0];

//       for(i = 1 ;i < nums.length;i++){
//          for(j = i ; j<nums.length ;j++){
//             temp = arr[j] - arr[i-1] ;
//             if(temp > max) max = temp;
//          }
//       }
//       return max;
//    }
// }