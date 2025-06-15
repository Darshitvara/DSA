public class Selection_sort{
   public static void main(String x[]){
        int[] arr = { 3,5,2,1,8,39,4};
        sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
    public static void sort(int[] arr){
        for(int i= 0;i<arr.length;i++){
            for(int j= i;j<arr.length;j++){
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    
        
}
