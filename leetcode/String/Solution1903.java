public class Solution1903{
   public static void main(String x[]){
      Solution obj = new Solution();
      String result = obj.largestOddNumber("-24528");
      System.out.println(result);
   }
}

class Solution {
   public String largestOddNumber(String num) {
       String result = "";
       int i;

       for(i = num.length()-1 ; i >= 0; i--){
         if( (num.charAt(i)) % 2 == 1){
            return num.substring(0,i+1);
         }
       }
       return result;
   }
}