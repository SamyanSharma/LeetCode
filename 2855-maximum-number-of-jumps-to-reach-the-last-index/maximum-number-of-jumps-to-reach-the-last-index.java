class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for(int j = 0; j < n; j++){
            for(int i = 0; i < j; i++){
                if(dp[i] != -1 && (Math.abs(nums[j] - nums[i]) <= target )){
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}