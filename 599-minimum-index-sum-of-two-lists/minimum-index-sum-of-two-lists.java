class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();
        for(int j = 0; j < list2.length; j++){
            String s = list2[j];
            if(map.containsKey(s)){
                int sum = j + map.get(s);
                if(sum < minSum){
                    minSum = sum;
                    result.clear();
                    result.add(s);
                }
                else if(sum == minSum){
                    result.add(s);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}