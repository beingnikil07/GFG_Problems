class Solution {
	int majorityElement(int arr[]) {
		int freq = 0;
		int ans = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if (freq == 0) {
				ans = arr[i];
				freq++;
			}
			else if (ans == arr[i]) {
				freq++;
			} else {
				freq--;
			}
		}
		
		int count = 0;
		for (int x:arr) {
			if (x == ans)
				count++;
		}
		
		if (count>arr.length/2)
			return ans;
		
		return - 1;
	}
}
