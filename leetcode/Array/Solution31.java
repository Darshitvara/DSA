import java.util.Arrays;
import java.util.Collections;

public class Problem31{
   public static void main(String x[]){

    int arr[] = {3,2,1};
    // int arr[] = {1,2,3};
      Solution obj = new Solution();
      obj.nextPermutation(arr);
      for(int n : arr){
        System.out.println(n);
      }
   }
}
class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int i ;
        
        for( i = nums.length -2 ; i >= 0 ; i--){
            if(nums[i] > nums[i+1]){
                index = i;
            }
        }
        if(index == -1){
            Collections.reverse(Arrays.asList(nums));
        }
        System.out.println(index +" ====");
        // for(i = index ; i< nums.length; i++){
        //     if(nums[index] >= )
        // }
    }
}