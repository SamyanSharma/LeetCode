class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] best = new int[n];
        Arrays.fill(best, Integer.MAX_VALUE);
        int result = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;
        for(int right = 0; right < arr.length; right++){
            currSum += arr[right];
            while(currSum > target){
                currSum -= arr[left];
                left++;
            }
            if(currSum == target){
                int currLen = right - left + 1;
                if(left > 0 && best[left - 1] != Integer.MAX_VALUE){
                    result = Math.min(result, best[left - 1] + currLen);
                }
                best[right] = currLen;
            }
            if(right > 0){
                best[right] = Math.min(best[right], best[right - 1]);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}