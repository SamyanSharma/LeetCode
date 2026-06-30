class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder newA = new StringBuilder(a);
        int i = 1;
        while(newA.length() < b.length()){
            newA.append(a);
            i++;
        }
        if(newA.toString().contains(b)){
            return i;
        }
        newA.append(a);
        if(newA.toString().contains(b)) return i + 1;
        return -1;
    }
}