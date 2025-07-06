// 28. Find the Index of the First Occurrence in a String
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

// Constraints:

// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.


class Solution {
    public int strStr(String haystack, String needle) {
        int s1_length = haystack.length();
        int s2_length = needle.length();
        boolean flag = false;
        if(s2_length == 0) return -1;
        if(s1_length < s2_length) return -1;
    
            for( int i = 0 ; i< s1_length;i++){
                for(int j = 0 ;j< s2_length;j++){
                        if(s1_length > (i+j)){
                            if(haystack.charAt(i+j) == needle.charAt(j)){
                                flag = true;
                            }else{
                                flag = false;
                                break;
                            }
                        }else{
                            if(flag){
                                return -1;
                            }
                        }
                }
                if(flag){
                    return i;
                }
            }
        
        return -1;
    }
}

// Optimized version
// =================

// class Solution {
//     public int strStr(String haystack, String needle) {
//         int s1_length = haystack.length();
//         int s2_length = needle.length();

//         if (s2_length == 0) return 0; // Edge case: empty needle
//         if (s1_length < s2_length) return -1; // If haystack is smaller, needle can't be found

//         for (int i = 0; i <= s1_length - s2_length; i++) { // Only iterate where needle can fit
//             if (haystack.substring(i, i + s2_length).equals(needle)) {
//                 return i; // Return starting index if match found
//             }
//         }
//         return -1;
//     }
// }
