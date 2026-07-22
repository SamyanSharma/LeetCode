class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        int start = nums[0];
        int end = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1){
                end = nums[i];
            } else{
                if(start == end){
                    result.add(String.format("%d", start));
                } else{
                    result.add(String.format("%d->%d", start, end));
                }
                start = nums[i];
                end = nums[i];
            }
        }
        if(start == end){
            result.add(String.format("%d", start));
        }
        else{
            result.add(String.format("%d->%d", start, end));
        }
        return result;
    }
}