class Solution {

    public int isValid(int[] citations,int low){
        int count = 0;
        for(int i  = 0;i<=citations.length-1;i++){
            if(citations[i]>=low){
                count++;
            }

        }
        return count;
    }
    public int hIndex(int[] citations) {

        int low = 0;
        int hIndex = -1;
        int high = Integer.MIN_VALUE;
        int bextMax = Integer.MIN_VALUE;
        for(int i =0;i<=citations.length-1;i++){
            high = Math.max(high,citations[i]);
        }
        while(low<=high){
            
            int count = isValid(citations, low);

            if(count>=low){
                hIndex = Math.max(hIndex,low);
                
            }
            low++;


        }
        return hIndex;
        
    }
}