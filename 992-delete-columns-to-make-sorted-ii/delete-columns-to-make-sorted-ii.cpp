class Solution {
public:
    int minDeletionSize(vector<string>& strs) {
        int rows = strs.size();
        int cols = strs[0].size();
        int delCount = 0;
        vector<bool> isSorted(rows, false);
        
        for(int j=0; j<cols; j++){
            bool keep_col = true;
            for(int i=1; i<rows; i++){
                if(!isSorted[i] && strs[i-1][j] > strs[i][j]){
                    keep_col = false;
                    break;
                }
            }
            if(keep_col){
                for(int i=1; i<rows; i++){
                    if(strs[i-1][j] < strs[i][j]){
                        isSorted[i] = true;
                    }
                }
            }else{
                delCount++;
            }
        }
        return delCount;
    }
};