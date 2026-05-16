class Solution {
    public int subsetXORSum(int[] nums) {
        int bitwiseOr = 0;
        for(int i: nums){
            bitwiseOr |= i;
        }
        return bitwiseOr * (1 << (nums.length - 1)); // bitwiseOr * 2^(N-1)
    }
}