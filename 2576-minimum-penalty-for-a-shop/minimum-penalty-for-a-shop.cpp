class Solution {
public:
    int bestClosingTime(string customers) {
        int minPenalty = 0;
        int currPenalty = 0;
        int earliestHour = 0;
        int n = customers.size();
        for (int i = 0; i < n; i++){
            char ch = customers[i];
            if(ch == 'Y'){
                currPenalty--;
            }else{
                currPenalty++;
            }
            if(currPenalty < minPenalty){
                earliestHour = i + 1;
                minPenalty = currPenalty;
            }
        }
        return earliestHour;
    }
};