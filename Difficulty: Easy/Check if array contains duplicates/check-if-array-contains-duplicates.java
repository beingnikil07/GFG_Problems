class Solution {
	public boolean checkDuplicates(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		// store all to Hashmap
		for(int x:arr){
		    if(map.containsKey(x)){
		        return true;
		    }
		    //otherwise
		    map.put(x,map.getOrDefault(x,0)+1);
		}
		
		return false;
	}
}
