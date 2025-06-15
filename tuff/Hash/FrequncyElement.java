import java.util.Arrays;


public class FrequncyElement{
   public static void main(String x[]){
        Solution obj = new Solution();
        // int a[] = {1,4,8,13};
        // int a[] = {1,2,4};
        // int a[] = {3,9,6};
        int a[] = {100000,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999,99999};
        // int a[] = {9940,9995,9944,9937,9941,9952,9907,9952,9987,9964,9940,9914,9941,9933,9912,9934,9980,9907,9980,9944,9910,9997};
        int result = obj.maxFrequency(a, 7925);
        System.out.println(result);
   }
}


// class Solution {
//     public int maxFrequency(int[] nums, int k) {
//         Arrays.sort(nums);
//         int myNums[] = nums;
//         int counter = 0;
//         int maxFreq = 0;
//         int tempK ;
//         int comparator;

//         for(int i = myNums.length-1 ; i > 0 ; i--){
//             tempK = k;
//             counter = 1;
//             comparator = myNums[i];
//             for( int  j = i-1; j >= 0 ;j--){
//                     if((comparator <= (myNums[j] + tempK)) && tempK > 0){
//                         counter++;
//                         tempK -= (comparator - myNums[j]);
//                         // myNums[i-1] = comparator;
//                     }else{
//                         break;
//                     }
//             }
//             if(maxFreq < counter )   maxFreq = counter;   
//         }   
//         return maxFreq;
//     }
// }


class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);  // Sort the array
        int myNums[] = nums;
        int counter = 0;
        int maxFreq = 0;
        int tempK;
        int comparator;

        for (int i = myNums.length - 1; i > 0; i--) {
            tempK = k;
            counter = 1;  // At least the current element counts
            comparator = myNums[i];

            // Start checking previous elements
            for (int j = i - 1; j >= 0; j--) {
                // If we can make myNums[j] equal to comparator within the allowed tempK, we proceed
                int diff = comparator - myNums[j];
                if (diff <= tempK) {
                    counter++;
                    tempK -= diff;  // Reduce the remaining k by the difference
                } else {
                    break;  // No need to check further as the difference is too large
                }
            }

            // Update the maximum frequency
            if (maxFreq < counter) {
                maxFreq = counter;
            }
        }

        return maxFreq;
    }
}
