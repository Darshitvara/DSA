// 48. Rotate Image
// Solved
// Medium
// Topics
// Companies
// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

public class Problem48{
   public static void main(String x[]){
      Solution obj = new Solution();
      int arr[][] = {{1,2,3},{4,5,6},{7,8,9}} ;

      obj.rotate(arr);
      for(int i = 0 ; i< arr.length;i++){
        for(int j = 0 ; j < arr[0].length; j++){
            System.out.print("  " +arr[i][j]);
        }
        System.out.println();
      }
   }
}

class Solution {
    public void rotate(int[][] matrix) {
        int temp[][] = new int[matrix.length][matrix[0].length];
        int len = matrix.length;
        int j,i;
        int jlen = matrix[0].length;
        for( i = 0 ;i< len;i++){
            for( j = 0 ; j< jlen;j++){
                temp[j][len-1-i] = matrix[i][j];
            }
        }
        for( i = 0 ;i< len;i++){
            for( j = 0 ; j< jlen;j++){
                 matrix[i][j] = temp[i][j];
            }
        }
    }   

}