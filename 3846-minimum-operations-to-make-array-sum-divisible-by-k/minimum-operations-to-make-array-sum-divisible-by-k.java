class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        for(int i: nums){
            sum += i;
        }
        return (int)(sum % k);
    }
}