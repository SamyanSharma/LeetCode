class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        if(h < n) return -1;
        int left = 1;
        int right = 0;
        for(int i: piles){
            right = Math.max(right, i);
        }
        int result = right;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(helper(piles, h, mid)){
                result = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return result;
    }

    private boolean helper(int[] piles, int h, int k){
        long hours = 0;
        for(int p: piles){
            hours += p / k;
            if( p % k != 0) hours++;
        }
        return hours <= h;
    }
}