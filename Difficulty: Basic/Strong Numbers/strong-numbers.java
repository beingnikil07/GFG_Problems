class Solution {
    
    static int fact(int n){
        
        if(n==0||n==1){
            return 1;
        }
        
        int fact=1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        return fact;
    }
    
    public boolean isStrong(int n) {
         
         int sum=0;
         int temp=n;
         
         while(n>0){
             int digit=n%10;
             sum=sum+fact(digit);
             n/=10;
         }
        return sum==temp;
    }
}