public class Merge_sort {
    public static void main(String x[]){
        int[] var1 = new int[]{45, 4, 464, 63, 643, 48, 89, 12};
        Solution obj = new Solution();
        obj.sort(var1,0,var1.length-1);
        for(int i=0;i<var1.length;i++){
            System.out.println(var1[i]);
        }
    }
}

class Solution {
    // public void sort(int arr[],int l, int h){
    //     if(l<h){
    //         int mid = (l+h)/2;
    //         sort(arr,l,mid);
    //         sort(arr,mid+1,h);
    //         merge(arr,l,mid,h);
    //     }
    // }
    // public void merge(int arr[],int l,int mid, int h){
    //     int subArr1Size = mid - l+1;
    //     int subArr2Size = h- mid;
    //     int subArr1[] = new int[subArr1Size];
    //     int subArr2[] = new int[subArr2Size];
    //     int i ,j,k;

    //     for(i =0;i<subArr1Size;i++){
    //         subArr1[i] = arr[i+l];
    //     }
    //     for(j =0;j<subArr1Size;j++){
    //         subArr2[j] = arr[j+mid+1];
    //     }

    //     i = 0;
    //     j = 0;
    //     k = l;

    //     while(i < subArr1Size && j < subArr2Size){
    //         if(subArr1[i] < subArr2[j]){
    //             arr[k++] = subArr1[i++];
    //         }else{
    //             arr[k++] = subArr2[j++];
    //         }
    //     }

    //     while(i < subArr1Size){
    //         arr[k++] = subArr1[i++];
    //     }
    //     while(j < subArr2Size){
    //         arr[k++] = subArr2[j++];
    //     }

    // }

    public void sort(int[] arr, int l,int h){
        if(l<h){
            int mid = (l+h )/2;
            sort(arr,l,mid);
            sort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    public void merge(int arr[],int l ,int mid ,int h){

        int arr1size = mid-l+1;
        int arr2size = h-mid;
        int arr1[] = new int[arr1size];
        int arr2[] = new int[arr2size];
        int i ,j ,k;
        for( i = 0 ;i<arr1size ;i++){
            arr1[i] = arr[l+i];
        }
        for( j = 0 ;j< arr2size;j++){
            arr2[j] = arr[mid+j+1];
        }

        i = 0;
        j = 0;
        k = l;

        while(i < arr1size && j < arr2size){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }else{
                arr[k++] = arr2[j++];
            }
        }

        while(i < arr1size){
            arr[k++] = arr1[i++];
        }
        while(j< arr2size){
            arr[k++] = arr2[j++];
        }
    }
    
}



























































// public void sort(int arr[],int l,int h){
//     if(l<h){
//         // find the middle element
//         int mid = (l+h)/2;

//         // sort the array by dividing
//         sort(arr,l,mid);
//         sort(arr, mid+1, h);
//         // merge two sub arrays
//         merge(arr ,l,mid,h);
//     }
// }
// public void merge(int arr[],int l,int mid,int h){
//     // sizes of two sub arrays
//     int n1 = mid - l +1 ;
//     int n2 = h - mid;

//     // created two sub arrays 
//     int subArr1[] = new int[n1];
//     int subArr2[] = new int[n2];

//     // created iterators
//     int i ,j,k;

//     // fill two sub arrays with elements
//     for( i = 0;i<n1;i++){
//         subArr1[i] = arr[i+l];
//     }
//     for( j = 0;j<n2;j++){
//         subArr2[j] = arr[j+ mid+1];
//     }

//     // reset the values of sub arrays
//     i =0;
//     j = 0;
//     k = l;

//     // compare two arrays and sort the parent array
//     while(i < n1 && j < n2){
//         if(subArr1[i] <= subArr2[j]){
//             arr[k++] = subArr1[i++];
//         }else{
//             arr[k++]= subArr2[j++];
//         }
//     }

//     // fill the remaining elements of sub array 
//     while(i < n1){
//         arr[k++] = subArr1[i++];
//     }
//     while(j < n2){
//         arr[k++] = subArr2[j++];
//     }
    
// }