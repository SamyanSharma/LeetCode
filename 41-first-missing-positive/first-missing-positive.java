class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n + 2];
        for(int i: nums){
            if(i > 0 && i <= n + 1){
                arr[i] = true;
            }
        }
        for(int i = 1; i <= n + 1; i++){
            if(arr[i] == false){
                return i;
            }
        }
        return n + 1;
    }
}