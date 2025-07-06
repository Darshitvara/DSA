// 20. Valid Parentheses
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

 

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class Solution20 {
    public boolean isValid(String str) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> s = new Stack<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{','}');
        int i ;
        for( i= 0;i < str.length() ; i++){
            char currentChar = str.charAt(i);
                if(map.containsKey(str.charAt(i))){
                    s.push(currentChar);
                }else{
                     if (s.isEmpty() || currentChar != map.get(s.pop())) {
                    return false;
                }
                }
               
        }
        return s.empty();
    }
} 