class Solution {
    public int sumOfGP(int n, int a, int r) {
 
        if(r==1){
            return n*a;
        }
 
        return (int) (a* (Math.pow(r,n) - 1)/(r-1));
        
    }
}