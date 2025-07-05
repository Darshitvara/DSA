public class Solution3304 {
    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.kthCharacter(5));
    }
    
}

class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        while(k >= str.length()){
            int len = str.length();
            for(int i = 0; i< len ; i++){
                if(str.charAt(i) == 'z') str.append("a");
                str.append((char)  (((int)str.charAt(i)) +1) );
            }
        }
        return str.charAt(k-1);
    }
}
// class Solution {
//     public char kthCharacter(int k) {
//         StringBuilder str = new StringBuilder("a");
//         StringBuilder newStr = new StringBuilder();
//         while(k >= str.length()){
//             newStr.setLength(0);
//             for(int i = 0; i< str.length() ; i++){
//                 if(str.charAt(i) == 'z') newStr.append("a");
//                 newStr.append((char)  (((int)str.charAt(i)) +1) );
//             }
//             str.append(newStr);
//         }
//         return str.charAt(k-1);
//     }
// }