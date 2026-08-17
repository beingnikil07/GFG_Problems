/*You are required to complete this function*/
class GfG {
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	void addFraction(int num1, int den1, int num2, int den2) {
		
		// Add fractions
		int num = num1 * den2 + num2 * den1;
		int den = den1 * den2;
		
		// Find GCD
		int g = gcd(num, den);
		
		// Reduce fraction
		num = num / g;
		den = den / g;
		
		System.out.println(num + "/" + den);
		
	}
}
