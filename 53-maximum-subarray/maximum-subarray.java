class Solution {
    public int maxSubArray(int[] nums) {

        int bestMax = nums[0];
        int sum = nums[0];

        for (int i = 1; i <= nums.length - 1; i++) {
             
                int newSum = sum + nums[i];
                if (newSum >= nums[i]) {
                    sum = newSum;
                }
                else{
                    sum = nums[i];
                }
                if (sum >= bestMax) {
                    bestMax = sum;
                }
                
            

        }
        return bestMax;
    }
}