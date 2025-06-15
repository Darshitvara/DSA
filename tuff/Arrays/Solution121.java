public class Solution121 {
    public static void main(String x[]) {

        Solution obj = new Solution();

        int a[] = {7,1,5,3,6,4};
        // int a[] = { 3,2,3 };

        int result = obj.maxProfit(a);
        System.out.println(result);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0,i,minProfit = Integer.MAX_VALUE;
    
        for(i = 0 ;i < prices.length ;i++){
            minProfit = Math.min(minProfit, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minProfit);
        }
        return maxProfit;   
    }
}