class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int mostWater = Integer.MIN_VALUE;
        while(left < right){
            int min = Math.min(height[left], height[right]);
            mostWater = Math.max(mostWater, min * (right - left));
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