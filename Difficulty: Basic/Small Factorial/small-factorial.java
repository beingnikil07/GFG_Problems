class Solution {
    public long find_fact(int n) {
        long f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}