public class Problem27{
   public static void main(String x[]){
      Solution obj = new Solution();
      int nums[] = {0,1,2,2,3,0,4,2};
     System.out.println(obj.removeElement(nums, 2));
     for(int j : nums){
        System.out.print(j +" ");
     }
   }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int lastIndex = 0,counter=0,i;
        for( i = 0 ; i < nums.length; i++){
            if(nums[i] != val){
                nums[lastIndex] = nums[i];
                lastIndex++;
                counter++;
            }
        }
        for(i = lastIndex ; i < nums.length ; i++){
            nums[i] = 0;
        }

        return counter; 
    }
}