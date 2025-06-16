public class Problem66 {
    public static void main(String[] args) {
        Solution ob = new Solution();

        int digits[] = {4,3,2,1};
        int[] result = ob.plusOne(digits);
        for(int i : result){
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1 ;i >= 0 ; i--){
            if((digits[i] +1 ) <= 9){
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int newDigits[] = new int[digits.length];
        newDigits[0] = 1;
        return newDigits;
    }
}
