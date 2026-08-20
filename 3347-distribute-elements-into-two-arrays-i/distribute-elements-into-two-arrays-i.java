class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        arr[n - 1] = nums[1];
        int index = 0;
        int revIndex = n - 1;
        for(int i = 2; i < n; i++){
            if(arr[index] > arr[revIndex]){
                arr[++index] = nums[i];
            } else{
                arr[--revIndex] = nums[i];
            }
        }
        for(int l = revIndex, r = n - 1; l < r; l++, r--){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }
}