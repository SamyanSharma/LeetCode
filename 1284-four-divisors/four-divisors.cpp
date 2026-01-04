class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        int n = nums.size();
        int result = 0;
        for (int num: nums){
            int count = 0;
            int sum = 0;
            for(int i = 1; i * i <= num; i++){
                if (num % i == 0){
                    count++;
                    sum += i;
                    if (i * i != num){
                    count++;
                    sum += num / i;
                    }
                }
                if (count > 4) break;
            }
            if (count == 4){
                result += sum;
            }
        }
        return result;
    }
};