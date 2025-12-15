class Solution {
public:
    int countPartitions(vector<int>& nums) {
        int sum = 0;
        int size = nums.size();
        for (int i = 0; i < size; i++)
            sum += nums[i];

        return sum % 2 ? 0 : size - 1;
    }
};