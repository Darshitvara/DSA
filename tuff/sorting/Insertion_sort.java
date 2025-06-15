public class Insertion_sort{
    public static void main(String x[]){
         int[] arr = {45,4,464,63,643,48,89,12};
         sort(arr);
         for(int i = 0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
    }

    // public static void sort(int[] arr){
    //     for(int i= 0;i<arr.length;i++){
    //         int temp = arr[i];
    //         int j = i-1;
    //         while(  j >= 0 && temp < arr[j]){
    //             arr[j+1] = arr[j--];
    //         }
    //         arr[j+1] = temp;
    //     }
    // }       

    // public static void sort(int arr[]){
    //     for(int i = 0 ; i< arr.length;i++){
    //         int temp = arr[i];
    //         int j = i-1;
    //         while((j>= 0) && temp < arr[j] ){
    //             arr[j+1] = arr[j--]; 
    //         }
    //         arr[j+1] = temp;
    //     }
    // }

    public static void sort(int arr[]){
        for(int i = 0; i< arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(( j >= 0) && temp < arr[j]){
                arr[j+1] = arr[j--];
            }
            arr[j+1] = temp;
            
        }
    }
}
 