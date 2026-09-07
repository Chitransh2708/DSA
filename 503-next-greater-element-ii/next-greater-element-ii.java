class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int ans[] = new int[nums.length];
        for(int i =0;i<=nums.length-1;i++){
            ans[i]= -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<=(2*nums.length)-1;i++){
            int index = i%nums.length;
            while(!st.isEmpty() && nums[index]>nums[st.peek()]){
                ans[st.pop()] = nums[index];
            }

            if(i<nums.length){
                st.push(index);
            }
        }


        return ans;
        
    }
}