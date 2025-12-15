class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> result;
        result.reserve(n);
        for(int i=1;i<=n;i++){
            bool divisibleBy3 = i % 3 == 0;
            bool divisibleBy5 = i % 5 == 0;
            string str = "";
            if(divisibleBy3){
                str += "Fizz";
            }

            if(divisibleBy5){
                str += "Buzz";
            }

            if(str == ""){
                str += to_string(i);
            }
            result.push_back(str);
        }
        return result;
    }
};