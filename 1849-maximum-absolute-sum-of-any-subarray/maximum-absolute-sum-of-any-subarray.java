class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = nums[0], answer = nums[0];
        int minSum = nums[0], maxSum = nums[0];
        int maxEnding =nums[0], minEnding = nums[0];

        for(int i = 1;i<=nums.length-1;i++){
            maxEnding = Math.max(maxEnding + nums[i],nums[i]);
            minEnding = Math.min(minEnding + nums[i],nums[i]);
            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
            
        }
           answer = Math.max(maxSum,Math.abs(minSum));
        
        return answer;
    }
}