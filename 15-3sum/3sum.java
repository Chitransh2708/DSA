class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i != 0) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                } else {
                    int target = -1 * nums[i];
                    int left = i + 1;
                    int right = nums.length - 1;
                    while (left < right) {
                        if (nums[left] + nums[right] > target) {
                            right--;
                        } else if (nums[left] + nums[right] < target) {
                            left++;
                        } else {
                            List<Integer> row = new ArrayList<>();
                            row.add(nums[i]);
                            row.add(nums[left]);
                            row.add(nums[right]);
                            listOfLists.add(row);
                            left++;
                            right--;
                            while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                        }
                    }

                }
            } else {
                int target = -1 * nums[i];
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {

                    if (nums[left] + nums[right] > target) {
                        right--;
                    } else if (nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        List<Integer> row = new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[left]);
                        row.add(nums[right]);
                        listOfLists.add(row);

                        right--;
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                        
                    }
                }

            }
        }
        return listOfLists;

    }
}