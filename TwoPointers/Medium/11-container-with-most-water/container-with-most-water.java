class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
		
		int left=0;
		int right=height.length-1;
		
		while(left<right) {
			int distance = Math.abs(left - right);
			int waterHeight = Math.min(height[left], height[right]);
			int waterArea = distance*waterHeight;
			maxWater = Math.max(maxWater, waterArea);
			
			if(height[left]<height[right]) {
				left++;
			}
			else {
			right--;
			}
		}
		return maxWater;
    }
}