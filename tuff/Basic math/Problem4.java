public class Problem4{
   public static void main(String x[]){
      Solution obj = new Solution();
      System.out.println(obj.greatestCommanDivisor(16,16));
   }
}
class Solution{
   public int greatestCommanDivisor(int n1,int n2){
      int gcd=1;
      for(int i=2;i<=Math.min(n1,n2);i++){
         if(n1%i==0 && n2%i==0){
            gcd=i;
            }
         }
      return gcd;
   }

} 
