// 73. Set Matrix Zeroes
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.

 

// Example 1:


// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
// Example 2:


// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

// Constraints:

// m == matrix.length
// n == matrix[0].length
// 1 <= m, n <= 200
// -231 <= matrix[i][j] <= 231 - 1
 

import java.util.Vector;

public class Problem73{
   public static void main(String x[]){
      Solution obj = new Solution();
      int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
      obj.setZeroes(matrix);
      obj.print(matrix);
   }
}
class Solution {
   public void setZeroes(int[][] matrix) {
         int row_length = matrix.length;
         int column_length = matrix[0].length;
         Vector<Integer> i_vector = new Vector<Integer>();
         Vector<Integer> j_vector = new Vector<Integer>();
         int i = 0;
         int j = 0;
         for(i = 0 ; i< row_length;i++){
            for(j = 0 ; j< column_length; j++){
               if(matrix[i][j] == 0){
                  i_vector.add(i);
                  j_vector.add(j);
               }
            }
         }
         for(Integer index : i_vector){
            for(j = 0 ;j< column_length;j++){
               matrix[index][j] = 0;
            }
         }
         for(Integer index : j_vector){
            for(j = 0 ;j< row_length;j++){
               matrix[j][index] = 0;
            }
         }
        
   }
   public void print(int[][] arr){
      for(int i = 0 ; i< arr.length;i++){
         for(int j = 0 ; j< arr[0].length;j++){
            System.out.print(arr[i][j] + " ");
         }
         System.out.println("");
      }
   }
}



// import java.util.*;

// public class tUf {
//     static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
//         int[] row = new int[n]; // row array
//         int[] col = new int[m]; // col array

//         // Traverse the matrix:
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix.get(i).get(j) == 0) {
//                     // mark ith index of row wih 1:
//                     row[i] = 1;

//                     // mark jth index of col wih 1:
//                     col[j] = 1;
//                 }
//             }
//         }

//         // Finally, mark all (i, j) as 0
//         // if row[i] or col[j] is marked with 1.
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (row[i] == 1 || col[j] == 1) {
//                     matrix.get(i).set(j, 0);
//                 }
//             }
//         }

//         return matrix;
//     }

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//         matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//         matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
//         matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

//         int n = matrix.size();
//         int m = matrix.get(0).size();

//         ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

//         System.out.println("The Final matrix is: ");
//         for (ArrayList<Integer> row : ans) {
//             for (Integer ele : row) {
//                 System.out.print(ele + " ");
//             }
//             System.out.println();
//         }
//     }
// }















