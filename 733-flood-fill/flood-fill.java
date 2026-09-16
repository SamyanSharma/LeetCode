class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor == color) return image;
        int m = image.length;
        int n = image[0].length;
        int[] checkRow = {-1, 1, 0, 0};
        int[] checkCol = {0, 0, -1, 1};
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{sr, sc});
        image[sr][sc] = color;
        while(!stack.isEmpty()){
            int[] curr = stack.pop();
            int row = curr[0];
            int col = curr[1];
            for(int i = 0; i < 4; i++){
                int nr = row + checkRow[i];
                int nc = col + checkCol[i];
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && image[nr][nc] == originalColor){
                    image[nr][nc] = color;
                    stack.push(new int[]{nr, nc});
                }
            }
        }
        return image;
    }
}