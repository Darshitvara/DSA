
public class Problem6{
   public static void main(String x[]){
      Solution obj = new Solution();
      obj.printDivisors(20);
   }
}
class Solution{
   public void printDivisors(int n) {
      for (int i = 1; i <= n/2; i++) {
         if (n % i == 0) {
            System.out.print(i + " ");
         }
      }
      System.out.print(n);
   }
}