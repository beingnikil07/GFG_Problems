class Solution {
	int factorial(int n) {
		int fact = 1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i+=1;
        }
        return fact;
	}
}
