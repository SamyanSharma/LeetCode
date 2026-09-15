class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int result = 0;
        int zeroCount = 0;
        int oneCount = 0;
        for(int right = 0; right < s.length(); right++){
            if(s.charAt(right) == '1') oneCount++;
            else zeroCount++;
            while(zeroCount > k && oneCount > k){
                if(s.charAt(left) == '0') zeroCount--;
                else oneCount--;
                left++;
            }
            result += right - left + 1;
        }
        return result;
    }
}