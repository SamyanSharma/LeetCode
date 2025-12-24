class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {
        int n = apple.size();
        int m = capacity.size();
        sort(capacity.begin(), capacity.end());
        int result = 0;
        int totalCount = 0;
        for(int i: apple){
            totalCount += i;
        }
        int pos = m - 1;
        while(totalCount > 0){
            totalCount -= capacity[pos];
            pos--;
            result++; 
        }
        return result;
    }
};