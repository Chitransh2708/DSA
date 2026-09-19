class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<=nums2.length-1;i++){

            while(!st.empty() && st.peek()<nums2[i]){

                mp.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        while(!st.empty()){
            mp.put(st.pop(),-1);
        }
        for(int i =0;i<=nums1.length-1;i++){
            nums1[i] = mp.get(nums1[i]);
        }
        
        return nums1;
        
    }
}