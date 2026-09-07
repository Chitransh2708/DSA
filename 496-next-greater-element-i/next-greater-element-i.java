class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i =0;i<=nums2.length-1;i++){
            int temp = nums2[i];
            for(int j=i;j<=nums2.length-1;j++){

                if(nums2[j] > nums2[i]){
                    mp.put(nums2[i],nums2[j]);
                    break;
                }
               

            }

            if(mp.get(nums2[i]) == null){
                mp.put(nums2[i],-1);
            }
        }
        for(int i =0;i<=nums1.length-1;i++){
           nums1[i] = mp.get(nums1[i]);
        }
        return nums1;
    }
}
