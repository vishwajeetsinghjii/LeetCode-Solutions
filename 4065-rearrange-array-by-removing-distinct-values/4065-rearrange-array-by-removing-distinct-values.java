class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq = new int[101];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int[] ans = new int[nums.length];
        int index = 0;
        while(index < nums.length){
            for(int value=1; value<=100; value++){
                if(freq[value]>0){
                    ans[index++] = value;
                    freq[value]--;
                }
            }
        }
        return ans;
    }
}