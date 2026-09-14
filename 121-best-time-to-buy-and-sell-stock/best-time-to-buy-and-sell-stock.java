class Solution {
    public int maxProfit(int[] prices) {

        int bestMin = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int num : prices){

            bestMin = Math.min(bestMin,num);

            int profit = num - bestMin;

            maxProfit = Math.max(maxProfit, profit);
        }
        
        return maxProfit;
    }
}