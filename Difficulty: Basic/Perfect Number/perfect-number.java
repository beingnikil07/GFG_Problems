class Solution {
    
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    
    int isPerfect(int N) {
        int temp=N;
        int sum=0;
        while(N>0){
            sum=sum+fact(N%10);
            N=N/10;
        }
        if(temp==sum) return 1;
    
        return 0;
    }
}