class Solution {
	int missingNum(int arr[]) {
		int sum = 0;
		for (int i = 1; i <= arr.length+1; i++) {
			sum += i;
		}
		
		// find array elements sum
		int arrSum = 0;
		for (int x:arr) {
			arrSum += x;
		}
		
		return sum - arrSum;
	}
}
