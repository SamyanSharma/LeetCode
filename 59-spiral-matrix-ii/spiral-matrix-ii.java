class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int value = 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                arr[top][i] = value++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                arr[i][right] = value++;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    arr[bottom][i] = value++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    arr[i][left] = value++;
                }
                left++;
            }
        }
        return arr;
    }
}