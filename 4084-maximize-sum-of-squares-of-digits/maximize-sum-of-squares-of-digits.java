class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9 * num) return "";
        int r = sum % 9;
        StringBuilder result = new StringBuilder();
        int nines = sum / 9;
        for(int i = 0; i < nines; i++){
            result.append('9');
        }
        if(r > 0){
            result.append((char) ('0' + r));
        }
        int zeros = num - result.length();
        for(int i = 0; i < zeros; i++){
            result.append('0');
        }
        return result.toString();
    }
}