class Bank {
public:
    vector<long long> bal;
    int n;
    
    Bank(vector<long long>& balance) {
        bal = balance;
        n = bal.size(); 
    }
    
    bool transfer(int account1, int account2, long long money) {
        int acc1 = account1 - 1;
        int acc2 = account2 - 1;
        
        if (account1 < 1 || account1 > n || account2 < 1 || account2 > n) {
            return false;
        }
        
        if (bal[acc1] < money) {
            return false;
        }
        
        bal[acc1] -= money;
        bal[acc2] += money;
        return true;
    }
    
    bool deposit(int account, long long money) {
        int acc = account - 1;
        
        if (account < 1 || account > n) {
            return false;
        }
        
        bal[acc] += money;
        return true;
    }
    
    bool withdraw(int account, long long money) {
        int acc = account - 1;
        
        if (account < 1 || account > n || bal[acc] < money) {
            return false;
        }
        
        bal[acc] -= money;
        return true;
    }
};