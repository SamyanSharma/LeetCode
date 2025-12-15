class Solution {
public:
    int numberOfWays(string corridor) {
        const int mod = 1e9+7;
        int count = 0;
        int prefix = 0;
        int ans = 1;
        for(char c:corridor){
            if(c=='S'){
                prefix++;
            }
            if(prefix==2){
                count++;
            }
            if(prefix==3){
                ans = (ans*1LL*count)%mod;
                count = 0;
                prefix = 1;
            }
        }
        if(prefix!=2){
            return 0;
        }
        return ans;
    }
};