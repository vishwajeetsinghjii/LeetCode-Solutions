class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reversed = 0;
        int original = x;
        while(x!=0){
            int lastDigit=x%10;
            reversed = reversed*10 + lastDigit;
            x/=10;
        }
        if(original == reversed){
            return true;
        }
        return false;
    }
}