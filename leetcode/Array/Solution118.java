
// 118. Pascal's Triangle
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
 

// Constraints:

// 1 <= numRows <= 30

// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> pascal = new ArrayList<List<Integer>>();

//         for(int i = 0 ; i<= numRows; i++){
//             List<Integer> tempList = new ArrayList<>();
//             for(int j = 0; j< i ;j++){
//                 tempList.add(getPermutation(i,j));
//                 System.out.print(tempList.get(j));
//             }
//             System.out.println(" ");
//             pascal.add(tempList);
//         }
        
//         return pascal;
//     }
//     public int getPermutation(int i ,int j){
//         if(i == 0) return 1;
//         int res = 0;
//         int d1 = 1, d2 = 1;
//         int k = 0;
//         for( k = 0 ;k<= j;k++){
//             d1 *= i - k;
//             d2 *= (k+1) ;
//         }

//         res = d1/d2;

//         return res ;
//     }
// }

import java.util.*;
public class Problem118{
   public static void main(String x[]){
    //   Solution obj = new Solution();
      SecondSolution obj2 = new SecondSolution();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // result =obj.generate(5);
        result = obj2.generate(5);

        for(int i = 0; i < result.size(); i++) {   
            for(int j = 0; j < result.get(i).size(); j++) {   
                System.out.print(result.get(i).get(j) + "  ");
            }  
            System.out.println(" ");
        }  
   }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        int res = 0;
        for(int i = 0 ; i< numRows; i++){
            List<Integer> tempList = new ArrayList<>();
            res = 1;
            for(int j = 0; j<= i ;j++){
                tempList.add(res);
                res *= ((i-j));
                res = res / (j+1);
                // System.out.print(tempList.get(j));
            }
            System.out.println(" ");
            pascal.add(tempList);
        }
        
        return pascal;
    }
   
}

class SecondSolution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if (numRows == 0) 
            return ans;

        // First row
        ans.add(new ArrayList<>());
        ans.get(0).add(1);

        if (numRows == 1) 
            return ans;

        // Second row
        ans.add(new ArrayList<>());
        ans.get(1).add(1);
        ans.get(1).add(1);

        if (numRows == 2) 
            return ans;

        // Generating Pascal's Triangle
        for (int i = 2; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for (int j = 1; j < ans.get(i - 1).size(); j++) {
                temp.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }

            temp.add(1);
            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Integer>> result = sol.generate(5);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
