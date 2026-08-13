class Solution {
    public int countEven(int num) {
        int temp = num;
        int digitSum = 0;
        
        // Calculate the sum of digits of num
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        
        // If digitSum is even, subtract 0; if odd, subtract 1
        return (num - (digitSum % 2)) / 2;
    }
}