class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefixes = new HashSet<>();
        for(int val: arr1){
            while(val > 0){
                prefixes.add(val);
                val /= 10;
            }
        }

        int longestLength = 0;
        for(int val: arr2){
            while(val > 0){
                if(prefixes.contains(val)){
                    int currentLength = String.valueOf(val).length();
                    longestLength = Math.max(currentLength, longestLength);
                    break;
                }
                val = val/10;
            }
        }
        return longestLength;
    }
}