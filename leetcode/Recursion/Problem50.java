public class Problem50{
   public static void main(String x[]){
      Solution obj = new Solution();
    double result = obj.myPow(0, 0);
    System.out.println(result);
   }
}

class Solution {
    public double myPow(double x, int n) {
        double power=1;
        if(n < 0 ){
            x = 1/x;
            n = n * (-1);
        }
        while(n!= 0){
            if(n % 2 != 0){
                power *= x;
            }
            n /= 2;
            x = x* x;
        }
        
        return power;
    }
}

// class Solution {
//     public double myPow(double x, int n) {
//         double power=1;
//         if(n < 0 ){
//             x = 1/x;
//             n = n * (-1);
//         }
//         while(n!= 0){
//             power *= x;
//             n--;
//         }
        
//         return power;
//     }
// }


// class Solution {
//     public double myPow(double x, int n) {
//         double power=1;
//         if(x == 1 )  return 1;
//         else if( x == (-1) ){
//             if(n % 2 == 0 ) return 1;
//             else return -1;
//         }
//         else if( n==0 ){
//             if(x < 0) return -1;
//             else return 1;
//         }
//         else if(n > 0){
//             while(n> 0){
//                 power *= x;
//                 n--;
//             }
//         }
//         else{
//             while(n != 0){
//                 power *= x;
//                 n++;
//                 if(power > 99999) break;
//             }
//             power = 1 / power;
//         }

//         return power;
//     }
// }