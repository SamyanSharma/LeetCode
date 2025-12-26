class Solution {
public:
    int bestClosingTime(string customers) {
        int maxScore = 0;
        int score = 0;
        int bestHour = 0;
        for(int i = 0, n = customers.size(); i < n; i++){
            if(customers[i] == 'Y'){
                score += 1;
            }
            else{
                score -= 1;
            }
            if(score > maxScore){
                maxScore = score;
                bestHour = i + 1;
            }
        }
        return bestHour;
    }
};