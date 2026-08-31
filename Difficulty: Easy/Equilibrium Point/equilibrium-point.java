class Solution {
	public static int findEquilibrium(int arr[]) {
		
		int total_sum = 0;
		
		for (int x:arr) {
			total_sum += x;
		}
		
		int left_sum = 0;
		
		for (int i = 0; i<arr.length; i++) {
			int right_sum = total_sum - left_sum - arr[i];
			
			if (left_sum == right_sum) {
				return i;
			}
			
			left_sum += arr[i];
		}
		return - 1;
	}
}
