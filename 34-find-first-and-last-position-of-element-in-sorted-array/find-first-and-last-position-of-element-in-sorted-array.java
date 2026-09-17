class Solution {
    public int firstOccurence(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while (low <=high) {
            int guess = (low + high) / 2;
            if (nums[guess] > target) {
                high = guess - 1;
            } else if (nums[guess] < target) {
                low = guess + 1;
            } else {
                res = guess;
                high = guess - 1;

            }
        }
        return res;

    }

    public int lastOccurence(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while (low <= high) {
            int guess = (low + high) / 2;
            if (nums[guess] > target) {
                high = guess - 1;
            } else if (nums[guess] < target) {
                low = guess + 1;
            } else {
                res = guess;
                low = guess + 1;

            }
        }
        return res;

    }

    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        int bestMax = Integer.MIN_VALUE;
        int bestMin = Integer.MAX_VALUE;
        if (nums.length == 0) {
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        int x1 = firstOccurence(nums, target);
        int x2 = lastOccurence(nums, target);
        arr[0] = x1;
        arr[1] = x2;
        return arr;
    }
}