// 14. Longest Common Prefix
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.



import java.util.*;

import Numeric.Solution;
public class Problem14{
   public static void main(String x[]){
    Solution20 obj = new Solution20();
      Scanner sc = new Scanner(System.in);
      String[] strs = {"flower","flower","flower","flower"};
    //   String[] strs = {"flower","low","flight"};
      System.out.println(obj.longestCommonPrefix(strs));
      sc.close();
   }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder commonPrefix = new StringBuilder();
        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
    }
}
