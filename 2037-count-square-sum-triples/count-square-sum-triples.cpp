class Solution {
public:
    int countTriples(int n) {
        int count = 0;
        for(int a=1;a<=n;a++){
            for(int b=a+1;b<=n;b++){
                int c_sqr = a * a + b * b;
                int c = sqrt(c_sqr);
                if(c * c == c_sqr && c<=n){
                    count += 2;
                }
            }
        }
        return count;
    }
};