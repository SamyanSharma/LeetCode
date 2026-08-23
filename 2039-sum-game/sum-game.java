class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int count1 = 0, count2 = 0;
        int sum1 = 0, sum2 = 0;
        int mid = n / 2;
        for(int i = 0; i < n; i++){
            char c = num.charAt(i);
            if(i < mid){
                if(c == '?'){
                    count1++;
                }else{
                    sum1 += c - '0';
                }
            }else{
                if(c == '?'){
                    count2++;
                }else{
                    sum2 += c - '0';
                }
            }
        }
        if((count1 + count2) % 2 != 0){
            return true;
        }
        return (sum1 - sum2) != 9 * (count2 - count1) / 2;
    }
}