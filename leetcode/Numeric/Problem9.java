// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1


import java.util.*;
public class Problem9{
   public static void main(String x[]){
      Solution obj = new Solution();
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.print("  Enter Value : ");
      n = sc.nextInt();
    System.out.println( obj.isPalindrome(n));
      sc.close();
   }
}

class Solution {
    public boolean isPalindrome(int x) {
        
        int rev = 0, n, digit;
        n = x;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev == x;
    
    }
}