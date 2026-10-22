class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        helper(0, nums, result, subset);
        return result;
    }

    private void helper(int index, int[] nums, List<List<Integer>> result, List<Integer> subset){
        if(index == nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        helper(index + 1, nums, result, subset);
        subset.remove(subset.size() - 1);
        while(index + 1 < nums.length && nums[index] == nums[index + 1]) index++;
        helper(index + 1, nums, result, subset);
    }
}