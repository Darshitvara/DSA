
// 1143. Longest Common Subsequence
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.

 

// Example 1:

// Input: text1 = "abcde", text2 = "ace" 
// Output: 3  
// Explanation: The longest common subsequence is "ace" and its length is 3.
// Example 2:

// Input: text1 = "abc", text2 = "abc"
// Output: 3
// Explanation: The longest common subsequence is "abc" and its length is 3.
// Example 3:

// Input: text1 = "abc", text2 = "def"
// Output: 0
// Explanation: There is no such common subsequence, so the result is 0.
 

// Constraints:

// 1 <= text1.length, text2.length <= 1000
// text1 and text2 consist of only lowercase English characters.

class Solution {
    public int[][] dpSet = new int[1001][1001];
    int l1,l2;
    public int solve(String s1, String s2, int i , int j){
        if(i >= l1 || j >= l2)  return 0;
        if(dpSet[i][j] != 0)    return dpSet[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dpSet[i][j] = 1 + solve(s1,s2,i+1,j+1);
        return dpSet[i][j] = Math.max(solve(s1,s2,i+1,j),solve(s1,s2,i,j+1));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        
         l1 = text1.length();
         l2 = text2.length();

        return solve(text1,text2,0,0);    
    }
}