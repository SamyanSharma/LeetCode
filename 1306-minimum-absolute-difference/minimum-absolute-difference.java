class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int minDifference = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length -1; i++){
            int diff = arr[i + 1] - arr[i];
            if(diff < minDifference){
                minDifference = diff;
                result.clear();
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
            else if(diff == minDifference){
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }
}