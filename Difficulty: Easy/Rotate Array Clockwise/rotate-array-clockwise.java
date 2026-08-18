class Solution {
	
	public static void reverse(int arr[], int low, int end) {
		while (low < end) {
			int temp = arr[low];
			arr[low] = arr[end];
			arr[end] = temp;
			
			low++;
			end--;
		}
	}
	
	public void rotateclockwise(int[] arr, int k) {
		int n = arr.length;
		
		k = k % n;
		
		reverse(arr, 0, n - k - 1);
		reverse(arr, n - k, n - 1);
		reverse(arr, 0, n - 1);
	}
}
