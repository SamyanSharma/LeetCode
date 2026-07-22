class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int duplicate = -1;
        int missing = - 1;
        for(int a: nums){
            count[a]++;
        }
        for(int i = 1; i <= n; i++){
            if(count[i] == 0){
                missing = i;
            } else if (count[i] == 2){
                duplicate = i;
            }
            if(missing != -1 && duplicate != -1) break;
        }
        return new int[] {duplicate, missing};
    }
}