import java.util.*;
public class Problem16{
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