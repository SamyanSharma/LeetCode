class Solution {
public:
    vector<int> next(vector<int>& heights){
        int n = heights.size();
        vector<int> nextSmaller(n, n);
        stack<int> s;
        for(int i = n - 1; i >= 0; i--){
            while(s.size() > 0 && heights[s.top()] >= heights[i]){
                s.pop();
            }
            if(s.size() != 0){
                nextSmaller[i] = s.top();
            }
            s.push(i);
        }
        return nextSmaller;
    }
    vector<int> prev(vector<int>& heights){
        int n = heights.size();
        vector<int> prevSmaller(n, -1);
        stack<int> s;
        for(int i = 0; i < n; i++){
            while(s.size() > 0 && heights[s.top()] >= heights[i]){
                s.pop();
            }
            if(s.size() != 0){
                prevSmaller[i] = s.top();
            }
            s.push(i);
        }
        return prevSmaller;
    }
    int max_area(vector<int>& heights){
        int n = heights.size();
        vector<int> prevSmaller = prev(heights);
        vector<int> nextSmaller = next(heights);
        int maxi = 0;
        for(int i = 0; i < n; i++){
            int width = nextSmaller[i] - prevSmaller[i] - 1;
            maxi = max(maxi, width * heights[i]);
        }
        return maxi;
    }
    int maximalRectangle(vector<vector<char>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();
        vector<int> pre(m, 0);
        vector<int> curr(m, 0);
        int maxi = 0;
        for(int i = 0; i < n; i++){
            if(i != 0){
                for(int j = 0; j < m; j++){
                    if(matrix[i][j] == '0'){
                        curr[j] = 0;
                    }else{
                        curr[j] = 1 + pre[j];
                    }
                }
            }
            else{
                for(int j = 0; j < m; j++){
                    pre[j] = matrix[i][j] - '0';
                }
            }
            if(i == 0){
                maxi = max(maxi, max_area(pre));
            }else{
                maxi = max(maxi, max_area(curr));
            }
            if(i != 0){
                pre = curr;
            }
        }
        return maxi;
    }
};