class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int numOfJewels = 0;
        Set<Character> set = new HashSet<>();
        for(char j: jewels.toCharArray()){
            set.add(j);
        }
        for(char s: stones.toCharArray()){
            if(set.contains(s)){
                numOfJewels++;
            }
        }
        return numOfJewels;
    }
}