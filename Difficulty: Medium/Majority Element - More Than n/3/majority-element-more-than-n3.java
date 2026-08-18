class Solution {
	public ArrayList<Integer> findMajority(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		
		int count1 = 0, count2 = 0;
		int ans1 = 0, ans2 = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if (count1 == 0 && ans2 != arr[i]) {
				ans1 = arr[i];
				count1 = 1;
			}
			else if (ans1 == arr[i]) {
				count1++;
			}
			else if (count2 == 0 && ans1 != arr[i]) {
				ans2 = arr[i];
				count2 = 1;
			}
			else if (ans2 == arr[i]) {
				count2++;
			}
			else {
				count1--;
				count2--;
			}
		}
		
		count1 = 0; count2 = 0;
		for (int x:arr) {
			if (x == ans1)
				count1++;
			else if (x == ans2)
				count2++;
		}
		
		if (count1>Math.floor(arr.length/3))
			list.add(ans1);
		
		if (count2>Math.floor(arr.length/3) && !list.contains(ans2))
			list.add(ans2);
			
		Collections.sort(list);
		
		return list;
		
	}
}
