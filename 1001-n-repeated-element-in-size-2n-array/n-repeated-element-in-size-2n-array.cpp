class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        unordered_map <int, int> mp;
        int len = nums.size();
        int n = len / 2;
        for (int i = 0; i < len; i++){
            mp[nums[i]]++;
            if(mp[nums[i]] == n){
                return nums[i];
            }
        }
        return 0;
    }
};