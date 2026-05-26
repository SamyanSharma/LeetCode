class Solution {
    public int numberOfSpecialChars(String word) {
        boolean upper[] = new boolean[26];
        boolean lower[] = new boolean[26];
        int count = 0;

        for(char c: word.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                lower[c - 'a'] = true;
            }
            else{
                upper[c - 'A'] = true;
            }
        }

        for(int i = 0; i < 26; i++){
            if(lower[i] && upper[i]){
                count++;
            }
        }
        
        return count;
    }
}