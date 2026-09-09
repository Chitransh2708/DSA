class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int index[] = new int[2];

        while (i < j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] == target) {
                index[0] = i + 1;
                index[1] = j + 1;
                break;
            } else {
                return index;
            }
        }
        return index;
    }
}