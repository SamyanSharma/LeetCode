class Solution {
public:
    int B;

    vector<int> merge(const vector<int>& dp1, const vector<int>& dp2) {
        vector<int> next(B + 1, -1e9);
        for (int i = 0; i <= B; i++) {
            if (dp1[i] < 0) continue;
            for (int j = 0; i + j <= B; j++) {
                if (dp2[j] < 0) continue;
                next[i + j] = max(next[i + j], dp1[i] + dp2[j]);
            }
        }
        return next;
    }

    void dfs(int u, const vector<vector<int>>& tree, 
             const vector<int>& present, const vector<int>& future, 
             vector<vector<vector<int>>>& dp) {
        
        vector<int> skipBranch(B + 1, -1e9);
        vector<int> buyBranch(B + 1, -1e9);
        
        skipBranch[0] = 0;
        buyBranch[0] = 0;

        for (int v : tree[u]) {
            dfs(v, tree, present, future, dp);
            skipBranch = merge(skipBranch, dp[v][0]);
            buyBranch = merge(buyBranch, dp[v][1]);
        }

        for (int parentBought = 0; parentBought <= 1; parentBought++) {
            int price = parentBought ? present[u] / 2 : present[u];
            int profit = future[u] - price;
            
            vector<int> currentDP = skipBranch;
            
            if (price <= B) {
                for (int b = 0; b <= B - price; b++) {
                    if (buyBranch[b] > -1e9) {
                        currentDP[b + price] = max(currentDP[b + price], buyBranch[b] + profit);
                    }
                }
            }
            dp[u][parentBought] = currentDP;
        }
    }

    int maxProfit(int n, vector<int>& present, vector<int>& future, 
                  vector<vector<int>>& hierarchy, int budget) {
        B = budget;
        vector<vector<int>> tree(n);
        for (auto& edge : hierarchy) {
            tree[edge[0] - 1].push_back(edge[1] - 1);
        }

        vector<vector<vector<int>>> dp(n, vector<vector<int>>(2));

        dfs(0, tree, present, future, dp);

        int ans = 0;
        for (int b = 0; b <= B; b++) {
            ans = max(ans, dp[0][0][b]);
        }
        return ans;
    }
};