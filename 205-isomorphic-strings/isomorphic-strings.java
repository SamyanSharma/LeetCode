class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i), i);
            }
            if(!mapT.containsKey(t.charAt(i))){
                mapT.put(t.charAt(i), i);
            }
            if(!mapS.get(s.charAt(i)).equals(mapT.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}