class Solution {
public:
    int romanToInt(string s) {
        unordered_map <char, int> mp;
        mp['I'] = 1;
        mp['V'] = 5;
        mp['X'] = 10;
        mp['L'] = 50;
        mp['C'] = 100;
        mp['D'] = 500;
        mp['M'] = 1000;
        int n = s.length();
        int total = 0;
        for(int i = 0 ; i < n; i++){
            if(i < n - 1 && mp[s[i+1]]>mp[s[i]]){
                total -= mp[s[i]];
            }else{
                total += mp[s[i]];
            }
        }
        return total;
    }
};