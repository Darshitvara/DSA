import java.util.ArrayList;

public class Problem338 {
    public static void main(String x[]){
        Solution obj = new Solution();
        int a[] = obj.countBits(5);
        for( int n : a){
            System.out.println(n);
        }
     }
}

class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        
        for(int i = 1 ; i< n+1;i++){
            arr[i] = (i%2) + arr[i/2];
        }

        return arr;
    }
}





















// class Solution {
//     public int[] countBits(int n) {
//         int arr[] = new int[n+1];
//         int sumOfOnes=0,temp;

//         for(int i = 0; i< n+1;i++){
//             sumOfOnes =0;
//             temp = i;
//             while(temp != 0){
//                 if(temp % 2 == 1){
//                     sumOfOnes++;
//                 }
//                 temp /= 2;
//             }
//             arr[i] = sumOfOnes;
//         }

//         return arr;
//     }
// }
