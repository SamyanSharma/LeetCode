class Solution {
public:
    int countPermutations(vector<int>& complexity) {
        int n = complexity.size();
        const int mod = 1e9 + 7;
        long long int count = 1;
        for(int i=1;i<n;i++){
            if(complexity[i]<=complexity[0]){
                return 0;
            }
            count = (count * 1LL * i) % mod;
        }
        return count;
    }
};