class Solution {
    public String decodeString(String s) {
        if(s == null || s.length() == 0) return s;
        
        int currNum = 0;
        Stack<Integer> intStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c >= '0' && c <= '9'){
                currNum = (currNum * 10) + (c - '0');
            }
            else{
                if(c == '['){
                    intStack.push(currNum);
                    currNum = 0;
                    strStack.push(String.valueOf(c));
                }
                else if(c == ']'){
                    String temp = "";
                    while(!strStack.isEmpty() && !strStack.peek().equals("[")){
                        temp = strStack.pop() + temp;
                    }
                    strStack.pop();

                    int num = intStack.pop();
                    StringBuilder sb = new StringBuilder();
                    for(int i = 0; i < num; i++){
                        sb.append(temp);
                    }
                    strStack.push(sb.toString());
                }
                else{
                    strStack.push(String.valueOf(c));
                }
            }
        }
        String result = "";
        while(!strStack.isEmpty()){
            result = strStack.pop() + result;
        }
        return result;
    }
}