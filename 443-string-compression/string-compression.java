class Solution {
    public int compress(char[] chars) {
        int i = 0, result = 0;
        while(i < chars.length){
            int groupLength = 1;
            while(i + groupLength < chars.length && chars[i + groupLength] == chars[i]){
                groupLength++;
            }
            chars[result++] = chars[i];
            if(groupLength > 1){
                for(char c: Integer.toString(groupLength).toCharArray()){
                    chars[result++] = c;
                }
            }
            i += groupLength;
        }
        return result;
    }
}