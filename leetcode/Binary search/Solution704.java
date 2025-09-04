public class Problem704{
   public static void main(String x[]){
      Solution obj = new Solution();
      int arr[] = { 5};
      System.out.println(obj.search(arr,5));
   }
}
class Solution {
    public int search(int[] nums, int target) {
        int l = 0 , h = nums.length -1;
        int mid ;

        while(l <= h){
            mid = (l + h ) /2 ;

            if(nums[mid] == target){
                return mid;
            }else if( nums[mid] < target){
                l = mid + 1;
            }else {
                h = mid -1;
            }
        }
        return -1;
    }
}