class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        long long sum = 0;
        int count = 0;
        int n = matrix.size();
        int m = matrix[0].size();
        int minVal = INT_MAX;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j] < 0){
                    count++;
                }
                minVal = min(minVal, abs(matrix[i][j]));
                sum += abs(matrix[i][j]);
            }
        }
        if (count % 2 == 1){
            sum -= 2 * minVal; // Since its already added once
        }
        return sum;
    }
};