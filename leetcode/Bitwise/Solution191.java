public class Problem191{
   public static void main(String x[]){
      Solution obj = new Solution();
      int result = obj.hammingWeight(11);
      System.out.println(result);
   }
}

class Solution {
    public int hammingWeight(int n) {
        int oneCount = 0;

        while(n > 0 ){
            if(n%2 != 0)  oneCount++;
            n /= 2;

        }


        return oneCount;
    }
}