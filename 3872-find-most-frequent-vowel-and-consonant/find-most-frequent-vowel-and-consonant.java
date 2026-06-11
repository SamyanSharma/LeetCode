class Solution {
    public int maxFreqSum(String s) {
        if(s == null || s.isEmpty()) return 0;
        int[] freq = new int[26];
        int n = s.length();
        int maxVowel = 0;
        int maxConsonant = 0;
        for(int i = 0; i < n; i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(i == 'a' - 'a' || i == 'e' - 'a' || i == 'i' - 'a' || i == 'o' - 'a' || i == 'u' - 'a'){
                if(freq[i] > maxVowel){
                    maxVowel = freq[i];
                }
            }
            else{
                if(freq[i] > maxConsonant){
                    maxConsonant = freq[i];
                }
            }
        }
        return maxVowel + maxConsonant;
    }
}