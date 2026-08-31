class Solution {
	public ArrayList<Integer> prefSum(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i<arr.length; i++) {
			arr[i] = arr[i]+arr[i - 1];
		}
		
		for (int num:arr) {
			list.add(num);
		}
		return list;
	}
}
