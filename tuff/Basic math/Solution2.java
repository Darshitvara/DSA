import java.util.*;
public class Problem2{
   public static void main(String x[]){
      Demo obj = new Demo();
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.print("  Enter Value : ");
      n = sc.nextInt();
      System.out.println(obj.reverseNumber(n));
      sc.close();
   }
}
class Demo{
    public int reverseNumber(int n){
        int reversedNumber=0,rem,num=n;
        while(num>0){
            rem = num % 10;
            reversedNumber = (reversedNumber*10) + rem;
            num = num /10;
        }
        return reversedNumber;
    }
}