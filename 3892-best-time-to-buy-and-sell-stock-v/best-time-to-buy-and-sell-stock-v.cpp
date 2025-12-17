class Solution {
public:
    long long solve(int i,  int state, vector<int>& prices, int k,
                    vector<vector<vector<long long>>>& dp) {

        if (k < 0) {
            return -1e9;
        }
        if (i == prices.size()) {

            if (state == 0) {
                return 0;
            }

            return -1e9;
        }
        if (dp[i][k][state] != -1) {
            return dp[i][k][state];
        }

        long long normal = -1e9;
        long long shortSell = -1e9;
        long long skip = solve(i + 1,  state, prices, k, dp);

        if (state == 0) {
            normal = -prices[i] + solve(i + 1, 1, prices, k, dp);
            shortSell = prices[i] + solve(i + 1, 2, prices, k, dp);

        }

        else if (state == 1) {
            normal = prices[i] + solve(i + 1, 0, prices, k - 1, dp);

        } else {
            shortSell = -prices[i] + solve(i + 1, 0, prices, k - 1, dp);
        }

        return dp[i][k][state] = max(normal, max(shortSell, skip));
    }
    long long maximumProfit(vector<int>& prices, int k) {
        int n = prices.size();
            vector<vector<vector<long long>>> dp(n, vector<vector<long long>>(k+1, vector<long long>(3, -1)));
            return solve(0, 0, prices, k, dp);
    }
};