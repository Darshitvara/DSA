// 49. Group Anagrams
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:

// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
// Example 2:

// Input: strs = [""]

// Output: [[""]]

// Example 3:

// Input: strs = ["a"]

// Output: [["a"]]

 

// Constraints:

// 1 <= strs.length <= 104
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution49 {
    Solution ob = new Solution();

    public static void main(String[] args) {
        Solution ob = new Solution();
        String[] strs = { "stop", "pots", "reed", "", "tops", "deer", "opts", "" };
        // String[] strs = {"","b",""};
        // String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ob.groupAnagrams(strs);
        System.out.println(result);
    }
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}


// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         boolean checked[] = new boolean[strs.length];
//         ArrayList<List<String>> result = new ArrayList<List<String>>();
//         int i = 0;
//         for (String str : strs) {
//             // Short the string to find anagrams
//             char[] chars = str.toCharArray();
//             Arrays.sort(chars);
//             String sorted = new String(chars);

//             // If the string is already checked, skip it
//             if (!checked[i]) {
//                 List<String> group = new ArrayList<String>();

//                  for (int j = i ; j < strs.length; j++) {
//                     if(checked[j]) continue; // skip already checked strings

//                         if (str.length() ==  strs[j].length()) { 

//                             char[] newchars = strs[j].toCharArray();
//                             Arrays.sort(newchars);
//                             String newSorted = new String(newchars);
//                             if (sorted.equals(newSorted)) { // check if sorted strings match
//                                 group.add(strs[j]);
//                                 checked[j] = true; // mark as checked
//                             }


//                         }
                    
//                 }
//                 result.add(group);
//             }
//             i++;
//         }
//         return result;
//     }
// }

// class Solution {
// public List<List<String>> groupAnagrams(String[] strs) {
// boolean checked[] = new boolean[strs.length];
// ArrayList<List<String>> result = new ArrayList<List<String>>();
// int i = 0;
// for (String str : strs) {
// if (!checked[i]) {
// List<String> group = new ArrayList<String>();
// int strAsciTotal = 0;
// for (char c : str.toCharArray()) {
// strAsciTotal += (int) c; // calculate total ASCII value of the string
// }
// // String rstr = new StringBuilder(str).reverse().toString();
// for (int j = i ; j < strs.length; j++) {
// if(checked[j]) continue; // skip already checked strings
// if ( str.length() == strs[j].length()){
// int jStrAsciTotal = 0;
// for (char c : strs[j].toCharArray()) {
// jStrAsciTotal += (int) c; // calculate total ASCII value of the string
// }
// if (strAsciTotal == jStrAsciTotal) { // check if ASCII totals match
// group.add(strs[j]);
// checked[j] = true; // mark as checked
// }
// }
// }
// result.add(group);
// }
// i++;
// }
// return result;
// }
// }

// class Solution {
// public List<List<String>> groupAnagrams(String[] strs) {
// boolean checked[] = new boolean[strs.length];
// ArrayList<List<String>> result = new ArrayList<List<String>>();
// int i = 0;
// for (String str : strs) {
// if (!checked[i]) {
// List<String> group = new ArrayList<String>();
// String rstr = new StringBuilder(str).reverse().toString();
// for (int j = i ; j < strs.length; j++) {
// if(checked[j]) continue; // skip already checked strings
// if ( str.length() == strs[j].length()){
// if((str + str + rstr + rstr).contains(strs[j]) ){
// group.add(strs[j]);
// checked[j] = true;
// }
// }
// }
// result.add(group);
// }
// i++;
// }
// return result;
// }
// }