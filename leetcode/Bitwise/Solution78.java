import java.util.*;
public class Problem78{
   public static void main(String x[]){
      Solution obj = new Solution();
      int arr[] = {1,2,3};
      List<List<Integer>> result = obj.subsets(arr);
      for(List<Integer> e : result){
        System.out.println(e);
      }
   }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        

        int totalLen = 1 << nums.length;
        
        for(int i = 0 ; i< totalLen;i++ ){
            List<Integer> subList = new ArrayList<>();
                for(int j =  0; j < nums.length; j++){
                if((i & (1 << j)) != 0){
                    subList.add(nums[j]);
                }
            }   
            list.add(subList);    
        }
        
        return list;
    }
}