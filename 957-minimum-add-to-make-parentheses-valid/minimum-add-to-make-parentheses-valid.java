class Solution {
    public int minAddToMakeValid(String s) {
        int openNeeded = 0;
        int closeNeeded = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                closeNeeded++;
            }
            else{
                if(closeNeeded > 0){
                    closeNeeded--;
                }
                else{
                    openNeeded++;
                }
            }
        }
        return openNeeded + closeNeeded;
    }
}