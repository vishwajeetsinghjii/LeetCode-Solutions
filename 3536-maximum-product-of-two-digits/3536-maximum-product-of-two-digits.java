class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        while(n>0){
            int ld = n % 10;
            if(ld>=max){
                smax = max;
                max = ld;
            }else if(ld>smax){
                smax = ld;
            }
            n /= 10;
        }
        return max*smax;
    }
}