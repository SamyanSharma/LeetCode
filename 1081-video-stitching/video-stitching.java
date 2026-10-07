class Solution {
    public int videoStitching(int[][] clips, int time) {
        int result = 0;
        Arrays.sort(clips, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0, start = 0, end = 0; start < time; start = end, result++){
            for(; i < clips.length && clips[i][0] <= start; i++){
                end = Math.max(end, clips[i][1]);
            }
            if(start == end) return -1;
        }
        return result;
    }
}