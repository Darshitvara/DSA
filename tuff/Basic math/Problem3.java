public class Problem3{
   public static void main(String x[]){
      Solution obj = new Solution();
      System.out.println(obj.isPalindrome(111));
      
   }
}
class Solution{
   public boolean isPalindrome(int n){
      int rev=0, rem,temp= n;
      while(temp>0){
         rem = temp % 10;
         rev = (rev*10) + rem;
         temp = temp / 10;
      }
      if(rev==n){
         return true;
      }else return false;
   }

}