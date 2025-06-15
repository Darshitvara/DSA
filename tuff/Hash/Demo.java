public class Demo{
   public static void main(String x[]){
      Solution obj = new Solution();
      int arr[] = {1,22,22,1,1,4,34,2};
      int result = obj.occurranceCount(arr,1);
      System.out.println(result);
   }
}

class Solution{
    int occurranceCount(int[] a,int n){
        int count = 0;
        for(int element : a){
            if(element == n) count++;
        }
        return count;
    }
}