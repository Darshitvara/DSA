public class Solution1945{
   public static void main(String x[]){
      Solution obj = new Solution();
      String s = "zbax";
      int sum = obj.getLucky(s, 2);
      System.out.println(sum);

      
   }
}


class Solution {
    public int getLucky(String s, int k) {
        String strIndex = "";
        int i,sum=0;

        for( i = 0 ;i< s.length(); i++){

            int temp = (int)s.charAt(i) - 'a' + 1;
            // strIndex += temp;
            if (temp >= 10) {
                strIndex += temp / 10 + temp % 10;
            } else {
                strIndex += temp;
            }
            // System.out.println(temp);
        }
        
        while(k > 0){
            
            // System.out.println(strIndex);
            // System.out.println("==================================");
            sum = 0;
            
            for(i = 0 ; i< strIndex.length(); i++){
                sum += strIndex.charAt(i)  - '0';
                // System.out.println(sum);
            }
            strIndex = Integer.toString(sum);
            k--;
            // System.out.println("==================================");
        }

        return sum;
    }   
}