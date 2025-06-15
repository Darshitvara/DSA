
public class Solution169 {
    public static void main(String x[]) {

        Solution obj = new Solution();

        int a[] = { 2, 2, 1, 1, 1, 2, 2 };
        // int a[] = { 3,2,3 };

        int result = obj.majorityElement(a);
        System.out.println(result);
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int maxCount = 0, i, j, counter,index=0;
        boolean countArr[] = new boolean[nums.length];

        for (i = 0; i < nums.length; i++) {
            counter = 0;
            if (!countArr[i]) {
                for (j = i; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        counter++;
                        countArr[j] = true;
                    }
                }
            }

            if(counter > maxCount ) {
                maxCount = counter;
                index = i;
            }
        }
        if(maxCount > (nums.length / 2)){
            return nums[index];
        }
        return nums[0];
    }
}