class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentMass = mass;
        for(int i: asteroids){
            if(i <= currentMass){
                currentMass += i;
            }
            else{
                return false;
            }
        }
        return true;
    }
}