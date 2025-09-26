// 611. Valid Triangle Number
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

 

// Example 1:

// Input: nums = [2,2,3,4]
// Output: 3
// Explanation: Valid combinations are: 
// 2,3,4 (using the first 2)
// 2,3,4 (using the second 2)
// 2,2,3
// Example 2:

// Input: nums = [4,2,3,4]
// Output: 4
 

// Constraints:

// 1 <= nums.length <= 1000
// 0 <= nums[i] <= 1000

import java.util.Arrays;
public class Solution611 {
    public static void main(String[] args) {
        Solution obSolution = new Solution();
        int arr[] = {2,2,3,4};
        System.out.println(obSolution.triangleNumber(arr));
    }
}



class Solution {
    public int triangleNumber(int[] nums) {
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
        int len = nums.length;
        int counter = 0;
        int i ,j;

        for(int k = len - 1; k> 1 ; k--){
            i =0;
            j = k-1;
            while(i < j){
                if(( nums[i] + nums[j]) > nums[k]){
                    counter += (j-i);
                    j--;
                }
                else i++;
            }
        }
        
        return counter;        
    }
}
// class Solution {
//     public int triangleNumber(int[] nums) {
//         if(nums.length < 3) return 0;
//         Arrays.sort(nums);
//         int len = nums.length;
//         int counter = 0;
//         for(int i = 0; i < len - 2; i++){
//             if(nums[i] == 0) continue;  
//             for(int j = i + 1; j < len - 1; j++){
//                 counter += (findMid(nums, i, j) - j);
//             }
//         }
//         return counter;        
//     }
//     public int findMid(int[] nums, int i, int j){
//         int l = j + 1, h = nums.length - 1, index = 0;
//         int sum = nums[i] + nums[j];
//         while(l <= h){
//             int mid = (l + h) / 2;
//             if(sum > nums[mid]){
//                 index = mid;
//                 l = mid + 1;
//             } 
//             else h = mid - 1;
//         }
//         return index;
//     }
// }