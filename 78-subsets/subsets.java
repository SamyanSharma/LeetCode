class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(0, nums, result, subset);
        return result;
    }

    public void helper(int i, int[] nums, List<List<Integer>> result, List<Integer> subset){
        if(i == nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        helper(i + 1, nums, result, subset);
        subset.remove(subset.size() - 1);
        helper(i + 1, nums, result, subset);
    }
}