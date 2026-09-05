class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }

        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                int currentSum = map.get(list2[i]) + i;

                if(currentSum < minSum){
                    minSum = currentSum;
                    list.clear();
                    list.add(list2[i]);
                }else if (currentSum == minSum) {
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[0]);
        
    }
}