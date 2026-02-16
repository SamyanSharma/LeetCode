class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int matrixSum = 0;
        for(int i = 0; i < n; i++){
            matrixSum += mat[i][i];
            matrixSum += mat[n - i - 1][i];
        }
        if(n % 2 != 0){
            matrixSum -= mat[n / 2][n / 2];
        }
        return matrixSum;
    }
}