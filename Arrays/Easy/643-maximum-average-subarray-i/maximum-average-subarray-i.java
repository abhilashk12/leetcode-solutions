class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxSum = 0;

        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        System.out.println(sum);

        maxSum = sum;

        for(int right = k; right < nums.length; right++){
            sum = sum - nums[right - k] + nums[right];

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum/k;
    }
}