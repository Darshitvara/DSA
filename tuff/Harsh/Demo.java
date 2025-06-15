public class Demo {
    public static void main(String x[]) {
        Solution obj = new Solution();
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int[] rotatedArray = obj.rotateByK(arr, 4);
        for(int i : rotatedArray) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] rotateByK(int arr[], int rotation) {
        int newArray[] = new int[arr.length];
        int n = arr.length;
        rotation = rotation % n; 
        for(int i = 0; i < n; i++) {
            int newIndex = (i + rotation) % n; 
            newArray[newIndex] = arr[i];
        }
        return newArray;
    }
}
