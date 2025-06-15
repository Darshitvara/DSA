
public class Quick_sort {
    public static void main(String x[]) {
        Solution obj = new Solution();
        // Unsorted array
        int[] arr = { 45, 4, 464, 63, 643, 48, 89, 12 };
        // Sort the array
        obj.sort(arr, 0, arr.length - 1);
        // Print the array
        obj.printArray(arr);
    }
}

class Solution {
    // Quick sort method using recursion
    void sort(int arr[], int l, int r) {
        // Termination condition for recursive calls
        if (l < r) {
            // Find the exact location of element in array
            int j = partition(arr, l, r);
            // Recall the sort function for left sub array
            sort(arr, l, j - 1);
            // Recall the sort function for right sub array
            sort(arr, j + 1, r);
        }
    }
    // Function to find the location of an element in array
    int partition(int arr[], int l, int r) {
        int pivot = arr[r];  // Pick up any element from array 
        int i = l - 1;                  // define iterators .... i for left to right and j for right to left
        int j = r;
        // iterate the loop untill j crosses the i
        while (i < j) {
            do {
                i++;
            } while (pivot > arr[i] && i < r);  // move right until elements are less than the pivot element
            do {
                j--;                            
            } while (pivot < arr[j] && j > l);  // move left until elements are less than the pivot element
            // swap the elements 
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the element at its position
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }

    void printArray(int a[]) {
        for (int i : a) {
            System.out.println(i);
        }
    }

}
