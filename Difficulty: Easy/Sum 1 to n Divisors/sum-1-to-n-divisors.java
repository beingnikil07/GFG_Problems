class Solution {
    public static long sumOfDivisors(long n) {
        long sum=0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                   sum=sum+j; 
                }
            }
        }
        return sum;
    }
}