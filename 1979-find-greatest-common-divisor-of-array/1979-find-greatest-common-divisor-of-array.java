class Solution {
    public int findGCD(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        while (smallest != 0) {
            int temp = smallest;
            smallest = largest % smallest;
            largest = temp;
        }
        return largest;
    }
}