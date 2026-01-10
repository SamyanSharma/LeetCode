class Solution {
public:
    int solve(int i, int j, string& s1, string& s2, vector<vector<int>>& dp){
        if(i==s1.size() && j==s2.size()){
            return 0;
        }
        if(i==s1.size()){
            int ans = 0;
            while(j < s2.size()){
                ans += s2[j];
                j++;
            }
            return ans;
        }
        if(j==s2.size()){
            int ans = 0;
            while(i < s1.size()){
                ans += s1[i];
                i++;
            }
            return ans;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1[i]==s2[j]){
            return dp[i][j] = solve(i+1, j+1, s1, s2, dp);
        }
        else{
            return dp[i][j] = min(solve(i+1, j, s1, s2, dp) + s1[i], solve(i, j+1, s1, s2, dp) + s2[j]);
        }
        return 1;
    }
    int minimumDeleteSum(string s1, string s2) {
        int n = s1.size();
        int m = s2.size();
        vector<vector<int>>dp(n, vector<int>(m, -1));
        return solve(0,0,s1,s2,dp);
    }
};