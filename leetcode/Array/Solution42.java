// 42. Trapping Rain Water
// Solved
// Hard
// Topics
// premium lock icon
// Companies
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

// Example 1:


// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9
 

// Constraints:

// n == height.length
// 1 <= n <= 2 * 104
// 0 <= height[i] <= 105

class Solution {
    public int trap(int[] height) {
        int rainDrops = 0;
        int left = 0 , right = 0 ,i;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];

        for( i = 0 ; i< height.length  ; i++){
            if(left < height[i]){
                left = height[i];
            }
                leftMax[i] = left;
            if(right < height[height.length - i - 1]){
                right =  height[height.length - i - 1];
            }
                rightMax[height.length - i - 1] = right;
        }

        for( i = 0 ; i < height.length; i++){
            rainDrops += Math.min(leftMax[i],rightMax[i]) - height[i];
        }

        return rainDrops;
    }
}