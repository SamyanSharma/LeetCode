class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int result[] = new int[n];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int val: matrix[i]){
                sum += val;
            }
            result[i] = sum;
        }
        return result;
    }
}