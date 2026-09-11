class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] visited = new boolean[1000];
        int result = 0;
        for(int i = 0; i < digits.length; i++){
            if(digits[i] == 0) continue;
            for(int j = 0; j < digits.length; j++){
                if(j == i) continue;
                for(int k = 0; k < digits.length; k++){
                    if(k == i || k == j || digits[k] % 2 != 0) continue;
                    int x = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if(!visited[x]){
                        visited[x] = true;
                        result++;
                    }
                }
            }
        }
        return result;
    }
}