public class Problem29{
   public static void main(String x[]){
      Solution obj = new Solution();

      System.out.println(obj.divide(5, 1));
      
   }
}

class Solution {
    public int divide(int dividend, int divisor) {
        int divMul=1 , divsMul =1;

        if(dividend >= Integer.MAX_VALUE && (divisor < 0)) return (-1)*Integer.MAX_VALUE;
        if(dividend >= Integer.MAX_VALUE && (divisor < 0)) return Integer.MAX_VALUE;

        if(dividend <= Integer.MIN_VALUE && (divisor < 0)) return ((-1) * Integer.MIN_VALUE)-1 ;
        if(dividend <= Integer.MIN_VALUE && (divisor < 0)) return  Integer.MIN_VALUE;
        
        if(divisor == 1) return dividend;


        if(divisor == -1) return ((-1) *dividend);


        if(divisor < 0) divMul= (-1); 
        if(dividend < 0) divsMul = (-1);
        int quotient = 0;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while( dividend >= divisor){
            dividend -= divisor;
            quotient++;
        }

        return quotient * divMul * divsMul;
    }
}