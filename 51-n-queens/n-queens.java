class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        helper(0, board, result);
        return result;
    }

    private void helper(int row, char[][] board, List<List<String>> result){
        if(row == board.length){
            result.add(construct(board));
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                helper(row + 1, board, result);
                board[row][i] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int r, int c){
        int n = board.length;
        for(int i = 0; i < r; i++){
            if(board[i][c] == 'Q') return false;
        }
        for(int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }
        for(int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    private List<String> construct(char[][] board){
        List<String> list = new ArrayList<>();
        for(char[] row: board){
            list.add(new String(row));
        }
        return list;
    }
}