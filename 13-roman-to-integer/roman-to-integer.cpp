class Solution {
public:
    int romanToInt(string s) {
        static int value[128];
        value['I'] = 1;
        value['V'] = 5;
        value['X'] = 10;
        value['L'] = 50;
        value['C'] = 100;
        value['D'] = 500;
        value['M'] = 1000;
        int total = 0;
        for(int i = 0 ; i < s.length(); i++){
            int current = value[s[i]];
            if(value[s[i+1]]>current){
                total -= current;
            }else{
                total += current;
            }
        }
        return total;
    }
};