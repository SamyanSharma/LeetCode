class Solution {
    public String convertDateToBinary(String date) {
        String[] postSplit = date.split("-");
        String year = Integer.toBinaryString(Integer.parseInt(postSplit[0]));
        String month = Integer.toBinaryString(Integer.parseInt(postSplit[1]));
        String day = Integer.toBinaryString(Integer.parseInt(postSplit[2]));

        return year + "-" + month + "-" + day;
    }
}