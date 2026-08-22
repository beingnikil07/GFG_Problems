class Solution {
	public ArrayList<Integer> topKFreq(int[] arr, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int x:arr) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		// sort elements by frequency
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		
		list.sort((a, b) -> {
			if (map.get(a).equals(map.get(b))) {
				return Integer.compare(b, a); // bigger number first
			}
			
			return Integer.compare(map.get(b), map.get(a)); // higher frequency first
		});
		
		// store top k frequent
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i<k; i++) {
			list2.add(list.get(i));
		}
		
		return list2;
	}
}
