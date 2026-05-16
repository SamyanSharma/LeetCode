class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer, Integer> count = new HashMap<>();
        int goodPairs = 0;
        for(int i: nums){
            int currentCount = count.getOrDefault(i, 0);
            goodPairs += currentCount;
            count.put(i, currentCount + 1);
        }
        return goodPairs;
    }
}