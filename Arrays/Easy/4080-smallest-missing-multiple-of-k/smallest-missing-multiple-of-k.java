class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
            System.out.println(set);

        for(int i=k; i<=100+k; i+=k){
            System.out.println(i);
            if(!set.contains(i)){
                return i;
            }
        }
        return 1;
    }
}