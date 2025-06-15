public class Problem190 {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int n = Integer.parseUnsignedInt("00000010100101000001111010011100",2);
        int result = ob.reverseBits(n);
        System.out.println(result);
    }
}

 class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        for(int i = 0 ;i < 32 ; i++){
            result = (n & 1) ? Math.pow(2,32-i) : 0;
            n >>= 1;
        }
        return result;
    }
}
