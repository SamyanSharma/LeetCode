class Solution {
public:
    int specialTriplets(vector<int>& nums) {
        unordered_map<int, int> mp;
        for(int i: nums){
            mp[i]++;
        }
        unordered_map<int, int> prefix;
        const int MOD = 1e9 + 7;
        long long count = 0;
        for(int i: nums){
            int total = mp[2 * i];
            int left = prefix[2*i];
            int right = total - left;
            if (i == 0){
                right--;
            }
            prefix[i]++;
            count = (count + left * 1LL * right) % MOD;
        }
        return count;
    }
};