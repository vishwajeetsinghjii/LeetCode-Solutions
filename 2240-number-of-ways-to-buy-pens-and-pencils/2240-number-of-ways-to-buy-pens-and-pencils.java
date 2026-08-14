class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long count = 0;
        while(total>=0){
            count += (long)total/cost2 + 1;
            total -= cost1;
        }
        return count;
    }
}