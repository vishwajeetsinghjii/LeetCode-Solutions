class Solution {
    public int minimumSwaps(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int swapCount = 0;
        while (i <= j) {
            if (nums[i] != 0) {
                i++;
            } else if (nums[j] == 0) {
                j--;
            } else {
                swapCount++;
                i++;
                j--;
            }
        }
        return swapCount;
    }
}