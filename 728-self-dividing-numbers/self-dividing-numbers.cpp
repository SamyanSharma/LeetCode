class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> list;
        for(int i=left;i<=right;i++){
            int num = i;
            bool divisible = true;
            while(num>0){
                int mod = num % 10;
                num = num / 10;
                if(mod == 0 || i % mod != 0){
                    divisible = false;
                }
            }
            if(divisible){
                list.push_back(i);
            }
        }
        return list;
    }
};