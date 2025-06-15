public class OccurCount {
    public static void main(String x[]){
        Solution ob = new Solution();
        int arr[] = {1,2,1,3,2,1,1,4,4,5,8,9,4,2,2};

        int max = ob.findMax(arr);
        // System.out.println(max);
        // int hashMap[] = ob.hashmap(arr,max);
        ob.hashmap(arr,max);
        // ob.printArray(hashMap);
    }
}
class Solution{
    // return the maximum number in array
    int findMax(int a[]){
        int max=0;
        for(int i = 0 ; i< a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    // returns the hashmap of given array
    // int[] hashmap(int[] a,int max){
    //     int countArr[] = new int[max+1];
    //     int hash[] = new int[a.length];
    //     int i=0;
    //     for(int element : a){
    //         countArr[element] += 1;
    //     }
    //     // printArray(countArr);
    //     int j = 0;
    //     while(i< countArr.length){
    //         if(countArr[i] != 0){
    //             hash[j] = countArr[i];
    //             j++;
    //         }
    //         i++;
    //     }
    //     return hash;
    // }
    void hashmap(int[] a,int max){
        int countArr[] = new int[max+1];
        int i=0;
        for(int element : a){
            countArr[element]++;
        }
        while(i< countArr.length){
            if(countArr[i] != 0){
                System.out.println(countArr[i]);
            }
            i++;
        }
    }

    // print array
    void printArray(int arr[]){
        for(int element : arr){
            System.out.println(element);
        }
    }
}
