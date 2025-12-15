class Solution {
public:
    int pivotInteger(int n) {
        int pivotInt = 0;
        int sumLeft = 0;
        bool exist = false;
        for(int i=1;i<=n;i++){
            int x = i;
            int sumRight = 0;
            sumLeft = x * (x + 1) / 2;
            sumRight = (n * (n + 1) / 2) - (x * (x - 1)/2);
            if(sumLeft == sumRight){
                exist = true;
                pivotInt = x;
            }
        }
        if(exist){
            return pivotInt;
        }
        else{
            return -1;
        }
    }
};