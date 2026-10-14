class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<List<Integer>> result){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int n: nums){
                list.add(n);
            }
            result.add(list);
            return;
        }
        for(int i = index; i < nums.length; i++){
            swap(nums, index, i);
            backtrack(index + 1, nums, result);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}