class Solution {
    public int digitFrequencyScore(int n) {
        int totalScore = 0;
        while(n > 0){
            totalScore += n % 10;
            n = n / 10;
        }
        return totalScore;
    }
}