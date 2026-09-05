class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                int currentSum = 0;
                if(list1[i].equals(list2[j])){
                    currentSum = i + j;

                    if (currentSum < minSum) {
                        minSum = currentSum;
                        result.clear();
                        result.add(list1[i]);
                    }
                    else if (currentSum == minSum) {
                        result.add(list1[i]);
                    }
                }
            }
        }
        return result.toArray(new String[0]);
    }
}