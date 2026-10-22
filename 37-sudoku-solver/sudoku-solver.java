class Solution {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    private boolean helper(char[][] board, int row, int col){
        if(row == 9) return true;
        if(col == 9) return helper(board, row + 1, 0);
        if(board[row][col] != '.') return helper(board, row, col + 1);
        for(char num = '1'; num <= '9'; num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = num;
                if(helper(board, row, col + 1)) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int r, int c, int num){
        for(int i = 0; i < 9; i++){
            if(board[r][i] == num) return false;
            if(board[i][c] == num) return false;
        }
        int r1 = r - (r % 3);
        int c1 = c - (c % 3);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i + r1][j + c1] == num) return false;
            }
        }
        return true;
    }
}