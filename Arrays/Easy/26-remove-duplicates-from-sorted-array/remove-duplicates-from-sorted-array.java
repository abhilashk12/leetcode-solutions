class Solution {
    public int removeDuplicates(int[] arr) {
		
		int slow=0;
		
		for (int fast = 1; fast < arr.length; fast++) {
		    if (arr[fast] != arr[slow]) {
		        slow++;
		        arr[ slow ] = arr[ fast ];
		    }
		}
	return slow+1;
    }
}