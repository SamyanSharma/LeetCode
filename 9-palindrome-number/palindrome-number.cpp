class Solution {
public:
    bool isPalindrome(int x) {
        long long original = x;
        long long reverse = 0;
        while(x>0){
            int mod = x % 10;
            reverse = reverse * 10 + mod;
            x = x/10;
        }
        if(original==reverse){
            return true;
        }else{
            return false;
        }
    }
};