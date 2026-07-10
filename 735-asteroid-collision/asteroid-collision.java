class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i: asteroids){
            if(i > 0){
                s.push(i);
            } 
            else{
                while(!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(i)){
                    s.pop();
                }
                if(s.isEmpty() || s.peek() < 0){
                    s.push(i);
                }
                if(s.peek() == Math.abs(i)){
                    s.pop();
                }
            }
        }
        int[] result = new int[s.size()];
        for(int i = s.size() - 1; i >= 0; i--){
            result[i] = s.pop();
        }
        return result;
    }
}