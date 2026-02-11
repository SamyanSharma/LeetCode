class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int mostWater = Integer.MIN_VALUE;
        while(left < right){
            int min = Integer.MAX_VALUE;
            if(height[left] < min){
                min = height[left];
            }
            if(height[right] < min){
                min = height[right];
            }
            int water = min * (right - left);
            if(water > mostWater){
                mostWater = water;
            }
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