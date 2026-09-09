class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int sum = 0, bestMax = nums[0], bestMin = nums[0];
        int minSum = 0, maxSum = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            sum = sum + nums[i];

            maxSum = Math.max(nums[i], nums[i] + maxSum);
            minSum = Math.min(nums[i], nums[i] + minSum);

            bestMax = Math.max(maxSum, bestMax);
            bestMin = Math.min(minSum, bestMin);

        }
        if(bestMax<0){
            return bestMax;
        }
        else{
        return Math.max(sum-bestMin,bestMax);
        }
        



    }
}