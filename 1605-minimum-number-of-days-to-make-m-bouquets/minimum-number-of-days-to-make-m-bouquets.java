class Solution {

    public int isValid(int[] arr, int guess, int k) {

    int consecutive = 0;
    int bouquets = 0;

    for (int i = 0; i <= arr.length-1; i++) {

        if (arr[i] <= guess) {

            consecutive++;

            if (consecutive == k) {
                bouquets++;
                consecutive = 0;
            }

        } else {
            consecutive = 0;
        }
    }

    return bouquets;
}
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int low = 1;
        int res = -1;
        int high = Arrays.stream(bloomDay).max().getAsInt();
        while(low<=high){
            int guess = (low+high)/2;
            int b = isValid(bloomDay, guess,k);
            if(b>=m){
                res = guess;
                high = guess-1;
            }
            else{
                low = guess+1;
            }
        }
        return res;
    }
}