// Count the digits

import java.util.*;
public class Problem1{
   public static void main(String x[]){
      Demo obj = new Demo();
      Scanner sc = new Scanner(System.in);
      double n;
      System.out.print("  Enter Value : ");
      n = sc.nextDouble();

      System.out.println(obj.countDigit(n));
      sc.close();
   }
}
class Demo{
    public double countDigit(double n){
        return Math.floor(Math.log10(n)+1);
    }

}