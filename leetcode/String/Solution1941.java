
import java.util.Map;
import java.util.HashMap;

public class Solution1941{
   public static void main(String x[]){
      Solution obj = new Solution();
      String s = "abacbc";
      System.out.println( obj.areOccurrencesEqual(s));
   }
}



class Solution {
    public boolean areOccurrencesEqual(String s) {
      Map<Character,Integer> map = new HashMap< Character,Integer>();
      
      for(char c : s.toCharArray()){
         // count =  (map.containsKey(c)) ? map.get(c) + 1 : 1;
         // map.put(c ,count);
         map.put(c , ((map.containsKey(c)) ? map.get(c) + 1 : 1));
      }
      
      int count = map.get(s.charAt(0));
      for(int n : map.values()){
         if(count != n) return false;
         // System.out.println(c + " : " + map.get(c));
      }
      // System.out.println(count);
      return true;
    }
}


// class Solution {
//    public boolean areOccurrencesEqual(String s) {
//        int[] freq = new int[26];

//        for (char c : s.toCharArray()) {
//            freq[c - 'a']++;
//        }

//        int count = 0;
//        for (int f : freq) {
//            if (f > 0) {
//                if (count == 0) count = f;
//                else if (count != f) return false;
//            }
//        }

//        return true;
//    }
// }
