class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++){
            int start = 0;
            int end = n - 1;
            while(start <= end){
                if(start == end){
                    image[i][start] = image[i][start] ^ 1;
                }
                else{
                    int temp = image[i][start] ^ 1;
                    image[i][start] = image[i][end] ^ 1;
                    image[i][end] = temp;
                }
                start++;
                end--;
            }
        }
        return image;
    }
}