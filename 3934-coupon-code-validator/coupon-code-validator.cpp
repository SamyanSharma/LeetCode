class Solution {
public:
    bool isValid(string &s){
        if(s.size()==0) return false;
        for(char c: s){
            if(!isalnum(c) && c!='_') return false;
        }
        return true;
    }
    bool isValidBusiness(string &s){
        string acceptedBusinessLine[] = {"electronics","grocery","pharmacy","restaurant"};
        for(string b: acceptedBusinessLine){
            if(s==b) return true;
        }
        return false;
    }
    vector<string> validateCoupons(vector<string>& code, vector<string>& businessLine, vector<bool>& isActive) {
        map<string, multiset<string>> mp;
        int n = code.size();
        vector<string> result;
        for(int i=0;i<n;i++){
            if(isValid(code[i]) && isValidBusiness(businessLine[i]) && isActive[i])
            mp[businessLine[i]].insert(code[i]); 
        }
        for(auto i: mp){
            for(string j: i.second){
                result.push_back(j);
            }
        }
        return result;
    }
};