class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int prefix_max[] = new int[n];
        int suffix_min[] = new int[n];
        prefix_max[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix_max[i] = Math.max(prefix_max[i - 1], nums[i]);
        }
        suffix_min[n-1] = nums[n-1];
        for(int i = n - 2; i >= 0; i--){
            suffix_min[i] = Math.min(suffix_min[i + 1], nums[i]);
        }
        ans[n - 1] = prefix_max[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(prefix_max[i] > suffix_min[i + 1]){
                ans[i] = ans[i + 1];
            }
            else{
                ans[i] = prefix_max[i];
            }
        }
        return ans;
    }
}