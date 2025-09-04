public class Problem3341{
   public static void main(String x[]){
      Solution obj = new Solution();
      int moveTime[][]  = {{0,4},{0,4}};
      int result = obj.minTimeToReach(moveTime);
      System.out.println(result);
   }
}

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int min_time = 0;
        int i = 0,j = 0;

        while(true){

            if(moveTime[i][j] == moveTime[i+1][j]){
                i++;
                min_time++;
            }else if(moveTime[i][j] == moveTime[i][j+1]){
                j++;
                min_time++;
            }else if(moveTime[i+1][j] > moveTime[i][j+1]){
                min_time += moveTime[i][j+1];
                j++;
            }else{
                min_time += moveTime[i+1][j];
                i++;
            }

            if(i == moveTime.length && j == moveTime[i].length)   break;
        }

        return min_time;


    }
}