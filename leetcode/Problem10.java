// 7. Reverse Integer
// Solved
// Medium
// Topics
// Companies
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 

// Constraints:

// -231 <= x <= 231 - 1




public class Problem10{
   public static void main(String x[]){
      Solution obj = new Solution();
      System.out.println(obj.reverse(1534236469));
   }
}
class Solution {
    public int reverse(int x) {
        int result=0,rem=0;
        while(x != 0){
            rem = x %10;
            if (result > 214748364 || result < -214748364) return 0; 
            result = ( result*10) + rem;
            x = x /10;
        }        
        return result;
    }
}

// class Solution {
//    public int reverse(int n) {
//        int result=0,rem= 0;
//        int x = Math.abs(n);
//        while(x>0){
//            rem = x %10;
//            result = ( result*10) + rem;
//            System.out.println(result);
//            x = x /10;
//        }
//        if(n<0) result = result - (result*2);
//        if(x > Math.pow(-2,31) && x < (Math.pow(2,31)-1)){
//            return result;
//        }      
//        return 0;
//    }
// }