public class Task7 {
    public static void main(String x[]){
        int arr[] = {1,2,3,4,5,6};
        reverseArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverseArray(int[] arr){
        int len = arr.length-1;
        int mid = arr.length/2;
        for(int i = 0;i< mid;i++){
            int temp = arr[i];
            arr[i] = arr[len-i];
            arr[len-i] = temp;
        }
    }
}
