class Solution {
	public int mostFreqEle(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int x:arr) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int maxFreq = 0;
		int answer = Integer.MIN_VALUE;
		
		// Find answer
		for (int x : map.keySet()) {
			if (map.get(x) > maxFreq || (map.get(x) == maxFreq && x > answer)) {
				maxFreq = map.get(x);
				answer = x;
			}
		}
		return answer;
	}
}
