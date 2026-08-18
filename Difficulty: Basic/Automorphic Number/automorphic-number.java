class Solution {
    public String isAutomorphic(int n) {
        int square = n * n;
        int temp = n;
        int divisor = 1;

        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        return square % divisor == n
                ? "Automorphic"
                : "Not Automorphic";
    }
}