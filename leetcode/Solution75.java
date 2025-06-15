import java.util.*;
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