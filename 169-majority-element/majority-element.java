class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int bestMax =0;
        int k =0;
        for(int right =0;right<=nums.length-1;right++){
            if(nums[right] == nums[left]){
                if(right-left+1>=bestMax){
                    bestMax = right-left+1;
                    k = nums[right];
                }
            }
            else{
                left = right;
            }
        }

        return k;
        
    }
}