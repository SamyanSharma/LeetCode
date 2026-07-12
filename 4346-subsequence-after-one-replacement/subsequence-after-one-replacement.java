class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int m = s.length();
        for(char c: t.toCharArray()){
            if(s.charAt(i) == c) i++;
            i = Math.max(i, j + 1);
            if(s.charAt(j) == c) j++;
            if(i == m || j == m) return true;
        }
        return false;
    }
}