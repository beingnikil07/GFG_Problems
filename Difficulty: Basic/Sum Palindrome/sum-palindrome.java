class Solution {
	
	static boolean isPalindrome(int num) {
		
		int temp = num;
		int sum = 0;
		while (temp>0) {
			int digit = temp%10;
			sum = sum*10 + digit;
			temp /= 10;
		}
		
		return sum == num;
	}
	
	static int reverse(int num) {
		
		int rev = 0;
		while (num>0) {
			
			int digit = num%10;
			rev = rev*10 + digit;
			num /= 10;
		}
		return rev;
	}
	
	static int isSumPalindrome(int n) {
		
		int i = 1;
		
		while (i <= 6) {
			if (isPalindrome(n) == false) {
				int rev = reverse(n);
				// update n
				n = n + rev;
			} else {
				return n;
			}
			i++;
		}
		
		return - 1;
	}
}
