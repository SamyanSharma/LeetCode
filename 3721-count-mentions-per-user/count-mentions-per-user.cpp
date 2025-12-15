class Solution {
public:
    static bool check(vector<string> a, vector<string> b){
        if(a[1]==b[1]){
            return a[0]>b[0];
        }
        return stoi(a[1]) < stoi(b[1]);
    }

    vector<int> solve(string& s){
        int n = s.size();
        string id = "";
        vector<int> ids;
        for(char c: s){
            if(c == 'i' || c == 'd'){
                continue;
            }
            if(c == ' '){
                ids.push_back(stoi(id));
                id = "";
            }else{
                id += c;
            }
        }
        ids.push_back(stoi(id));
        return ids;
    }

    vector<int> countMentions(int numberOfUsers, vector<vector<string>>& events) {
        vector<int> online(numberOfUsers, 1);
        vector<int> ans(numberOfUsers, 0);
        vector<int> timestamp(numberOfUsers, -1);

        sort(events.begin(), events.end(), check);
        for(auto i: events){
            string type = i[0];
            int time = stoi(i[1]);
            for(int i=0;i<numberOfUsers;i++){
                if(!online[i] && time - timestamp[i]>=60){
                    online[i] = 1;
                }
            }
            if(type=="MESSAGE"){
                if(i[2]=="ALL"){
                    for(int i=0;i<numberOfUsers;i++){
                        ans[i]++;
                    }
                }else if(i[2]=="HERE"){
                    for(int i=0;i<numberOfUsers;i++){
                        if(online[i]){
                            ans[i]++;
                        }
                    }
                }else{
                    vector<int> ids = solve(i[2]);
                    for(int i: ids){
                        ans[i]++;
                    }
                }
            }else{
                int id = stoi(i[2]);
                online[id] = 0;
                timestamp[id] = time;
            }
        }
        return ans;
    }
};