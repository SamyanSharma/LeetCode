class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] arr = s.split(" ");
        Stack<String> stack = new Stack<>();
        for(String a: arr){
            stack.push(a);
        }
        StringBuilder sb = new StringBuilder();
        int n = stack.size();
        for(int i = 0; i < n; i++){
            if(i == n - 1){
                sb.append(stack.pop());
            } else{
                sb.append(stack.pop() + " ");
            }
        }
        return sb.toString();
    }
}