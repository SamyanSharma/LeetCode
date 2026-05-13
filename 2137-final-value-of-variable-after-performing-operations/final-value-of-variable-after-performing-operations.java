class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(String o: operations){
            if(o.equals("++X") || o.equals("X++")){
                value++;
            }
            else{
                value--;
            }
        }
        return value;
    }
}