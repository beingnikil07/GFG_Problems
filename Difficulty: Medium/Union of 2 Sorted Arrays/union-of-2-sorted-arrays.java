class Solution {
	public static ArrayList<Integer> findUnion(int a[], int b[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		
		while (i<a.length && j<b.length) {
			int val;
			if (a[i] < b[j]) {
				val = a[i];
				i++;
			}
			else if (a[i]>b[j]) {
				val = b[j];
				j++;
			}
			else {
				// if both equal ,take any one a[i]==b[j]
				val = a[i];
				i++;
				j++;
			}
			
			// duplicate avoid
			if (list.isEmpty() || list.get(list.size() - 1) != val) {
				list.add(val);
			}
			
		}
		// remaining elements of a
		while (i < a.length) {
			if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
				list.add(a[i]);
			}
			i++;
		}
		
		// remaining elements of b
		while (j < b.length) {
			if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
				list.add(b[j]);
			}
			j++;
		}
		
		return list;
		
	}
}
