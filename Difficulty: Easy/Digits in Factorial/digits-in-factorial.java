class Solution {
    public int digitsInFactorial(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.log10(i);
        }

        return (int) Math.floor(sum) + 1;
        
    }
}
