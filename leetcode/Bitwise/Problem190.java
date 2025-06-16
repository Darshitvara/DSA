public class Problem190 {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int n = Integer.parseUnsignedInt("00000010100101000001111010011100",2);
        int result = ob.reverseBits(n);
        System.out.println(result);
    }
}



// class Solution {
//     // you need treat n as an unsigned value
//     public int reverseBits(int n) {
//         int ans = 0;
//         int mask = 1;

//         for(int i = 0 ; i < 32 ; i++){
//             if((n & mask) != 0) ans +=1 <<31 - i;

//             System.out.println(ans);
//             mask <<= 1;
//         }
//         return ans;
//     }
// }

class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;         // Shift result to the left to make room
            ans |= (n & 1);    // Add the last bit of n
            n >>= 1;           // Shift n to the right to get the next bit
        }
        return ans;
    }
}
