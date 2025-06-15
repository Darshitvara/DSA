
public class Problem1534{
   public static void main(String x[]){
      Solution obj = new Solution();
        int arr[] = {1,1,2,2,3};
        // int arr[] = {3,0,1,1,9,7};
      obj.countGoodTriplets(arr,0,0,1);
    //   obj.countGoodTriplets(arr,7,2,3);
   }
}

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int i,j,k,counter=0;
        for(i = 0 ; i<= arr.length - 3 ; i++){
            for(j = i+1 ; j <= arr.length -2 ; j++){
                for(k = j+1 ; k<= arr.length -1 ; k++){
                    int sub1 =  Math.max(arr[i], arr[j]) - Math.min(arr[i], arr[j]);
                    int sub2 =  Math.max(arr[j], arr[k]) - Math.min(arr[j], arr[k]);
                    int sub3 =  Math.max(arr[i], arr[k]) - Math.min(arr[i], arr[k]);

                    if( (sub1 <= a) && (sub2 <= b) && (sub3 <= c) ){
                        counter++;
                    }
                    
                }
            }
        }   
        return counter;
    }
}