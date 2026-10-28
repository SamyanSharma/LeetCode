class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        helper(n, new StringBuilder(), result);
        return result;
    }

    private void helper(int n, StringBuilder sb, List<String> result){
        if(sb.length() == n){
            result.add(sb.toString());
            return;
        }
        sb.append('1');
        helper(n, sb, result);
        sb.deleteCharAt(sb.length() - 1);
        if(sb.length() == 0 || sb.charAt(sb.length() - 1) != '0'){
            sb.append('0');
            helper(n, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}