public class Problem7{
   public static void main(String x[]){
      Solution obj = new Solution();
      
      System.out.println(obj.isPrime(8));
   }
}
class Solution{
   public boolean isPrime(int n){
      for(int i = 2;i<=Math.sqrt(n);i++){
         if(n%i==0){
            return false;
         }
      }
      return true;
   }
}