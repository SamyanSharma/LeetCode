class Solution {
public:
    int numberOfSteps(int num) {
        int steps = 0;
        int n = num;
        while(n>0){
            if(n%2==0){
                n = n/2;
                steps++;
            }else{
                n = n - 1;
                steps++;
            }
        }
        return steps;
    }
};