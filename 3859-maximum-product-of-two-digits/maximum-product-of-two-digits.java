class Solution {
    public int maxProduct(int n) {
        int firstMax = 0;
        int secondMax = 0;
        while(n > 0){
            int i = n % 10;
            if(i > firstMax){
                secondMax = firstMax;
                firstMax = i;
            }
            else if(i > secondMax){
                secondMax = i;
            }
            n = n / 10;
        }
        return firstMax * secondMax;
    }
}