class Solution {
	public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		map.forEach((key, value)-> {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(key);
			temp.add(value);
			list.add(temp);
		});
		
		return list;
	}
	
}
