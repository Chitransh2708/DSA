class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long concecutiveZeros = 0;
        long answer =0;
        for(int i =0;i<=nums.length-1;i++){
            if(nums[i] == 0){
                concecutiveZeros++;
                answer = answer+concecutiveZeros;

            }
            else{
                concecutiveZeros=0;
            }
        }
        return answer;
    }
}