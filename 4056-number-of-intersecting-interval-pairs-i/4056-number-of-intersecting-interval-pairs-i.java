class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int m = intervals.length;
        int count = 0;

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {

                if (Math.max(intervals[i][0], intervals[j][0])
                        <= Math.min(intervals[i][1], intervals[j][1])) {
                    count++;
                }
            }
        }

        return count;
    }
}