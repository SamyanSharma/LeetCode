class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(leftSum == (totalSum - nums[i] - leftSum)){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}