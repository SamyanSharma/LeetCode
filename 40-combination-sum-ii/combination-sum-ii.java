class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, result, new ArrayList<>(), 0);
        return result;
    }

    private void helper(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> combination, int total){
        if(total == target){
            result.add(new ArrayList<>(combination));
            return;
        }
        if(total > target) return;
        for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i - 1]) continue;
            if(total + candidates[i] > target) break;
            combination.add(candidates[i]);
            helper(candidates, target, i + 1, result, combination, total + candidates[i]);
            combination.remove(combination.size() - 1);
        }
    }
}