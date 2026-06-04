class Solution {
    public int totalWaviness(int num1, int num2) {
        int totalWavieness = 0;
        for(int i = num1; i <= num2; i++){
            totalWavieness += waviness(i);
        }
        return totalWavieness;
    }

    private int waviness(int num){
        String s = Integer.toString(num);
        int waviness = 0;

        for(int i = 1; i < s.length() - 1; i++){
            boolean isPeak = s.charAt(i) > s.charAt(i - 1) && s.charAt(i) > s.charAt(i + 1);
            boolean isValley = s.charAt(i) < s.charAt(i - 1) && s.charAt(i) < s.charAt(i + 1);
            if(isPeak || isValley){
                waviness++;
            }
        }
        return waviness;
    }
}