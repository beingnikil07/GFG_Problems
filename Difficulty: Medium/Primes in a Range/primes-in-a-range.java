class Solution {
	
	static boolean isPrime(int n) {
		
		if (n<2)
			return false;
			
		for (int i = 2; i<=Math.sqrt(n); i++) {
			if (n%i == 0)
				return false;
		}
		return true;
	}
	
	public List<Integer> primeRange(int l, int r) {
		
		ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=l;i<=r;i++){
            if(isPrime(i)==true){
                list.add(i);
            }
        }
        return list;
	}
}
