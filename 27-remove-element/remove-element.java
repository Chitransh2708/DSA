class Solution {
    public int removeElement(int[] nums, int val) {
        int index =0;
        int index1 = nums.length-1;
        int right =0;

        while(index<=index1){
            if(nums[right] != val){
                nums[index]= nums[right];
                index++;
                right++;
            }
            else{
                nums[right] = 101;
                int temp = nums[index1];
                nums[index1] = nums[right];
                nums[right] = temp;
                index1--;




            }
        }

        return index;
        
    }
}