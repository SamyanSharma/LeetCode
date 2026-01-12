class Solution {
public:
    int minTimeToVisitAllPoints(vector<vector<int>>& points) {
        int minTime = 0;
        for (int i = 0; i < points.size() - 1; i++){
            int currentX = points[i][0];
            int currentY = points[i][1];
            int targetX = points[i+1][0];
            int targetY = points[i+1][1];
            minTime += max(abs(targetX - currentX), abs(targetY - currentY));
        }
        return minTime;
    }
};