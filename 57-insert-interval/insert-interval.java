class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int start1 = newInterval[0];
        int end1 = newInterval[1];
        int n = intervals.length;
        int res[][] = new int[n + 1][2];
        int index = 0;
        boolean inserted = false;

        for (int i = 0; i <= n - 1; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if(end2<start1){
                res[index][0]= start2;
                res[index][1]= end2;
                index++;

            }
            else if(end1>=start2){
                start1 = Math.min(start1,start2);
                end1 = Math.max(end1,end2);
            }
            else{
                 if (!inserted) {
                    res[index][0] = start1;
                    res[index][1] = end1;
                    index++;
                    inserted = true;
                }
                res[index][0]=start2;
                res[index][1]=end2;
                index++;

            }

            


        }
        if (!inserted) {
            res[index][0] = start1;
            res[index][1] = end1;
            index++;
        }
    return Arrays.copyOf(res,index);
    }
}