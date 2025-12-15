class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int maxWealth = 0;
        for(const auto& customer: accounts){
            int wealth = 0;
            for(int amount: customer){
                wealth += amount;
            }
            maxWealth = max(maxWealth, wealth);
        }
        return maxWealth;
    }
};