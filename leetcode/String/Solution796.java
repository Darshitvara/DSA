// 796. Rotate String
// Easy
// Topics
// premium lock icon
// Companies
// Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

// A shift on s consists of moving the leftmost character of s to the rightmost position.

// For example, if s = "abcde", then it will be "bcdea" after one shift.
 

// Example 1:

// Input: s = "abcde", goal = "cdeab"
// Output: true
// Example 2:

// Input: s = "abcde", goal = "abced"
// Output: false
 

// Constraints:

// 1 <= s.length, goal.length <= 100
// s and goal consist of lowercase English letters.

public class Solution796 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rotateString("abcde", "cdeab")); // true
        System.out.println(solution.rotateString("abcde", "abced")); // false
    }
}


class Solution {
    public boolean rotateString(String s, String goal) {
        return (s.length() == goal.length()) && (s+s).contains(goal);
    }
}


// class Solution {
//     public boolean rotateString(String s, String goal) {
//         StringBuilder str = new StringBuilder();
//         int len = 0;
//         int slen = s.length();
//         int shifting_index;

//         while(slen != len){
//             str.setLength(0);

//             shifting_index = len;
//             for(int i = 0 ; i < s.length();i++){
//                 str.append(s.charAt((shifting_index++)%slen));
//             }
//             System.out.println(str.toString() + " : " + goal + "\n");
//             if(str.toString().equals(goal)) return true;


//             len++;
//         }
//         return false;
//     }
// }