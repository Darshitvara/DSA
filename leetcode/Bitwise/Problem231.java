public class Problem231{
   public static void main(String x[]){
      Solution obj = new Solution();
      System.out.println(obj.isPowerOfTwo(-2147483648));
   }
}

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n <= 0) return false;
//         int counter = 0;
//         for(int i = 0; i < 32 ; i++){

//             if((n & 1 ) == 1  ){
//                 counter++;
//             }
//             if(counter > 1){
//                 return false;
//             }
//             n = n >> 1;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;  // Negative numbers and zero are not powers of two
        return ((n & (n-1)) == 0) ? true: false;
    }
}