class Solution {
public:
    long long maximumHappinessSum(vector<int>& happiness, int k) {
        long long sum = 0;
        long long turns = 0;
        sort(happiness.begin(), happiness.end(), greater<int>());
        for(int i=0; i<k; i++){
            sum += max(0LL, happiness[i]-turns);
            turns++;
        }
        return sum;
    }
};