class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        unordered_map<char, int> magazineLetter;
        for(char c: magazine){
            magazineLetter[c]++;
        }
        for(char r: ransomNote){
            if (magazineLetter[r] == 0){
                return false;
            }
            magazineLetter[r]--;
        }
        return true;
    }
};