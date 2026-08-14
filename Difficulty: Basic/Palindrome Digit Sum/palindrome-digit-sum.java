class Solution {
    
    static int digitSum(int x){
        
        int sum=0;
        while(x>0){
            int digit=x%10;
            sum=digit+sum;
            x=x/10;
        }
        return sum;
    }
    
    boolean isDigitSumPalindrome(int n) {
        int num=digitSum(n);
        
        int sum=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        return temp==sum;
    }
}