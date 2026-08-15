class Solution {
    static long kthDigit(int a, int b, int k) {
        long res=(long) Math.pow(a,b);
        
        long digit=0;
        
        while(k>0){
            digit=res%10;
            res/=10;
            k--;
        }
        
        return (long) digit;
    }
}