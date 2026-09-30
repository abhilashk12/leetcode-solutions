class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft=new int[nums.length];
        int[] sumRight=new int[nums.length];
        int[] prefix=new int[nums.length];

        prefix[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }


        for(int i=0;i<nums.length;i++){
            sumLeft[i] = (i == 0) ? 0 : prefix[i-1];
            sumRight[i] = prefix[nums.length-1] - prefix[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sumLeft[i]==sumRight[i]) return i;
        }
        
        return -1;
    }
}