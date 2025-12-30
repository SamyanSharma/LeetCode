class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map <int, int> mp;
        mp.reserve(nums.size());
        for(int i = 0; i < nums.size(); i++){
            int diff = target - nums[i];
            if(mp.find(diff) != mp.end()) return {mp[diff], i};
            mp[nums[i]] = i;
        }
        return {};
    }
};