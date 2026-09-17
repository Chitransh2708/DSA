class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int res = -1;
        int low = 0;
        int high= arr.length-1;
        while(low<=high){
            int guess = (high+low)/2;
            if(arr[guess]<arr[guess+1]){
                low = guess+1;
            }
            else if(arr[guess]>arr[guess+1]){
                res = guess;
                high = guess-1;
            }
        }
        return res;


        
    }
}