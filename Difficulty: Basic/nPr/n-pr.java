class Solution {
    
    static long fact(int n){
        
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    
    
    public long nPr(int n, int r) {
        int x=n-r;
        
        return (long)(fact(n)/fact(x));
    }
}
