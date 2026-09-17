class Solution {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        int i = 0;
        int n = s.length();
        while(i < n && s.charAt(i) == ' ') i++;
        if(i == n) return 0;
        int sign = 1;
        if(s.charAt(i) == '+')i++;
        else if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        long result = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            if(sign * result <= INT_MIN) return INT_MIN;
            if(sign * result >= INT_MAX) return INT_MAX;
            i++;
        }
        return (int)(result * sign);
    }
}