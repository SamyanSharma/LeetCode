class Solution {
    public String tictactoe(int[][] moves) {
        int[] row = new int[3];
        int[] col = new int[3];
        int diagonal = 0;
        int antiDiagonal = 0;
        int player = 1;
        for(int[] move: moves){
            int r = move[0];
            int c = move[1];
            row[r] += player;
            col[c] += player;
            if(r == c) diagonal += player;
            if(r + c == 2) antiDiagonal += player;
            if(Math.abs(row[r]) == 3 || Math.abs(col[c]) == 3 || Math.abs(diagonal) == 3 || Math.abs(antiDiagonal) == 3){
                return player == 1 ? "A" : "B";
            }
            player *= -1;
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}