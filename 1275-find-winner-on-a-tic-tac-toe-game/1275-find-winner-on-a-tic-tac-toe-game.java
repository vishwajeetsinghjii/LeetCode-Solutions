class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];

        // Fill the board
        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];

            if (i % 2 == 0)
                board[r][c] = 'X';   // Player A
            else
                board[r][c] = 'O';   // Player B
        }

        if (winner(board, 'X')) return "A";
        if (winner(board, 'O')) return "B";

        return moves.length == 9 ? "Draw" : "Pending";
    }

    private boolean winner(char[][] b, char ch) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == ch && b[i][1] == ch && b[i][2] == ch)
                return true;
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (b[0][j] == ch && b[1][j] == ch && b[2][j] == ch)
                return true;
        }

        // Diagonals
        if (b[0][0] == ch && b[1][1] == ch && b[2][2] == ch)
            return true;

        if (b[0][2] == ch && b[1][1] == ch && b[2][0] == ch)
            return true;

        return false;
    }
}