class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        boolean[] seen = new boolean[nums.length + 1];

        for (int num : nums) {
            if (seen[num]) {
                ans[0] = num;
            }
            seen[num] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}