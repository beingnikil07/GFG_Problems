class Solution {
    public int[] findSum(int n) {

        int evenCount = n / 2;
        
        int oddCount = (n + 1) / 2;

        int evenSum = evenCount * (evenCount + 1);
    
        int oddSum = oddCount * oddCount;

        return new int[]{oddSum,evenSum};
    }
}