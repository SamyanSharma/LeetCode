class Solution {
    public int pivotInteger(int n) {
        int leftSum = 0;
        int totalSum = (n * (n + 1)) / 2;
        for(int i = 1; i <= n; i++){
            leftSum += i;
            if(leftSum == (totalSum + i - leftSum)){
                return i;
            }
        }
        return -1;
    }
}