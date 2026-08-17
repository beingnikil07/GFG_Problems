class Solution {
	static long nthPosition(long n) {
		long pos=1;
		
		while(pos*2<=n){
		    pos=pos*2;
		    
		}
		return pos;
	}
}
