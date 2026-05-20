class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count = 0;
        int n = A.length;
        int result[] = new int[n];
        int seenSoFar[] = new int[n + 1];
        for(int i = 0; i < n; i++){
            seenSoFar[A[i]]++;
            if(seenSoFar[A[i]] == 2){
                count++;
            }

            seenSoFar[B[i]]++;
            if(seenSoFar[B[i]] == 2){
                count++;
            }
            result[i] = count;
        }
        return result;
    }
}