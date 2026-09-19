class Solution {

    public long kokoHour(int[] arr, int n, int guess) {
        long h = 0;

        for(int i = 0; i <= n - 1; i++) {

            h = h + arr[i] / guess;

            if(arr[i] % guess != 0) {
                h++;
            }
        }

        return h;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int high = -1;
        int res = -1;

        for(int i = 0; i <= piles.length - 1; i++) {
            high = Math.max(high, piles[i]);
        }

        int low = 1;

        while(low <= high) {

            int guess = (high + low) / 2;

            long hour = kokoHour(piles, piles.length, guess);

            if(hour > h) {
                low = guess + 1;
            }
            else {
                res = guess;
                high = guess - 1;
            }
        }

        return res;
    }
}