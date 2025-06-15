import java.util.ArrayList;
import java.util.List;

public class Problem54{
   public static void main(String x[]){
      Solution obj = new Solution();
      int matrix[][] = { {1,2,3},{4,5,6},{7,8,9}};
      List<Integer> result = obj.spiralOrder(matrix);

      for (Integer resultItem : result) {
            System.out.println(resultItem);
      }
   }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length,i;
        
        int right = n-1,left = 0 , bottom = m-1 , top = 0;

        while(left <= right && bottom >= top){
            for(i = left; i<= right ;i++){
                li.add(matrix[top][i]);
            }
            top++;
            for(i = top ; i<= bottom ;i++){
                li.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom){
                for(i = right ; i >= left ; i--){
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right){
                for(i = bottom ; i >= top ; i--){
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }
        return li;

    }
}