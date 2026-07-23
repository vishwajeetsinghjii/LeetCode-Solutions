class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i =0;
        int j= height.length-1;
        while(i<j){
            int h = Math.min(height[i], height[j]);
            int width = j-i;
            int currWater = h * width;
            maxWater = Math.max(maxWater, currWater);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
}