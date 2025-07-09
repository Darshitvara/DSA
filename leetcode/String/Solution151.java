// 151. Reverse Words in a String
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:

// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

// Constraints:

// 1 <= s.length <= 104
// s contains English letters (upper-case and lower-case), digits, and spaces ' '.
// There is at least one word in s.
 

// Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

public class Solution151{
    public static void main(String x[]){
        Solution ob = new Solution();
        String s = "  hello world  ";
        // String s = " Hetvi Vara codes.  ";

        String reversedSTR = ob.revStr(s);

        System.out.println(reversedSTR);

        
    }
}

class Solution{
    public String revStr(String s){
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for(int i = s.length() -1; i >= 0; i--){

            if(s.charAt(i) == ' '){
                if(counter > 0){
                    // add the word
                    for(int j = i+1 ; j <= (i+counter); j++){
                        result.append(s.charAt(j));
                    }
                    result.append(" ");
                }
                counter= 0;    
            }else{
                counter++;
            }
        }
        // add the last word if any
        if(counter > 0){
            for(int j = 0; j < counter; j++){
                if(s.charAt(j) != ' ')  // skip leading spaces
                    // System.out.println(s.charAt(j));
                    result.append(s.charAt(j));
                
            }
        }

        // Remove last ' ' if it exists
        if(result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
            result.deleteCharAt(result.length() - 1);
        }   

        
        return result.toString();
    }
}