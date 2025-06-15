
public class Problem371{
    public static void main(String x[]){
        Solution ob = new Solution();

        System.out.println(ob.getSum(50,30));
    }
}

class Solution {
    public int getSum(int a, int b) {
        int carry;

        while(b != 0){
            carry = a  & b;
            a = a ^ b;
            b = carry << 1;
        }
        
        return a ;
    }
}