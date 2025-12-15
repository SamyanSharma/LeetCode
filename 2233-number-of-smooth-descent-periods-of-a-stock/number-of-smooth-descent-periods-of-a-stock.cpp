class Solution {
public:
    long long getDescentPeriods(vector<int>& prices) {
        long long ans = 0;
        int count = 1;
        int n = prices.size();
        for(int i=1;i<n;i++){
            if(prices[i-1]-prices[i]==1){
                count++;
            }else{
                ans+= (count * 1LL * (count+1))/2;
                count = 1;
            }
        }
        ans += (count * 1LL * (count+1))/2;
        return ans;
    }
};