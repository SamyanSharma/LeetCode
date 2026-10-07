class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs == null || pairs.length == 0) return 0;
        int result = 1;
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int prevEnd = pairs[0][1];
        for(int i = 1; i < pairs.length; i++){
            if(prevEnd < pairs[i][0]){
                result++;
                prevEnd = pairs[i][1];
            }
        }
        return result;
    }
}