import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Union{
   public static void main(String x[]){
      Solution obj = new Solution();
      int [] a = {1,2,3,4,5,6,7};
      int [] b = {5,6,7,8,9,10};
       obj.findUnion(a,b );
      
   }
}
// } Driver Code Ends


// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> union = new ArrayList<Integer>();
        final Set<Integer> set = new HashSet<Integer>();
        int i = 0, j = 0 ;
        
       for(int e : a){
        set.add(e);
       }
       for(int e : b){
        set.add(e);
       }
       union.addAll(set);

    //    for(int e : set){
    //     union.add(e);
    //         System.out.println(e);
    //    }
        return union;
    }
}
