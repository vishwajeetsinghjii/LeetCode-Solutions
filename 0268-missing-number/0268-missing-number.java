class Solution {
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        for(int i : nums){
            arraySum += i;
        }
        int n = nums.length;
        int maxSum = (n*(n+1))/2;

        return maxSum - arraySum;  
    }
}