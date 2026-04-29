class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(s).reverse().toString();
        if(s.equals(reversed)){
            return true;
        }
        System.out.println(reversed);
        return false;
    }
}