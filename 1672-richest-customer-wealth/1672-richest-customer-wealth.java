class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0; i<accounts.length; i++){
            int wealth = 0;
            for(int j=0; j<accounts[0].length; j++){
               wealth+=accounts[i][j];
            }
            if(wealth>maxwealth){
                maxwealth=wealth;
            }
        }
        return maxwealth;
    }
}