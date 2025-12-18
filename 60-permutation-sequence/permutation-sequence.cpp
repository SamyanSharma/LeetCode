class Solution {
public:
    string getPermutation(int n, int k) {
        vector<int> number;
        int fact = 1;
        for(int i=1;i<n;i++){
            fact *= i;
            number.push_back(i);
        }
        number.push_back(n);
        string result = "";
        k = k -1;
        while(true){
            int index = k/fact;
            result += to_string(number[index]);
            number.erase(number.begin()+index);
            if(number.empty()) break;
            k = k % fact;
            fact = fact / number.size();
        }
        return result;
    }
};