class Solution {
public:
    int numOfWays(int n) {
        long MOD = 1e9 + 7;
        long abc = 6;
        long aba = 6;
        long new_abc, new_aba;
        for (int i = 1; i < n; i++){
            new_aba = (3 * aba + 2 * abc) % MOD;
            new_abc = (2 * aba + 2 * abc) % MOD; 
            abc = new_abc;
            aba = new_aba;
        }
        return (abc + aba) % MOD;
    }
};