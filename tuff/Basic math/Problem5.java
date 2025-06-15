public class Problem5{
   public static void main(String x[]){
      Solution obj = new Solution();
      System.out.println(obj.isArmstrong(2));

   }
}
class Solution{
    public boolean isArmstrong(int n){
        int sum = 0, temp = n,rem;
        while (temp > 0) {
             rem = temp % 10;
            sum = sum + (int) Math.pow(rem, 3);
            temp = temp/10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }
}