class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 4) return result;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            long minSum1 = (long)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if(minSum1 > target) break;
            long maxSum1 = (long)nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1];
            if(maxSum1 < target) continue;
            for(int j = i + 1; j < n - 2; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                long minSum2 = (long)nums[i] + nums[j] + nums[j + 1] + nums[j + 2];
                if(minSum2 > target) break;
                long maxSum2 = (long)nums[i] + nums[j] + nums[n - 2] + nums[n - 1];
                if(maxSum2 < target) continue;
                int left = j + 1;
                int right = n - 1;
                while(left < right){
                    long currSum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(currSum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left - 1])left++;
                        while(left < right && nums[right] == nums[right + 1]) right--;
                    } else if(currSum < target) left++;
                    else right--;
                }  
            }
        }
        return result;
    }
}