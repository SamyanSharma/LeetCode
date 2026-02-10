class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String arr[] = s.split(" ");
        int n = arr.length;
        int result = arr[n-1].length();
        return result;
    }
}