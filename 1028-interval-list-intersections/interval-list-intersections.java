class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length+ secondList.length;
        int index = 0;
        int res[][] = new int[n][2];
        int left =0;        
        int right = 0;

        while((left<firstList.length) && (right<secondList.length)){
            int start1 = firstList[left][0];
            int end1 = firstList[left][1];
            int start2 = secondList[right][0];
            int end2 = secondList[right][1];
            int start = Math.max(start1,start2);
            int end = Math.min(end1, end2);

            if(start1<=start2){
                if(end1>=start2){
                res[index][0] = start;
                res[index][1] = end;
                index++;
                }
               
            }
            else{
                if(end2>=start1){
                res[index][0] = start;
                res[index][1] = end;
                index++;
                }
            }
            if(end1<=end2){
                left++;
            }
            else{
                right++;
            }
        }
        return Arrays.copyOf(res, index);
    }
}