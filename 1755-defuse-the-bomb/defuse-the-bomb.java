class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if(k == 0) return result;
        int start = 1; 
        int end = k;
        int sum = 0;
        if(k < 0){
            start = code.length - Math.abs(k);
            end = code.length - 1;
        }
        for(int i = start; i <= end; i++) sum += code[i];
        for(int i = 0; i < code.length; i++){
            result[i] = sum;
            sum -= code[(start) % code.length];
            sum += code[(end + 1) % code.length];
            start++;
            end++;
        }
        return result;
    }
}