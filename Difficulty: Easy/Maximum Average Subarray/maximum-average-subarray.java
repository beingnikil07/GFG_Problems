class Solution {
	public int findMaxAverage(List<Integer> arr, int k) {
		double sum = 0;
		// first window
		for (int i = 0; i<k; i++) {
			sum = sum + arr.get(i);
		}
		
		double ans = sum/k;
	
		int idx = 0;
		for (int i = k; i<arr.size(); i++) {
			sum = sum + arr.get(i) - arr.get(i - k);
			ans = Math.max(ans, sum/k);
			
			if (sum/k >= ans) {
				idx = i-k+1;
			}
		}
		return idx;
	}
}
