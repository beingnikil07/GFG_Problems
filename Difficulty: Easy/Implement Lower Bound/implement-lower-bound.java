class Solution {
	int lowerBound(int[] arr, int target) {
		
		int low = 0;
		int high = arr.length - 1;
		int ans = arr.length;
		
		while (low <= high) {
			
			int mid = low + (high - low)/2;
			
			if (arr[mid] >= target) {
				ans = mid;
			}
			
			if (arr[mid]<target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}
}
