public class Problem35{
   public static void main(String x[]){
      Solution obj = new Solution();
      int arr[] = {1,3,5,6};
      System.out.println(obj.searchInsert(arr,7));
   }
}

class Solution {
   public int searchInsert(int[] nums, int target) {
       int l= 0, h = nums.length -1;
       int mid ;

       while(l <= h){
           mid = (l + h)/2;
           if(nums[mid] == target){
               return mid;
           }else if(nums[mid] > target){
               h = mid -1;
           }else{
               l = mid+ 1;
           }
       }
       return l;
   }
}