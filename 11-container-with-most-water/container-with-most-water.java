class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int mostWater = Integer.MIN_VALUE;
        while(left < right){
            int min = Math.min(height[left], height[right]);
            int water = min * (right - left);
            mostWater = Math.max(water, mostWater);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return mostWater;
    }
}