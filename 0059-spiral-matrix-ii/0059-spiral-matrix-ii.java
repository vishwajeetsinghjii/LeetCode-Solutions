class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int stRow = 0;
        int stCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        int count = 1;
        while (stRow <= endRow && stCol <= endCol) {
            //top
            for (int j = stCol; j <= endCol; j++) {
                matrix[stRow][j] = count;
                count++;
            }
            //right
            for (int i = stRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = count;
                count++;
            }
            //bottom
            for (int j = endCol - 1; j >= stCol; j--) {
                if (stRow == endRow) {
                    break;
                }
                matrix[endRow][j] = count;
                count++;
            }
            //left
            for (int i = endRow - 1; i >= stRow + 1; i--) {
                if (stCol == endCol) {
                    break;
                }
                matrix[i][stCol]= count;
                count++;
            }
            stCol++;
            stRow++;
            endCol--;
            endRow--;
        }
        return matrix;
    }
}