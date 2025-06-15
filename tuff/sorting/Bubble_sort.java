public class Bubble_sort{
   public static void main(String x[]){
      Solution obj = new Solution();
      int[] var1 = new int[]{45, 4, 464, 63, 643, 48, 89, 12};
      obj.sort(var1);
      for(int i = 0;i<var1.length;i++){
         System.out.println(var1[i]);
     }
   }
}
class Solution{
   public void sort(int arr[]){

      for(int i=0;i<arr.length;i++){
         for(int j=0;j<(arr.length)-i-1;j++){
            if(arr[j] > arr[j+1]){
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }
   }

}