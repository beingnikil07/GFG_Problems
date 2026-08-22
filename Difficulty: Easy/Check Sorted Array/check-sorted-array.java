class Solution {
	public boolean isSorted(int[] arr) {
	       
	   if(arr.length==1){
	       return true;
	   }
	
	
		for (int i = 1; i<arr.length; i++) {
			if (arr[i]>=arr[i - 1]) {
				
			} else {
				return false;
			}
		}
		
		return true;
	}
}
