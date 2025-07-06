package Numeric;
// 1432. Max Difference You Can Get From Changing an Integer
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given an integer num. You will apply the following steps to num two separate times:

// Pick a digit x (0 <= x <= 9).
// Pick another digit y (0 <= y <= 9). Note y can be equal to x.
// Replace all the occurrences of x in the decimal representation of num by y.
// Let a and b be the two results from applying the operation to num independently.

// Return the max difference between a and b.

// Note that neither a nor b may have any leading zeros, and must not be 0.

 

// Example 1:

// Input: num = 555
// Output: 888
// Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
// The second time pick x = 5 and y = 1 and store the new integer in b.
// We have now a = 999 and b = 111 and max difference = 888
// Example 2:

// Input: num = 9
// Output: 8
// Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
// The second time pick x = 9 and y = 1 and store the new integer in b.
// We have now a = 9 and b = 1 and max difference = 8
 

// Constraints:

// 1 <= num <= 108

public class Solution1432 {
    public static void main(String[] args) {
        Solution ob = new Solution();

        int result = ob.maxDiff(1101057);

        System.out.println(result);
    }
}
class Solution {
    public int maxDiff(int num) {

        String str1 = Integer.toString(num);
        String str2 = str1;
        int inx = 0, i;

        // Maximizing logic: replace first non-'9' with '9'
        for(i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != '9'){
                inx = i;
                break;
            }
        }

        if(i != str1.length()){
            str1 = str1.replace(str1.charAt(inx), '9');
        }

        System.out.println(str1);
        
        // Minimizing logic: replace first non-'1' with '1' and others with '0'
        for(i = 0; i < str2.length(); i++){
            if(i == 0 && str2.charAt(0) != '1'){
                str2 = str2.replace(str2.charAt(0), '1');
                break;
            }else if(str2.charAt(i) != '0' && str2.charAt(i) != str2.charAt(0)){
                str2 = str2.replace(str2.charAt(i), '0');
                break;
            }
        }
        
        System.out.println(str2);
        // Return the difference between the maximized and minimized numbers
        return Integer.parseInt(str1) - Integer.parseInt(str2);
    }
}

// debug
// ==========


// num = 1101057

// output = 8808000

// expected = 8808050



// num = 10025321       90025329
//                     -10005301
//                     ==========
//                      80020028

// output = 80000008

// expected = 80020028
