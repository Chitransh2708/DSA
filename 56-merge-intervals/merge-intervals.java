class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int res[][] = new int[intervals.length][2];
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        int index =0;

        for(int i =1;i<=intervals.length-1;i++){
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(end1>=start2){
                start1 = start1;
                end1=Math.max(end1,end2);
                
            }
            else{
                res[index][0]= start1;
                res[index][1]= end1;
                index++;
                start1 = start2;
                end1 = end2;
            }
        }
        res[index][0] = start1;
        res[index][1] = end1;
        index++;


        return Arrays.copyOf(res, index);
    }
}