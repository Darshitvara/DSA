// 283. Move Zeroes
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]
 

// Constraints:

// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1
 
public class Problem283{
   public static void main(String x[]){
      Solution obj = new Solution();
        int arr[] = {0,1,0,3,120};
        obj.moveZeroes(arr);
   }
}
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int j = 0,i = 0,temp = 0;
//         while(i < nums.length){
//             if(nums[i] != 0){
//                 temp = nums[j];
//                 nums[j] = nums[i];
//                 nums[i] = temp;
//                 j++;
//             }
//             i++;
//         }

//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0,i = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                // temp = nums[j];
                // nums[j] = nums[i];
                // nums[i] = temp;
                // nums[j]= nums[j] + nums[i] - (nums[i] = nums[j]);
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
                j++;
            }
            i++;
        }
        for(int a : nums){
            System.out.println(a);
        }
    }
}