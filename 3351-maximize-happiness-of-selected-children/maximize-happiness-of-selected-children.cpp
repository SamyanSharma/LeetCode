class Solution {
public:
    long long maximumHappinessSum(vector<int>& happiness, int k) {
        long long sum = 0;
        int turns = 0;
        sort(happiness.begin(), happiness.end(), greater<int>());
        for(int i=0; i<k; i++){
            if(happiness[i]>turns){
                cout << happiness[i] << endl;
                sum += happiness[i] - turns;
            }
            turns++;
        }
        return sum;
    }
};