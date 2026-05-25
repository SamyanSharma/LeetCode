class Solution {
    public int findClosest(int x, int y, int z) {
        int distX = Math.abs(z - x);
        int distY = Math.abs(z - y);
        if(distX < distY){
            return 1;
        }
        else if(distY < distX){
            return 2;
        }
        return 0;
    }
}