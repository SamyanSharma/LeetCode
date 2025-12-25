class Solution {
public:
    long long maximumHappinessSum(vector<int>& happiness, int k) {
        int n = happiness.size();
        long long sum = 0;
        int turns = 0;
        sort(happiness.begin(), happiness.end());
        for(int i=1; i<=k; i++){
            if(happiness[n-i]>turns){
                cout << happiness[n-i] << endl;
                sum += happiness[n-i] - turns;
            }
            turns++;
        }
        return sum;
    }
};