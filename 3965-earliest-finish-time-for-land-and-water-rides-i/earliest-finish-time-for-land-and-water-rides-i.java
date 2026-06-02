class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int earliestFinish = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++){
            for(int j = 0; j < waterStartTime.length; j++){
                int finish1 = Math.max(landStartTime[i] + landDuration[i], waterStartTime[j]) + waterDuration[j];
                int finish2 = Math.max(waterStartTime[j] + waterDuration[j], landStartTime[i]) + landDuration[i];
                earliestFinish = Math.min(earliestFinish, Math.min(finish1, finish2));
            }
        }
        return earliestFinish;
    }
}