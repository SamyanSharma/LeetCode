class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(((int) Math.log10(num) + 1 ) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}