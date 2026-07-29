class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            result += (26 - (s.charAt(i) - 'a')) * (i + 1);
        }
        return result;
    }
}