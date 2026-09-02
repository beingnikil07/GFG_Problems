class Solution {
	
	public static int firstOccurence(int arr[], int x) {
		int low = 0;
		int high = arr.length - 1;
		int f = -1;
		while (low <= high) {
			int mid = (low + high)/2;
			if (arr[mid] == x) {
				f = mid;
				high = mid - 1;
				
			}
			else if (arr[mid]>x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return f;
	}
	
	public static int lastOccurence(int arr[], int x) {
		int low = 0;
		int high = arr.length - 1;
		int l = -1;
		while (low <= high) {
			int mid = (low + high)/2;
			if (arr[mid] == x) {
				l = mid;
				low = mid + 1;
			}
			else if (arr[mid]<x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return l;
	}
	
	ArrayList<Integer> find(int arr[], int x) {
		int f=firstOccurence(arr,x);
		int l=lastOccurence(arr,x);
		
		return new ArrayList<>(Arrays.asList(f,l));
	}
}
