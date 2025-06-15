public class RotateByK{
    public static void main(String x[]){
        int rotate=4;
        int[] arr = {1,2,3,4,5,6,7};
        display(arr);
        System.out.println("\n\n");
        arr = rotate(arr,rotate);
        display(arr);
    }
    public static void display(int a[]){
        for(int i= 0;i<a.length;i++){
            System.out.print(" "+ a[i]);
        }
    }
    public static int[] rotate(int[] a,int r){
        int len = a.length;
        int rotate = r%(len);
        int rotedArray[] = new int[len];

        for(int i=0;i<len;i++ ){
            rotedArray[((i+rotate)%len)] = a[i];
        }
        return rotedArray;
    }
}