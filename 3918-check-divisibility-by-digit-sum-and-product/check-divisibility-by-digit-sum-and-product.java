class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int digitSum = 0;
        int digitProduct = 1;
        while(temp > 0){
            int mod = temp % 10;
            digitSum += mod;
            digitProduct *= mod;
            temp = temp / 10;
        }
        return n % (digitSum + digitProduct) == 0;
    }
}