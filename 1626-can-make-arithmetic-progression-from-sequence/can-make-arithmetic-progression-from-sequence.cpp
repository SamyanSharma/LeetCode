class Solution {
public:
    bool canMakeArithmeticProgression(vector<int>& arr) {
        sort(arr.begin(), arr.end());
        bool arithmeticProgression = true;
        int n = arr.size();
        int diff = arr[1] - arr[0];
        for(int i=0;i<n-1;i++){
            int j = i+1;
            if(arr[j]-arr[i] != diff){
                arithmeticProgression = false;
            }
        }
        return arithmeticProgression;
    }
};