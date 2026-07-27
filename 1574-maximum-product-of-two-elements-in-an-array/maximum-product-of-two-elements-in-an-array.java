class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;
        for(int i: nums){
            if(i > firstMax){
                secondMax = firstMax;
                firstMax = i;
            } else if(i > secondMax){
                secondMax = i;
            }
        }
        return (firstMax - 1) * (secondMax - 1);
    }
}