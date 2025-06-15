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
