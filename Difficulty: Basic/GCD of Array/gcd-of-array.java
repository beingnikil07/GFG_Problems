class Solution {
	public int gcd(int n, int arr[]) {
		// find minimum from the array
		int min = Integer.MAX_VALUE;
		for (int i = 0; i<n; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		
		// Check every possible GCD
		for (int i = min; i >= 0; i--) {
			boolean isGCD = true;
			
			for (int val:arr) {
				if (val%i != 0) {
					isGCD = false;
					break;
				}
			}
			
			if (isGCD == true) {
				return i;
			}
		}
		
		return 1;
	}
}
